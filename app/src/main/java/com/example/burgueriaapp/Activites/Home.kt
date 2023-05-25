package com.example.burgueriaapp.Activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.example.burgueriaapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase

    class Home : AppCompatActivity(){
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val bfin = findViewById<Button>(R.id.bFinanc)
        bfin.setOnClickListener {
            goFin()
        }

        val bcom = findViewById<Button>(R.id.bCompra)
        bcom.setOnClickListener {
            goComp()
        }

        val bpon = findViewById<Button>(R.id.bPonto)
        bpon.setOnClickListener {
            goPont()
        }

//        val btar = findViewById<Button>(R.id.bTarefa)
//        btar.setOnClickListener {
//            goTar()
//        }

            val deslog = findViewById<ImageButton>(R.id.bLogout)
            deslog.setOnClickListener {
                    FirebaseAuth.getInstance().signOut()
                    val desl = Intent(this, MainActivity::class.java)
                    startActivity(desl)
                    finish()
                }
        val badd = findViewById<ImageButton>(R.id.botAdd)
        badd.setOnClickListener {
            val addd =Intent(this,CadastroUser::class.java)
            startActivity(addd)
        }

//        val blout = findViewById<Button>(R.id.bLogout)
//        blout.setOnClickListener {
//
//        }


//        val database = FirebaseDatabase.getInstance()
//        val myRef = database.getReference("user/0/diasFalta/1/dia")
//
//            myRef.addListenerForSingleValueEvent(object : ValueEventListener {
//                override fun onDataChange(dataSnapshot: DataSnapshot) {
//                    // Verifica se o dado existe
//                    if (dataSnapshot.exists()) {
//                        // Obtém o valor do DataSnapshot
//                        val dia = dataSnapshot.getValue(String::class.java)
//
//                        // Faça o que desejar com o valor obtido
//                        Log.d("Firebase", "Valor do dia: $dia")
//                    } else {
//                        Log.d("Firebase", "O dado não existe")
//                    }
//                }
//
//                override fun onCancelled(databaseError: DatabaseError) {
//                    // Lidar com erros de leitura do Firebase
//                    Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
//                }
//            })
//        myRef.addValueEventListener(object : ValueEventListener{
//            override fun onDataChange(dataSnapshot: DataSnapshot){
////                val funcionarios = dataSnapshot.getValue(Funcionarios::class.java)
//                val func1 = dataSnapshot.getValue(String::class.java)
//                val x = findViewById<TextView>(R.id.bemVindo)
//                x.text = "bem vindo ${funcionarios?.nome}"
//
//            }
//        })
//            val x = findViewById<TextView>(R.id.bemVindo)
//            x.text = funcionarios?.nome

    }

    fun goFin() {
        val gooFin = Intent(this, Financeiro::class.java)

        startActivity(gooFin)
    }

    fun goComp() {
        val gooComp = Intent(this, Compras ::class.java)

        startActivity(gooComp)
    }
    fun goPont() {
        val gooPont = Intent(this, Ponto ::class.java)

        startActivity(gooPont)
    }
//    fun goTar() {
//        val gooTar = Intent(this, Tarefas ::class.java)
//
//        startActivity(gooTar)
//    }


}
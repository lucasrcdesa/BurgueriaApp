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



            val btar = findViewById<Button>(R.id.bTarefas)
            val bcom = findViewById<Button>(R.id.bCompra)
            val bfin = findViewById<Button>(R.id.bFinanc)
            val cons = findViewById<Button>(R.id.bConsumacao)
            val bpon = findViewById<Button>(R.id.bPonto)
            val badd = findViewById<ImageButton>(R.id.botAdd)
            val deslog = findViewById<ImageButton>(R.id.bLogout)

            val currentUser = FirebaseAuth.getInstance().currentUser
            val userId = currentUser?.uid

            // Ir para Tarefas ao clicar no botão
            btar.setOnClickListener {
                goTar()
            }

            // Ir para Compras ao clicar no botão
            bcom.setOnClickListener {
                goComp()
            }

            // Ir para Cadastro ao clicar no botão
            badd.setOnClickListener {
                val addd =Intent(this,CadastroUser::class.java)
                startActivity(addd)
            }

            // Deslogar ao clicar no botão
            deslog.setOnClickListener {
                FirebaseAuth.getInstance().signOut()
                val desl = Intent(this, MainActivity::class.java)
                startActivity(desl)
                finish()
            }

            // Ir para Consumação ao clicar no botão
            cons.setOnClickListener {
                val conss =Intent(this,ConsumacaoActivity::class.java)
                startActivity(conss)
            }


            if (userId == "Mu0fh5f94pPLlBG5PqYQylKHCX93"|| userId =="DAPQe2cQTIgIDz6SyRkgO8knZy62"){
                bfin.setOnClickListener {
                    goFin()
                }
            }
            else if (userId == "TqPz0AvBFyOIi08SUUu4HYzYnas1" || userId == "jrQk3pBq3BY3DfoHj5jaVczR6W63"){
                bfin.setOnClickListener {
                    goFinAdm()
                }
            }
            else {
                bfin.setOnClickListener {
                    goFreela()
                }
            }






            if (userId == "Mu0fh5f94pPLlBG5PqYQylKHCX93"|| userId =="DAPQe2cQTIgIDz6SyRkgO8knZy62"){
                bpon.setOnClickListener {
                    goPont()
                }
            }
            else if (userId == "TqPz0AvBFyOIi08SUUu4HYzYnas1" || userId == "jrQk3pBq3BY3DfoHj5jaVczR6W63"){
                bpon.setOnClickListener {
                    goPontAdm()
                }
            }
            else {
                bfin.setOnClickListener {
                    goPontFreela()
                }
            }

    }

    fun goFin() {
        val gooFin = Intent(this, Financeiro::class.java)

        startActivity(gooFin)
    }

        fun goFinAdm() {
            val gooFinAdm = Intent(this, FinanceiroAdmsActivity::class.java)

            startActivity(gooFinAdm)
        }

        fun goFreela() {
            val gooFin = Intent(this, FreelaFinanceiroActivity::class.java)

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
        fun goPontAdm() {
            val gooPontAdm = Intent(this, PontoAdmActivity ::class.java)

            startActivity(gooPontAdm)
        }
        fun goPontFreela() {
            val gooPont = Intent(this, PontoFreela ::class.java)

            startActivity(gooPont)
        }
    fun goTar() {
        val gooTar = Intent(this, Tarefas ::class.java)

        startActivity(gooTar)
    }


}
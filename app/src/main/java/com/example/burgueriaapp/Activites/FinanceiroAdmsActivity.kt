package com.example.burgueriaapp.Activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.example.burgueriaapp.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class FinanceiroAdmsActivity : AppCompatActivity() {
    private lateinit var getSalario: EditText
    private lateinit var getPassagem: EditText
    private lateinit var getAdicionais: EditText
    private lateinit var getServico: EditText
    private lateinit var hudRef: DatabaseReference
    private lateinit var alexRef: DatabaseReference
    private lateinit var database: FirebaseDatabase
    private lateinit var financeiroAdmRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financeiro_adms)
//
        val getBadm = findViewById<Button>(R.id.bAdm)

        getSalario = findViewById(R.id.salarioAdm)
        getPassagem = findViewById(R.id.passagemAdm)
        getAdicionais = findViewById(R.id.adicionaisAdm)
        getServico = findViewById(R.id.servicoAdm)


        database = FirebaseDatabase.getInstance()
        financeiroAdmRef = database.getReference("user/0/salario")

        getBadm.setOnClickListener {
            enviarFinAdm()
        }
    }

    fun enviarFinAdm() {
        val adicionarHud = findViewById<CheckBox>(R.id.hudAdm)
        val adicionarAlex = findViewById<CheckBox>(R.id.alexAdm)
        if (getSalario == null || getPassagem == null || getAdicionais == null || getServico == null) {
            Toast.makeText(
                this,
                "Adicione todos os campos para enviar",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            if (adicionarHud.isChecked) {
                val hudsonRef = financeiroAdmRef.child("2")

                hudsonRef.child("salario").setValue(getSalario)
                hudsonRef.child("passagem").setValue(getPassagem)
                hudsonRef.child("adicionais").setValue(getAdicionais)
                hudsonRef.child("servico").setValue(getServico)

                Toast.makeText(
                    this@FinanceiroAdmsActivity,
                    "Valor adicionado",
                    Toast.LENGTH_SHORT
                ).show()


                fun onCancelled(databaseError: DatabaseError) {
                    Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
                }
            } else if (adicionarAlex.isChecked) {
                val AlexRef = financeiroAdmRef.child("1")

                AlexRef.child("salario").setValue(getSalario)
                AlexRef.child("passagem").setValue(getPassagem)
                AlexRef.child("adicionais").setValue(getAdicionais)
                AlexRef.child("servico").setValue(getServico)

                Toast.makeText(
                    this@FinanceiroAdmsActivity,
                    "Valor adicionado",
                    Toast.LENGTH_SHORT
                ).show()

                fun onCancelled(databaseError: DatabaseError) {
                    Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
                }
            }
        }
    }
}
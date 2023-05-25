package com.example.burgueriaapp.Activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.burgueriaapp.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import androidx.core.content.ContextCompat

class Financeiro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financeiro)


        val database = FirebaseDatabase.getInstance()
        val mySalario = database.getReference("user/0/salario/1/salario")
        val myVale = database.getReference("user/0/salario/1/vale")
        val myConsumacao = database.getReference("user/0/salario/1/consumacao")
        val myPassagem = database.getReference("user/0/salario/1/passagem")
        val myServico = database.getReference("user/0/salario/1/taxa_servico")
        val myAdicionais = database.getReference("user/0/salario/1/adicionais")


        val salarioo = findViewById<TextView>(R.id.salario)
        val servicoo = findViewById<TextView>(R.id.servico)
        val valee = findViewById<TextView>(R.id.vale)
        val consumacaoo = findViewById<TextView>(R.id.consumacao)
        val passagem = findViewById<TextView>(R.id.passagem)
        val adicionaiss = findViewById<TextView>(R.id.adicionais)
        val aReceberr = findViewById<TextView>(R.id.aReceber)
        val anteriorr = findViewById<TextView>(R.id.resultadoAnterior)
//        val textoSalarioo = findViewById<TextView>(R.id.salarioTexto)
//        val textoVale = findViewById<TextView>(R.id.vale)
//        val textoServico = findViewById<TextView>(R.id.servicoTexto)
//        val textoadicionaiss = findViewById<TextView>(R.id.adicionaisTexto)
//        val textoPassagem = findViewById<TextView>(R.id.passagemTexto)
//        val textoConsumacao = findViewById<TextView>(R.id.textoConsumacao)
//        val textoAnteriorr = findViewById<TextView>(R.id.textoAnterior)
//        val textoReceberr = findViewById<TextView>(R.id.textoAreceber)


        trocaTexto(mySalario, salarioo)
        trocaTexto(myServico, servicoo)
        trocaTexto(myVale, valee)
        trocaTexto(myConsumacao, consumacaoo)
        trocaTexto(myPassagem, passagem)
        trocaTexto(myAdicionais, adicionaiss)



    }

    }
    private fun trocaTexto(myRef: DatabaseReference, textView: TextView) {
        myRef.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    val value = dataSnapshot.getValue(String::class.java)
                    textView.text = value
                } else {
                    Log.d("Firebase", "O dado não existe")
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
            }
        })
    }


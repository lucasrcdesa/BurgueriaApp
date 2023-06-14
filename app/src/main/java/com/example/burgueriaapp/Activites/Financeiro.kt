package com.example.burgueriaapp.Activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.burgueriaapp.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import androidx.core.content.ContextCompat
import com.google.firebase.auth.FirebaseAuth

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
        val passagemm = findViewById<TextView>(R.id.passagem)
        val adicionaiss = findViewById<TextView>(R.id.adicionais)
        val aReceberr = findViewById<TextView>(R.id.aReceber)
        val anteriorr = findViewById<TextView>(R.id.resultadoAnterior)

        val currentUser = FirebaseAuth.getInstance().currentUser
        val userId = currentUser?.uid
        if (userId == "Mu0fh5f94pPLlBG5PqYQylKHCX93") {
            val refData = database.getReference("user/0/salario/1")
            refData.addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    if (dataSnapshot.exists()) {
                        val salario = dataSnapshot.child("salario").getValue(Double::class.java)
                        val taxaServico = dataSnapshot.child("taxa_servico").getValue(Double::class.java)
                        val vale = dataSnapshot.child("vale").getValue(Double::class.java)
                        val consumacao = dataSnapshot.child("consumacao").getValue(Double::class.java)
                        val passagem = dataSnapshot.child("passagem").getValue(Double::class.java)
                        val adicionais = dataSnapshot.child("adicionais").getValue(Double::class.java)
                        val anterior = dataSnapshot.child("anterior").getValue(Double::class.java)

                        salarioo.text = salario.toString()
                        servicoo.text = taxaServico.toString()
                        valee.text = vale.toString()
                        consumacaoo.text = consumacao.toString()
                        passagemm.text = passagem.toString()
                        adicionaiss.text = adicionais.toString()
                        anteriorr.text = anterior.toString()
                        aReceberr.text = (salario!! + taxaServico!! - vale!! + passagem!! + adicionais!! - consumacao!! + anterior!!).toString()
                    }
                    else {
                        Toast.makeText(this@Financeiro,"deu ruim",Toast.LENGTH_LONG).show()
                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
                }
            })
        }
        else if (userId == "DAPQe2cQTIgIDz6SyRkgO8knZy62") {
            val refData = database.getReference("user/0/salario/2")
            refData.addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    if (dataSnapshot.exists()) {
                        val salario = dataSnapshot.child("salario").getValue(Double::class.java)
                        val taxaServico = dataSnapshot.child("taxa_servico").getValue(Double::class.java)
                        val vale = dataSnapshot.child("vale").getValue(Double::class.java)
                        val consumacao = dataSnapshot.child("consumacao").getValue(Double::class.java)
                        val passagem = dataSnapshot.child("passagem").getValue(Double::class.java)
                        val adicionais = dataSnapshot.child("adicionais").getValue(Double::class.java)
                        val anterior = dataSnapshot.child("anterior").getValue(Double::class.java)

                        salarioo.text = salario.toString()
                        servicoo.text = taxaServico.toString()
                        valee.text = vale.toString()
                        consumacaoo.text = consumacao.toString()
                        passagemm.text = passagem.toString()
                        adicionaiss.text = adicionais.toString()
                        anteriorr.text = anterior.toString()
                        aReceberr.text = (salario!! + taxaServico!! - vale!! + passagem!! + adicionais!! - consumacao!! + anterior!!).toString()

                    }
                    else {
                        Toast.makeText(this@Financeiro,"deu ruim",Toast.LENGTH_LONG).show()
                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
                }
            })
        }
    }
}
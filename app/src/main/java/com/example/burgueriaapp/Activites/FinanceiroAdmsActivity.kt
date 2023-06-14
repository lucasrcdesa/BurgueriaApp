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

        val salario = getSalario.text.toString()
        val passagem = getPassagem.text.toString()
        val adicionais = getAdicionais.text.toString()
        val servico = getServico.text.toString()

        if (salario.isEmpty() || passagem.isEmpty() || adicionais.isEmpty() || servico.isEmpty()) {
            Toast.makeText(
                this,
                "Adicione todos os campos para enviar",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            val salarioDouble = salario.toDouble()
            val passagemDouble = passagem.toDouble()
            val adicionaisDouble = adicionais.toDouble()
            val servicoDouble = servico.toDouble()

            if (adicionarHud.isChecked) {
                val hudsonRef = financeiroAdmRef.child("2")

                hudsonRef.child("salario").setValue(salarioDouble)
                hudsonRef.child("passagem").setValue(passagemDouble)
                hudsonRef.child("adicionais").setValue(adicionaisDouble)
                hudsonRef.child("servico").setValue(servicoDouble)

                Toast.makeText(
                    this@FinanceiroAdmsActivity,
                    "Valor adicionado",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (adicionarAlex.isChecked) {
                val AlexRef = financeiroAdmRef.child("1")

                AlexRef.child("salario").setValue(salarioDouble)
                AlexRef.child("passagem").setValue(passagemDouble)
                AlexRef.child("adicionais").setValue(adicionaisDouble)
                AlexRef.child("servico").setValue(servicoDouble)

                Toast.makeText(
                    this@FinanceiroAdmsActivity,
                    "Valor adicionado",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
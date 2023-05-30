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

class   Ponto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ponto)

        val database = FirebaseDatabase.getInstance()
        val myfaltas = database.getReference("user/0/funcionarios/1/faltas")
        val myAtestado = database.getReference("user/0/funcionarios/1/atestado")
        val myBanco = database.getReference("user/0/funcionarios/1/banco_h")

        val faltass = findViewById<TextView>(R.id.faltas)
        val atestadoo = findViewById<TextView>(R.id.atestado)
        val bancoo = findViewById<TextView>(R.id.bancoHoras)

        trocaTexto(myfaltas, faltass)
        trocaTexto(myAtestado, atestadoo)
        trocaTexto(myBanco, bancoo)

    }
    private fun trocaTexto(myRef: DatabaseReference, textView: TextView) {
        myRef.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    val value = dataSnapshot.getValue(Double::class.java)
                    textView.text = value.toString()
                } else {
                    Log.d("Firebase", "O dado não existe")
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
            }
        })
    }
}
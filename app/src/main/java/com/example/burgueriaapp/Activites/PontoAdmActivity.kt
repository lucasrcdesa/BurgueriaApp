package com.example.burgueriaapp.Activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.burgueriaapp.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class PontoAdmActivity : AppCompatActivity() {
    private lateinit var getFaltas: EditText
    private lateinit var getAtestado: EditText
    private lateinit var getBanco: EditText
    private lateinit var hudRef: DatabaseReference
    private lateinit var alexRef: DatabaseReference
    private lateinit var database: FirebaseDatabase
    private lateinit var pontoAdmRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ponto_adm)

        val bHudFaltas = findViewById<Button>(R.id.enviarFaltasH)
        val bAlexFaltas = findViewById<Button>(R.id.enviarFaltasA)
        val bHudAtestado = findViewById<Button>(R.id.enviarAtestadosH)
        val bAlexAtestado = findViewById<Button>(R.id.enviarAtestadosA)
        val bHudBanco = findViewById<Button>(R.id.enviarBancoH)
        val bAlexBanco = findViewById<Button>(R.id.enviarBancoA)

        bHudFaltas.setOnClickListener {
            enviarFaltasHud()
        }
        bAlexFaltas.setOnClickListener {
            enviarFaltasAlex()
        }
        bHudAtestado.setOnClickListener {
            enviarAtestadoHud()
        }
        bAlexAtestado.setOnClickListener {
            enviarAtestadoAlex()
        }
        bHudBanco.setOnClickListener {
            enviarBancoHud()
        }
        bAlexBanco.setOnClickListener {
            enviarBancoAlex()
        }

        getFaltas = findViewById(R.id.faltasAdm)
        getAtestado = findViewById(R.id.atestadoAdm)
        getBanco = findViewById(R.id.bancoAdm)

        database = FirebaseDatabase.getInstance()
        pontoAdmRef = database.getReference("user/0/funcionarios")


    }

    fun enviarFaltasHud() {
        val hudsonRef = pontoAdmRef.child("2")
        val hudsonRefF = hudsonRef.child("faltas")
        val faltasHud = getFaltas.text.toString().toDouble()

        hudsonRefF.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val faltasAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                val novoFaltas = faltasAnterior + faltasHud
                hudsonRefF.setValue(novoFaltas)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
            }
        })

        Toast.makeText(
            this@PontoAdmActivity,
            "Valor adicionado",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun enviarFaltasAlex() {
        val hudsonRef = pontoAdmRef.child("1")
        val hudsonRefF = hudsonRef.child("faltas")
        val faltasHud = getFaltas.text.toString().toDouble()

        hudsonRefF.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val faltasAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                val novoFaltas = faltasAnterior + faltasHud
                hudsonRefF.setValue(novoFaltas)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
            }
        })

        Toast.makeText(
            this@PontoAdmActivity,
            "Valor adicionado",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun enviarAtestadoHud() {
        val hudsonRef = pontoAdmRef.child("2")
        val hudsonRefF = hudsonRef.child("atestado")
        val faltasHud = getAtestado.text.toString().toDouble()

        hudsonRefF.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val faltasAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                val novoFaltas = faltasAnterior + faltasHud
                hudsonRefF.setValue(novoFaltas)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
            }
        })

        Toast.makeText(
            this@PontoAdmActivity,
            "Valor adicionado",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun enviarAtestadoAlex() {
        val hudsonRef = pontoAdmRef.child("1")
        val hudsonRefF = hudsonRef.child("atestado")
        val faltasHud = getAtestado.text.toString().toDouble()

        hudsonRefF.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val faltasAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                val novoFaltas = faltasAnterior + faltasHud
                hudsonRefF.setValue(novoFaltas)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
            }
        })

        Toast.makeText(
            this@PontoAdmActivity,
            "Valor adicionado",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun enviarBancoHud() {
        val hudsonRef = pontoAdmRef.child("2")
        val hudsonRefF = hudsonRef.child("banco_h")
        val faltasHud = getBanco.text.toString().toDouble()

        hudsonRefF.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val faltasAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                val novoFaltas = faltasAnterior + faltasHud
                hudsonRefF.setValue(novoFaltas)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
            }
        })

        Toast.makeText(
            this@PontoAdmActivity,
            "Valor adicionado",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun enviarBancoAlex() {
        val hudsonRef = pontoAdmRef.child("1")
        val hudsonRefF = hudsonRef.child("banco_h")
        val faltasHud = getBanco.text.toString().toDouble()

        hudsonRefF.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val faltasAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                val novoFaltas = faltasAnterior + faltasHud
                hudsonRefF.setValue(novoFaltas)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
            }
        })

        Toast.makeText(
            this@PontoAdmActivity,
            "Valor adicionado",
            Toast.LENGTH_SHORT
        ).show()
    }
}
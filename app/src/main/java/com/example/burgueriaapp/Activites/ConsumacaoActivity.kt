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

class ConsumacaoActivity : AppCompatActivity() {
    private lateinit var getValor: EditText
    private lateinit var getIdConsumo1: CheckBox
    private lateinit var getIdConsumo2: CheckBox
    private lateinit var tipoVale: CheckBox
    private lateinit var tipoConsumo: CheckBox
    private lateinit var database: FirebaseDatabase
    private lateinit var consumoRef: DatabaseReference
    private lateinit var valeRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumacao)

        getValor = findViewById(R.id.valorC)
        getIdConsumo1 = findViewById(R.id.hudConsumiu)
        getIdConsumo2 = findViewById(R.id.alexConsumiu)
        tipoVale = findViewById(R.id.foiVale)
        tipoConsumo = findViewById(R.id.foiConsumo)

        database = FirebaseDatabase.getInstance()
        consumoRef = database.getReference("user/0/salario")


        val getConsumo = findViewById<Button>(R.id.bEnviarConsumo)

        getConsumo.setOnClickListener {
            enviarConsumo()
        }
    }

    fun enviarConsumo() {
        val valorConsumo: String = getValor.text.toString().trim()

        val hudsonConsumiu: Boolean = getIdConsumo1.isChecked
        val alexConsumiu: Boolean = getIdConsumo2.isChecked
        val foiVale: Boolean = tipoVale.isChecked
        val foiConsumo: Boolean = tipoConsumo.isChecked

        if ((hudsonConsumiu && alexConsumiu) || (foiVale && foiConsumo)) {
            Toast.makeText(
                this,
                "Selecione apenas um funcionário ou um método de consumo",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            if (hudsonConsumiu) {
                val hudsonRef = consumoRef.child("2")
                val hudRefV = database.getReference("user/0/salario/2/vale")
                val hudRefC = database.getReference("user/0/salario/2/consumacao")
                if (foiConsumo) {
                    hudRefC.addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            val consumoAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                            val novoConsumo = valorConsumo.toDouble() + consumoAnterior
                            hudsonRef.child("consumacao").setValue(novoConsumo)

                            Toast.makeText(
                                this@ConsumacaoActivity,
                                "Valor adicionado",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                        override fun onCancelled(databaseError: DatabaseError) {
                            Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
                        }
                    })
                }
                if (foiVale) {
                    hudRefV.addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            val valeAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                            val novoVale = valorConsumo.toDouble() + valeAnterior
                            hudsonRef.child("vale").setValue(novoVale)

                            Toast.makeText(
                                this@ConsumacaoActivity,
                                "Valor adicionado",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                        override fun onCancelled(databaseError: DatabaseError) {
                            Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
                        }
                    })
                }
            }
            if (alexConsumiu) {
                val alexRefV = database.getReference("user/0/salario/1/vale")
                val alexRefC = database.getReference("user/0/salario/1/consumacao")

                val alexRef = consumoRef.child("1")
                if (foiConsumo) {
                    alexRefC.addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            val consumoAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                            val novoConsumo = valorConsumo.toDouble() + consumoAnterior
                            alexRef.child("consumacao").setValue(novoConsumo)

                            Toast.makeText(
                                this@ConsumacaoActivity,
                                "Valor adicionado",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                        override fun onCancelled(databaseError: DatabaseError) {
                            Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
                        }
                    })
                }
                if (foiVale) {
                    alexRefV.addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            val valeAnterior = dataSnapshot.getValue(Double::class.java) ?: 0.0
                            val novoVale = valorConsumo.toDouble() + valeAnterior
                            alexRef.child("vale").setValue(novoVale)

                            Toast.makeText(
                                this@ConsumacaoActivity,
                                "Valor adicionado",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                        override fun onCancelled(databaseError: DatabaseError) {
                            Log.e("Firebase", "Erro ao ler dados: ${databaseError.message}")
                        }
                    })
                }
            }
        }
    }
}

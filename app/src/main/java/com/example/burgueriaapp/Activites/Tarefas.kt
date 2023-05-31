package com.example.burgueriaapp.Activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.util.Log
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import com.example.burgueriaapp.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Tarefas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_tarefas)
        val database = FirebaseDatabase.getInstance()
        val getLista = database.getReference("user/0/tarefas/1/em_falta")
        val getCopos = database.getReference("user/0/tarefas/2/em_falta")
        val getInterior = database.getReference("user/0/tarefas/3/em_falta")
        val getPia  = database.getReference("user/0/tarefas/4/em_falta")
        val getTrocaS = database.getReference("user/0/tarefas/5/em_falta")
        val getLixo = database.getReference("user/0/tarefas/6/em_falta")
        val getCardapio = database.getReference("user/0/tarefas/7/em_falta")
        val getMesas = database.getReference("user/0/tarefas/8/em_falta")
        val getCaixas = database.getReference("user/0/tarefas/9/em_falta")
        val getBalcao = database.getReference("user/0/tarefas/10/em_falta")
        val getKet = database.getReference("user/0/tarefas/11/em_falta")
        val getPraca = database.getReference("user/0/tarefas/12/em_falta")
        val getBanheiro = database.getReference("user/0/tarefas/13/em_falta")
        val getGelar = database.getReference("user/0/tarefas/14/em_falta")
        val getCamisinha = database.getReference("user/0/tarefas/15/em_falta")
        val getPorcionar = database.getReference("user/0/tarefas/16/em_falta")
        val getValidade = database.getReference("user/0/tarefas/17/em_falta")
        val getLouca = database.getReference("user/0/tarefas/18/em_falta")
        val getCozinha = database.getReference("user/0/tarefas/19/em_falta")
        val getTabuas = database.getReference("user/0/tarefas/20/em_falta")
        val getOleo = database.getReference("user/0/tarefas/21/em_falta")
        val getGeladeira = database.getReference("user/0/tarefas/22/em_falta")

        val checkBoxLista = findViewById<CheckBox>(R.id.lista1)
        val checkBoxCopos = findViewById<CheckBox>(R.id.copos2)
        val checkBoxInterior = findViewById<CheckBox>(R.id.interior3)
        val checkBoxPia = findViewById<CheckBox>(R.id.pia4)
        val checkBoxTroca = findViewById<CheckBox>(R.id.troca5)
        val checkBoxLixo = findViewById<CheckBox>(R.id.lixos6)
        val checkBoxCardapio = findViewById<CheckBox>(R.id.cardapio7)
        val checkBoxMesas = findViewById<CheckBox>(R.id.mesas8)
        val checkBoxCaixas = findViewById<CheckBox>(R.id.caixas9)
        val checkBoxBalcao = findViewById<CheckBox>(R.id.balcao10)
        val checkBoxKet = findViewById<CheckBox>(R.id.ket11)
        val checkBoxPraca = findViewById<CheckBox>(R.id.praca12)
        val checkBoxBanheiro = findViewById<CheckBox>(R.id.banheiro13)
        val checkBoxGelar = findViewById<CheckBox>(R.id.gelar14)
        val checkBoxCamisinha = findViewById<CheckBox>(R.id.camisinhas15)
        val checkBoxPorcionar = findViewById<CheckBox>(R.id.porcionar16)
        val checkBoxValidade = findViewById<CheckBox>(R.id.validade17)
        val checkBoxLouca = findViewById<CheckBox>(R.id.louca18)
        val checkBoxCozinha = findViewById<CheckBox>(R.id.cozinha19)
        val checkBoxTabuas = findViewById<CheckBox>(R.id.tabuas20)
        val checkBoxOleo = findViewById<CheckBox>(R.id.Toleo21)
        val checkBoxGeladeira = findViewById<CheckBox>(R.id.geladeira22)

        val mapTar = mapOf(
            getLista to checkBoxLista,
            getCopos to checkBoxCopos,
            getInterior to checkBoxInterior,
            getPia to checkBoxPia,
            getTrocaS to checkBoxTroca,
            getLixo to checkBoxLixo,
            getCardapio to checkBoxCardapio,
            getMesas to checkBoxMesas,
            getCaixas to checkBoxCaixas,
            getBalcao to checkBoxBalcao,
            getKet to checkBoxKet,
            getPraca to checkBoxPraca,
            getBanheiro to checkBoxBanheiro,
            getGelar to checkBoxGelar,
            getCamisinha to checkBoxCamisinha,
            getPorcionar to checkBoxPorcionar,
            getValidade to checkBoxValidade,
            getLouca to checkBoxLouca,
            getCozinha to checkBoxCozinha,
            getTabuas to checkBoxTabuas,
            getOleo to checkBoxOleo,
            getGeladeira to checkBoxGeladeira
        )
        fun pegarFirebase(checkBox: CheckBox, databaseReference: DatabaseReference) {
            checkBox.setOnClickListener {
                val isChecked = checkBox.isChecked
                databaseReference.setValue(isChecked)
                    .addOnSuccessListener {
                        Toast.makeText(
                            applicationContext,
                            "Valor atualizado com sucesso!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    .addOnFailureListener { error ->
                        Toast.makeText(
                            applicationContext,
                            "Erro ao atualizar o valor: ${error.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
            }

            databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    // Verifica se o dado existe
                    if (dataSnapshot.exists()) {
                        // Obtém o valor do DataSnapshot
                        val isChecked = dataSnapshot.getValue(Boolean::class.java)
                        checkBox.isChecked = isChecked ?: false
                    }
                    //                    else {
//                        Toast.makeText(applicationContext, "O dado não existe", Toast.LENGTH_SHORT)
//                            .show()
//                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    // Lidar com erros de leitura do Firebase
                    Toast.makeText(
                        applicationContext,
                        "Erro ao ler dados: ${databaseError.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })

        }
        for ((getRef, checkBox) in mapTar) {
            pegarFirebase(checkBox, getRef)
        }


}

}
package com.example.burgueriaapp.Activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.burgueriaapp.Classes.Usuarios
import com.example.burgueriaapp.DAO.ConfiguracaoFireB
import com.example.burgueriaapp.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtMail = findViewById<EditText>(R.id.emailLogin)
        val edtasenha = findViewById<EditText>(R.id.senhaLogin)
        val bLogin = findViewById<Button>(R.id.botaoLogin)
        val usuario = Usuarios()

        if (usuarioLogado() ) {
        val gooHome = Intent(this,Home::class.java)
        }
        bLogin.setOnClickListener {
            if (edtMail.text.toString().isEmpty() || edtasenha.text.toString().isEmpty()) {
                Toast.makeText(this, "Preencha os campos", Toast.LENGTH_SHORT).show()
            } else {
//            usuario = Usuarios()
                usuario.setEmailUsu(edtMail.text.toString())
                usuario.setSenhaUsu(edtasenha.text.toString())

                validarLogin(usuario)
            }

        }

    }

    fun validarLogin(usuario: Usuarios) {

        val autenticacao = ConfiguracaoFireB.getFirebaseAuth()
        autenticacao.signInWithEmailAndPassword(usuario.emailUsu, usuario.senhaUsu)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "Bem vindo. Carregando...", Toast.LENGTH_SHORT).show()

                    val gooHome = Intent(this, Home::class.java)

                    startActivity(gooHome)
                } else {
                    Toast.makeText(this, "Usuário ou login incorretos", Toast.LENGTH_SHORT).show()
                }

            }
    }
    fun usuarioLogado (): Boolean{
        val user : FirebaseUser? = FirebaseAuth.getInstance().getCurrentUser()
        if(user != null){
            return true
        }
        return false
    }
}







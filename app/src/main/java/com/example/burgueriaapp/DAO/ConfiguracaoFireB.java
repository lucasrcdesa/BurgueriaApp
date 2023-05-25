package com.example.burgueriaapp.DAO;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfiguracaoFireB {
    private static DatabaseReference referenciaFireBase;
    private static FirebaseAuth autenticacao;
    public static DatabaseReference getFirebase(){
        if (referenciaFireBase == null){
            referenciaFireBase = FirebaseDatabase.getInstance().getReference();
        }
        return referenciaFireBase;
    }
    public static FirebaseAuth getFirebaseAuth(){
        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;

    }
}

package com.teste.slider.Config;

import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Configuracao {

    private static FirebaseAuth autenticacao;

    // retorna a instancia do editText
    public static FirebaseAuth getAutenticacao(){

        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;


    }
}

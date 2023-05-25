package com.example.burgueriaapp.Classes;

public class Usuarios {
    private String  nomeUsu;
    private String emailUsu;
    private String tipoUsu;

    private String SenhaUsu;

    public String getSenhaUsu() {
        return SenhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        SenhaUsu = senhaUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getTipoUsu() {
        return tipoUsu;
    }

    public void setTipoUsu(String tipoUsu) {
        this.tipoUsu = tipoUsu;
    }
}

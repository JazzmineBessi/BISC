package com.example.bisc;

public class User {
    public String login ;
    public String MDP ;

    public User(String login, String MDP) {
        this.login = login;
        this.MDP = MDP;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMDP() {
        return MDP;
    }

    public void setMDP(String MDP) {
        this.MDP = MDP;
    }
}

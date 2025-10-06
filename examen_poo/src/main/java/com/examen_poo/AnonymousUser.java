package com.examen_poo;

public class AnonymousUser extends Users {

    public AnonymousUser(int ID) {
        super(ID);
    }

    @Override
    public void showDataUser() {
        System.out.println("L'utilisateur est anonyme");
    }
    
}

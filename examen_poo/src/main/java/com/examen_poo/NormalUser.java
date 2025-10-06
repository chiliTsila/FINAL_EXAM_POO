package com.examen_poo;

public class NormalUser extends Users {
    private String firsName;
    private String lastName;
    private String email;

    public NormalUser(int ID , String firsName, String lastName, String email) {
        super(ID);
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public String getFirsName() {
        return firsName;
    }

    @Override
    public void showDataUser() {
        System.out.println("les informations sur l'utilisateur: " + firsName + " " + lastName + " "+ email);
    }
}

package com.examen_poo;

public class NormalUser extends Users {
    private String firstName;
    private String lastName;
    private String email;

    public NormalUser(int ID , String firsName, String lastName, String email) {
        super(ID);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public String getFirsName() {
        return firstName;
    }

    @Override
    public void showDataUser() {
        System.out.println("les informations sur l'utilisateur: " + firstName + " " + lastName + " "+ email);
    }

}

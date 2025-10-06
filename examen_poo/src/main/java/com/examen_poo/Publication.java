package com.examen_poo;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private int ID;
    private Users author;
    private List<Messages> messages;

    public Publication(int ID, String content, Users author) {
    this.ID = ID;
    this.author = author;
    this.messages = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }
    public Users getAuthor() {
        return author;
    }
    
    public void showDataPublication() {
        System.out.println("Les informations sur la publication: " + ID);
        author.showDataUser();
    }

    public void addMessage(Messages message) {
        messages.add(message);
    }

    public void showMessageAuthors() {
        System.out.println("Auteurs des messages dans la publication " + ID + ":");
        for (Messages msg : messages) {
            msg.getAuthor().showDataUser();
        }
    }


}

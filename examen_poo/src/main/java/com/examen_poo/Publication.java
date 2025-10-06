package com.examen_poo;

import java.util.List;

public class Publication {
    private int ID;
    private Users author;
    private List<Messages> messages;

    public Publication(int ID, String content, Users author) {
        this.ID = ID;
        this.author = author;
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

}

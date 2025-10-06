package com.examen_poo;

public class Messages {
    private int ID;
    private String content;
    private Users author;
    private Publication publication;

    public Messages(int ID, String content, Users author, Publication publication) {
        this.ID = ID;
        this.content = content;
        this.author = author;
        this.publication = publication;
    }
    public int getID() {
        return ID;
    }
    public String getContent() {
        return content;
    }
    public Users getAuthor() {
        return author;
    }
    public Publication getPublication() {
        return publication;
    }

    public void showDataMessage() {
        System.out.println("Les informations sur le message: " + ID + " " + content);
        author.showDataUser();
        System.out.println("Publié dans la publication ID: " + publication.getID());
    };

}

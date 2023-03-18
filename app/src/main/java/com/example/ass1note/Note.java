package com.example.ass1note;

public class Note {
    String nameNote;
    String idNote;

    public Note() {
    }


    public Note(String nameNote, String idNote) {
        this.nameNote = nameNote;
        this.idNote = idNote;
    }

    public String getNameNote() {
        return nameNote;
    }

    public void setNameNote(String nameNote) {
        this.nameNote = nameNote;
    }

    public String getIdNote() {
        return idNote;
    }

    public void setIdNote(String idNote) {
        this.idNote = idNote;
    }
}
package com.mateuszbartos;

import com.mateuszbartos.controllers.Database;

public class Main {

    public static void main(String[] args) {
//        LoginView mainLayout = new LoginView();
//        ParticipantView mainLayout = new ParticipantView();
//        OrganizerView mainLayout = new OrganizerView();
//        EventView mainLayout = new EventView();
//        CreateEventView mainLayout = new CreateEventView();
//        EditEventView mainLayout = new EditEventView();

        final Database database = new Database();
        System.out.println("prelogin:");
        System.out.println(database.login("matis", "12345"));
        System.out.println("postLogin:");
    }
}

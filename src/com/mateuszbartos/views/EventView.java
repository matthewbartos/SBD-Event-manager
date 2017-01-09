package com.mateuszbartos.views;

import javax.swing.*;
import java.util.Vector;

public class EventView {

    private static Vector<String> events = new Vector<>();
    private static Vector<String> searchedEvents = new Vector<>();

    public EventView() {
        JFrame frame = new JFrame("SBD2 Event Manager");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);

        events.add("Akademia C#");
        events.add("Warsztaty z programowania dronów");
        events.add("Wykład otwarty - Prof. Węglarz");

        searchedEvents.add("Programowanie obiektowe");
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel searchLabel = new JLabel("Search all events");
        searchLabel.setBounds(10, 0, 160, 25);
        panel.add(searchLabel);

        JTextField searchInput = new JTextField(20);
        searchInput.setBounds(10, 30, 160, 25);
        searchInput.setText("programowanie");
        panel.add(searchInput);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(175, 30, 80, 25);
        panel.add(searchButton);

        JLabel searchedEventsLabel = new JLabel("Search results");
        searchedEventsLabel.setBounds(10, 60, 160, 25);
        panel.add(searchedEventsLabel);

        JList<String> searchedEventList = new JList<>(searchedEvents);
        searchedEventList.setBounds(10, 90, 250, 100);
        panel.add(searchedEventList);

        JLabel joiningEvent = new JLabel("Events with you");
        joiningEvent.setBounds(270, 60, 160, 25);
        panel.add(joiningEvent);

        JList<String> eventList = new JList<>(events);
        eventList.setBounds(270, 90, 250, 100);
        panel.add(eventList);

        JButton removeButton = new JButton("I'm not going");
        removeButton.setBounds(410, 200, 120, 25);
        panel.add(removeButton);

        JLabel profileLabel = new JLabel("Hello, John Doe!");
        profileLabel.setBounds(180, 250, 160, 25);
        panel.add(profileLabel);

        JButton profileButton = new JButton("Edit profile");
        profileButton.setBounds(290, 250, 120, 25);
        panel.add(profileButton);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(410, 250, 120, 25);
        panel.add(logoutButton);
    }

}
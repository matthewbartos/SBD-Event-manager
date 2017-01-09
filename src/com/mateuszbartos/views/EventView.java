package com.mateuszbartos.views;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class EventView {

    private static Vector<String> events = new Vector<>();
    private static Vector<String> waiting = new Vector<>();

    public EventView() {
        JFrame frame = new JFrame("SBD2 Event Manager");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);

        events.add("John Bravo");
        events.add("Barrack Obama");
        events.add("Donald Trump");

        waiting.add("<Empty>");
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Event: Programowanie dronów");
        nameLabel.setBounds(10, 0, 250, 25);
        panel.add(nameLabel);

        JLabel dataLabel = new JLabel("Starting: 12.01.2017 18:30");
        dataLabel.setBounds(10, 30, 250, 25);
        panel.add(dataLabel);

        JLabel dataEndLabel = new JLabel("Ending: 12.01.2017 20:00");
        dataEndLabel.setBounds(10, 60, 250, 25);
        panel.add(dataEndLabel);

        JLabel categoryLabel = new JLabel("Category: Workshop");
        categoryLabel.setBounds(10, 90, 160, 25);
        panel.add(categoryLabel);

        JLabel placeLabel = new JLabel("Place: CW13");
        placeLabel.setBounds(10, 120, 160, 25);
        panel.add(placeLabel);

        JLabel sizeLabel = new JLabel("Size: max 90 students");
        sizeLabel.setBounds(10, 150, 160, 25);
        panel.add(sizeLabel);


        JButton joinButton = new JButton("Join event");
        joinButton.setBounds(10, 180, 120, 25);
        panel.add(joinButton);

        JButton exitButton = new JButton("Exit event");
        exitButton.setBounds(130, 180, 120, 25);
        exitButton.setEnabled(false);
        panel.add(exitButton);

        JLabel userListLabel = new JLabel("Going:");
        userListLabel.setBounds(10, 210, 160, 25);
        panel.add(userListLabel);

        JList<String> eventList = new JList<>(events);
        eventList.setBounds(10, 230, 250, 100);
        panel.add(eventList);

        JLabel waitingListLabel = new JLabel("Waiting list:");
        waitingListLabel.setBounds(10, 340, 160, 25);
        panel.add(waitingListLabel);

        JList<String> waitingList = new JList<>(waiting);
        waitingList.setBounds(10, 370, 250, 100);
        panel.add(waitingList);
    }

}
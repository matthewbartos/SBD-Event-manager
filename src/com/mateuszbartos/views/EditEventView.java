package com.mateuszbartos.views;

import javax.swing.*;

public class EditEventView {

    public EditEventView() {
        JFrame frame = new JFrame("SBD2 Event Manager");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Event name");
        nameLabel.setBounds(10, 0, 160, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField("Akademia #");
        nameField.setBounds(10, 30, 160, 25);
        panel.add(nameField);

        JLabel dateStartLabel = new JLabel("Start date");
        dateStartLabel.setBounds(10, 60, 160, 25);
        panel.add(dateStartLabel);

        JTextField dateStartField = new JTextField("07.01.2017 18:40");
        dateStartField.setBounds(10, 90, 160, 25);
        panel.add(dateStartField);

        JLabel dateEndLable = new JLabel("End date");
        dateEndLable.setBounds(10, 120, 160, 25);
        panel.add(dateEndLable);

        JTextField dateEndField = new JTextField("07.01.2017 19:45");
        dateEndField.setBounds(10, 150, 160, 25);
        panel.add(dateEndField);
        
        JLabel categoryLabel = new JLabel("Category");
        categoryLabel.setBounds(10, 180, 160, 25);
        panel.add(categoryLabel);

        JTextField categoryField = new JTextField("Lecture");
        categoryField.setBounds(10, 210, 160, 25);
        panel.add(categoryField);

        JLabel placeLabel = new JLabel("Place");
        placeLabel.setBounds(10, 240, 160, 25);
        panel.add(placeLabel);

        JTextField placeField = new JTextField("Connector A");
        placeField.setBounds(10, 270, 160, 25);
        panel.add(placeField);

        JLabel sizeLabel = new JLabel("*Max size:");
        sizeLabel.setBounds(10, 300, 160, 25);
        panel.add(sizeLabel);

        JTextField sizeField = new JTextField("300");
        sizeField.setBounds(10, 330, 160, 25);
        panel.add(sizeField);

        JButton joinButton = new JButton("Edit event");
        joinButton.setBounds(10, 360, 120, 25);
        panel.add(joinButton);

        JButton deleteButton = new JButton("Delete event");
        deleteButton.setBounds(10, 390, 120, 25);
        panel.add(deleteButton);
    }

}
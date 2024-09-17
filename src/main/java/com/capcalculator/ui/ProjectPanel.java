package com.capcalculator.ui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class ProjectPanel extends JPanel {

    private JLabel nameLabel;
    private JTextField nameTextfield;
    private JTable piecesTable;

    public ProjectPanel() {
        initComponents();
    }

    private void initComponents() {
        nameLabel = new JLabel();
        nameTextfield = new JTextField();
        piecesTable = new JTable();

        setLayout(new MigLayout(
                "insets 4 4 4 4",
                // columns
                "[fill,30%][fill,40%][fill,30%]",
                // rows
                "[fill,grow]"));

        //---- nameLabel ----
        nameLabel = new JLabel();
        nameLabel.setText("Nom du projet");
        add(nameLabel, "cell 0 0,pushx");

        //---- nameTextfield ----
        add(nameTextfield, "cell 1 0,wrap");

        //---- piecesTable ----
        String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
        Object[][] data = {
                {"Kathy", "Smith",
                        "Snowboarding", new Integer(5), new Boolean(false)},
                {"John", "Doe",
                        "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black",
                        "Knitting", new Integer(2), new Boolean(false)},
                {"Jane", "White",
                        "Speed reading", new Integer(20), new Boolean(true)},
                {"Joe", "Brown",
                        "Pool", new Integer(10), new Boolean(false)}
        };

        piecesTable = new JTable(data, columnNames);
        add(piecesTable, "cell 0 1,span");
    }
}

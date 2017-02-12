package com.mateuszbartos.controllers;

import com.mateuszbartos.controllers.statements.LoginStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private Connection connection;

    /**
     * Use SSH tunneling to establish the connection:
     * ssh -L 9999:admlab2-main.cs.put.poznan.pl:1521 inf122437@unixlab.cs.put.poznan.pl
     */

    public Database() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "inf122437");
        connectionProps.put("password", "SuperSecretPassword");
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:9999/dblab01.cs.put.poznan.pl ", connectionProps);
            System.out.println("Połączono z bazą danych");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE,
                    "nie udało się połączyć z bazą danych", ex);
            System.exit(-1);
        }
    }

    public boolean login(String username, String password) {
        final LoginStatement loginStatement = new LoginStatement(connection, "matis", "12345");
        final Boolean result = loginStatement.execute();

//        return result != null ? result : false;
        return result;
    }

}

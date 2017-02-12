package com.mateuszbartos.controllers.statements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginStatement extends BaseStatement<Boolean> {
    private static final String SQL = "SELECT COUNT(*) FROM PARTICIPANTS WHERE PARTICIPANTS.login = ? AND PARTICIPANTS.HASH = ?";

    private final String username;
    private final String password;

    public LoginStatement(Connection connection, String username, String password) {
        super(connection);

        this.username = username;
        this.password = password;
    }

    @Override
    protected Boolean performOperations(PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException {
        preparedStatement = connection.prepareStatement(SQL);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        final int result = resultSet.getInt(1);

        resultSet.close();
        preparedStatement.close();

        return result == 1;
    }
}

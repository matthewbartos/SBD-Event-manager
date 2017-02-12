package com.mateuszbartos.controllers.statements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BaseStatement<T> {
    protected Connection connection;

    private BaseStatement() {
        // nop
    }

    protected BaseStatement(Connection connection) {
        this.connection = connection;
    }

    public T execute() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        T result = null;

        try {
            result = performOperations(preparedStatement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    protected abstract T performOperations(PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException;
}

package com.gmail.xmrayq.app.dao.impl;

import com.gmail.xmrayq.app.dao.connection.ConnectionService;
import com.gmail.xmrayq.app.dao.model.User;
import com.gmail.xmrayq.app.dao.UserDao;

import java.sql.*;

public class UserDaoImpl implements UserDao {


    public void createTableBook() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS BOOK("
                + "ID INTEGER (5) AUTO_INCREMENT NOT NULL, "
                + "PASSWORD VARCHAR (20) NOT NUL, "
                +"FIRST_NAME VARCHAR (20) NOT NULL,"
                + "LAST_NAME VARCHAR (20) NOT NULL, "
                + "PRIMARY KEY (ID)"
                + ")";
        Connection connection = ConnectionService.getConnection();
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Table BOOK is created!");
    }


    public static void save(User user) {

        String insertUser = "INSERT INTO T_USER (EMAIL, PASSWORD, FIRST_NAME, LAST_NAME) VALUES(?, ?, ?, ?)";

        try (Connection connection = ConnectionService.getInstance().getConnection()) {
            if (connection != null) {
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertUser, Statement.RETURN_GENERATED_KEYS)) {
                    preparedStatement.setString(1, user.getEmail());
                    preparedStatement.setString(2, user.getPassword());
                    preparedStatement.setObject(3, user.getFirstName());
                    preparedStatement.setObject(4, user.getLastName());

                    int affectedRows = preparedStatement.executeUpdate();

                    if (affectedRows == 0) {
                        throw new SQLException("Table not added");
                    }

                    try (ResultSet generatedKey = preparedStatement.getGeneratedKeys()) {
                        if (generatedKey.next()) {
                            user.setId(generatedKey.getLong(1));
                        } else {
                            throw new SQLException("Id not added");
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}

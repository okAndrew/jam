package com.savruksergiy.jam.controller.dao.impl;

import com.savruksergiy.jam.controller.dao.UserDAO;
import com.savruksergiy.jam.model.User;
import org.apache.log4j.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 12/9/13
 * Time: 11:33 AM
 */
public class UserDAOImpl implements UserDAO {

    private DataSource dataSource;
    private static Logger logger = Logger.getLogger(UserDAOImpl.class);

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public int insert(User user) {
        int result = 0;
        String sql = "INSERT INTO users (login, email, password, sex) VALUES (?, ?, ?, ?)";
        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getSex());

            result = statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            logger.error(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    logger.error(e);
                }
            }
        }

        return result;
    }

    @Override
    public int update(User object) {
        return 0;
    }

    @Override
    public int delete(User object) {
        return 0;
    }
}

package com.codegym.wine_manager.dao;

import com.codegym.wine_manager.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
    List<User> getNumberPage(int offset, int noOfRecords)throws ClassNotFoundException,SQLException;
    User getUserByUsername(String username);
    List<User> getNumberPage(int offset, int noOfRecords, String name) throws ClassNotFoundException, SQLException;
}

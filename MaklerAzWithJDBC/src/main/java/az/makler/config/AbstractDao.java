/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hp electron
 */
public abstract class AbstractDao {
    //burada connection-u throws edirik ki mesuliyyet istifadecide olsun
    public static Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/makleraz", "user16", "12345");
        return conn;
    }
}


































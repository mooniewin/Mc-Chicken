/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm403.carpmoderna.db;

import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySQL {
    Connection conn;
    public Connection open(){
    String user = "root";
    String password = "root";
    
    String url = "jdbc:mysql://127.0.0.1:3306/app_base?useSSL=false&useUnicode=true&characterEnconding=utf-8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,user, password);
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void close(){
        try {
                conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Excepción controlada");
        }
    }
}
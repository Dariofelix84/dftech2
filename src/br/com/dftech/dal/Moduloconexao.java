/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dftech.dal;

import java.sql.*;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author dario
 */
public class Moduloconexao {

    public static Connection conector() {
        Connection conexao = null;
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/dbinfox";
        String user = "postgres";
        String password = "Mae191161";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
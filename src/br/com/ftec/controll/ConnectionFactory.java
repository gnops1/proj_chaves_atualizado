/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.controll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADM
 */
public class ConnectionFactory {

    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static String DATABASE_URL = "jdbc:mysql://localhost:3306/projetoChaves";

    public static Connection createConnectionToMySQL()
            throws ClassNotFoundException, SQLException {

        //Faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.jdbc.Driver");

        //Cria a conexão com o banco de dados
        Connection connection
                = DriverManager.getConnection(DATABASE_URL,
                        USERNAME, PASSWORD);

        return connection;
    }
    
    public static void main(String[] args) throws Exception{
 
      //Recupera uma conexão com o banco de dados
      Connection con = createConnectionToMySQL();
 
      //Testa se a conexão é nula
      if(con != null){
         System.out.println("Conexão obtida com sucesso!" + con);
         con.close();
      }
 
   }
    
    
    

}

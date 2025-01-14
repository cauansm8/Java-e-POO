/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection; /// biblioteca do metodo Connection
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cauan
 */
public class ConnectionFactory {
    
    public Connection getConnection(){   //// metodo do tipo connection
      try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdcontrolevendas", "root", "root");     //// caminho que acessa o bd e faz a conexao
        } 
      
      catch (SQLException erro) {   /// se der erro
            throw new RuntimeException (erro);  /// se nao encontrar o bd, lanca um fim de programa (mostrando o erro)
        }
  
        
    }
    
}

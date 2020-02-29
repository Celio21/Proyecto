/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Coneccion {
// Aqui solo va la coneccion 
//"com.mysql.jdbc.Driver";

      Connection cn=null;
        Connection conectar=null;
public Connection conexion(){   
  try{
    Class.forName("com.mysql.jdbc.Driver\"");//.newInstance();
    conectar=DriverManager.getConnection("jdbc:mysql://localhost/basereserva","root","root");
    //conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/personas","luis","");
    
  }catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
                                   }catch(ClassNotFoundException ex) {                                                                }
  return conectar;
}
}
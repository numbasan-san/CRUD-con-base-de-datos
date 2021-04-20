/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion_Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class Conecc {
    public static Connection getConexion () {
        String Link = "jdbc:sqlserver://LAPTOP-LFSFV27M:1433; databaseName = Cliente_BaseD/Datos; user = Conector; password = YareYareDaze";
        try {
            Connection Conect = DriverManager.getConnection ( Link );
            System.out.println ( "Si me ves... Felicidades, por fin algo que sale bien !\n" );
            return Conect;
        } catch ( SQLException e ){
            System.out.print( e.toString () );
            return null;
        }
    }
}

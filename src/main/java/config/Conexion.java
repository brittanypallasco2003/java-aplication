package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static final String cadenaConexionBD="jdbc:mysql://localhost/info";
    public static final String userName="root";
    public static final String pass="root_bas3";

    public Connection getConnection(){
        try {
            Connection connection= DriverManager.getConnection(cadenaConexionBD,userName,pass);
            return connection;
        }catch (SQLException e){
            System.out.println(e.toString());
            return null;

        }
    }
}

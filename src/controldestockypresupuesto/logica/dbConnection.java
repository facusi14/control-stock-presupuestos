
package controldestockypresupuesto.logica;
import java.sql.*;

public class dbConnection {
    static String url="jdbc:mysql://localhost:3306/grafica_db";
    static String user="root";
    static String pass="223348";
    
    public static Connection conectar(){
        Connection con = null;
        try
        {
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion exitosa");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }

}

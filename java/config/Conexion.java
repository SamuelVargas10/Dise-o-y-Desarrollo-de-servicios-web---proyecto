
package config;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    private String url="jdbc:mysql://localhost:3306/inventario";
    private String user="root";
    private String password="";

    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

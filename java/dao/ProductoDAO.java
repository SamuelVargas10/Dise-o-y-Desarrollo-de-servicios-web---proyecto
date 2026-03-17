
package dao;

import config.ConexionDB;
import model.Producto;
import java.sql.*;
import java.util.*;

public class ProductoDAO {

    ConexionDB conexion = new ConexionDB();

    public List<Producto> listar(){
        List<Producto> lista = new ArrayList<>();
        try{
            Connection con = conexion.conectar();
            String sql="SELECT * FROM producto";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ }
        }catch(Exception e){ e.printStackTrace(); }
        return lista;
    }

    public void insertar(Producto obj){
        try{
            Connection con=conexion.conectar();
            String sql="INSERT INTO producto VALUES(null,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
        }catch(Exception e){ e.printStackTrace(); }
    }

    public void actualizar(Producto obj){ }

    public void eliminar(int id){ }
}

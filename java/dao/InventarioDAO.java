
package dao;

import config.ConexionDB;
import model.Inventario;
import java.sql.*;
import java.util.*;

public class InventarioDAO {

    ConexionDB conexion = new ConexionDB();

    public List<Inventario> listar(){
        List<Inventario> lista = new ArrayList<>();
        try{
            Connection con = conexion.conectar();
            String sql="SELECT * FROM inventario";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ }
        }catch(Exception e){ e.printStackTrace(); }
        return lista;
    }

    public void insertar(Inventario obj){
        try{
            Connection con=conexion.conectar();
            String sql="INSERT INTO inventario VALUES(null,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
        }catch(Exception e){ e.printStackTrace(); }
    }

    public void actualizar(Inventario obj){ }

    public void eliminar(int id){ }
}


package dao;

import config.ConexionDB;
import model.Proveedor;
import java.sql.*;
import java.util.*;

public class ProveedorDAO {

    ConexionDB conexion = new ConexionDB();

    public List<Proveedor> listar(){
        List<Proveedor> lista = new ArrayList<>();
        try{
            Connection con = conexion.conectar();
            String sql="SELECT * FROM proveedor";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ }
        }catch(Exception e){ e.printStackTrace(); }
        return lista;
    }

    public void insertar(Proveedor obj){
        try{
            Connection con=conexion.conectar();
            String sql="INSERT INTO proveedor VALUES(null,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
        }catch(Exception e){ e.printStackTrace(); }
    }

    public void actualizar(Proveedor obj){ }

    public void eliminar(int id){ }
}

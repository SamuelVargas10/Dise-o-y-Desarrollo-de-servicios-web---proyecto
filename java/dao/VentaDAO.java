
package dao;

import config.ConexionDB;
import model.Venta;
import java.sql.*;
import java.util.*;

public class VentaDAO {

    ConexionDB conexion = new ConexionDB();

    public List<Venta> listar(){
        List<Venta> lista = new ArrayList<>();
        try{
            Connection con = conexion.conectar();
            String sql="SELECT * FROM venta";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ }
        }catch(Exception e){ e.printStackTrace(); }
        return lista;
    }

    public void insertar(Venta obj){
        try{
            Connection con=conexion.conectar();
            String sql="INSERT INTO venta VALUES(null,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
        }catch(Exception e){ e.printStackTrace(); }
    }

    public void actualizar(Venta obj){ }

    public void eliminar(int id){ }
}

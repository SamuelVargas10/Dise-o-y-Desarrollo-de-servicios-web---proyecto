
package dao;

import config.ConexionDB;
import model.Factura;
import java.sql.*;
import java.util.*;

public class FacturaDAO {

    ConexionDB conexion = new ConexionDB();

    public List<Factura> listar(){
        List<Factura> lista = new ArrayList<>();
        try{
            Connection con = conexion.conectar();
            String sql="SELECT * FROM factura";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ }
        }catch(Exception e){ e.printStackTrace(); }
        return lista;
    }

    public void insertar(Factura obj){
        try{
            Connection con=conexion.conectar();
            String sql="INSERT INTO factura VALUES(null,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
        }catch(Exception e){ e.printStackTrace(); }
    }

    public void actualizar(Factura obj){ }

    public void eliminar(int id){ }
}

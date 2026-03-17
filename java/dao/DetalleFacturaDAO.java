
package dao;

import config.ConexionDB;
import model.DetalleFactura;
import java.sql.*;
import java.util.*;

public class DetalleFacturaDAO {

    ConexionDB conexion = new ConexionDB();

    public List<DetalleFactura> listar(){
        List<DetalleFactura> lista = new ArrayList<>();
        try{
            Connection con = conexion.conectar();
            String sql="SELECT * FROM detallefactura";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ }
        }catch(Exception e){ e.printStackTrace(); }
        return lista;
    }

    public void insertar(DetalleFactura obj){
        try{
            Connection con=conexion.conectar();
            String sql="INSERT INTO detallefactura VALUES(null,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
        }catch(Exception e){ e.printStackTrace(); }
    }

    public void actualizar(DetalleFactura obj){ }

    public void eliminar(int id){ }
}

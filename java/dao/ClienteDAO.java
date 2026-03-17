
package dao;

import config.ConexionDB;
import model.Cliente;
import java.sql.*;
import java.util.*;

public class ClienteDAO {

    ConexionDB conexion = new ConexionDB();

    public List<Cliente> listar(){
        List<Cliente> lista = new ArrayList<>();
        try{
            Connection con = conexion.conectar();
            String sql="SELECT * FROM cliente";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ }
        }catch(Exception e){ e.printStackTrace(); }
        return lista;
    }

    public void insertar(Cliente obj){
        try{
            Connection con=conexion.conectar();
            String sql="INSERT INTO cliente VALUES(null,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
        }catch(Exception e){ e.printStackTrace(); }
    }

    public void actualizar(Cliente obj){ }

    public void eliminar(int id){ }
}

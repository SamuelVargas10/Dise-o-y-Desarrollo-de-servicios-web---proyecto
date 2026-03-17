
package controller;

import dao.VentaDAO;
import com.google.gson.Gson;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/api/ventas")
public class VentaController extends HttpServlet {

    VentaDAO dao = new VentaDAO();

    protected void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException,IOException{

        response.setContentType("application/json");
        PrintWriter out=response.getWriter();
        out.print(new Gson().toJson(dao.listar()));
        out.flush();
    }
}

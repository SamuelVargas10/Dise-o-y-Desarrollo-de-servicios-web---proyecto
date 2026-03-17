
package controller;

import dao.DetalleFacturaDAO;
import com.google.gson.Gson;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/api/detallefacturas")
public class DetalleFacturaController extends HttpServlet {

    DetalleFacturaDAO dao = new DetalleFacturaDAO();

    protected void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException,IOException{

        response.setContentType("application/json");
        PrintWriter out=response.getWriter();
        out.print(new Gson().toJson(dao.listar()));
        out.flush();
    }
}

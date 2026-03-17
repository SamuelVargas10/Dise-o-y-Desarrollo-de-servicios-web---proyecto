
package controller;

import dao.ClienteDAO;
import com.google.gson.Gson;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/api/clientes")
public class ClienteController extends HttpServlet {

    ClienteDAO dao = new ClienteDAO();

    protected void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException,IOException{

        response.setContentType("application/json");
        PrintWriter out=response.getWriter();
        out.print(new Gson().toJson(dao.listar()));
        out.flush();
    }
}

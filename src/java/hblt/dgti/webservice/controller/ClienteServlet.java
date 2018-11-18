
package hblt.dgti.webservice.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CESAR
 */
public class ClienteServlet extends HttpServlet {

 
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Gson gson = new Gson();
        String jsonString = gson.toJson(listarPais());
        response.setContentType("application/json");
        response.getWriter().write(jsonString);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nomPais = request.getParameter("nomPais");
        crearPais(nomPais);
        response.setContentType("text/plain");
        response.getWriter().write("Datos ingresados");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static String crearPais(java.lang.String nomPais) {
        hblt.dgti.webservce.ws.PaisWebService_Service service = new hblt.dgti.webservce.ws.PaisWebService_Service();
        hblt.dgti.webservce.ws.PaisWebService port = service.getPaisWebServicePort();
        return port.crearPais(nomPais);
    }

    private static java.util.List<hblt.dgti.webservce.ws.Pais> listarPais() {
        hblt.dgti.webservce.ws.PaisWebService_Service service = new hblt.dgti.webservce.ws.PaisWebService_Service();
        hblt.dgti.webservce.ws.PaisWebService port = service.getPaisWebServicePort();
        return port.listarPais();
    }

}

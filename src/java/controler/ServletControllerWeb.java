/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import classes.IMC;
import classes.IIMC;
import classes.CalcularIMC;

/**
 *
 * @author alunoces
 */
@WebServlet(name = "ServletControllerWeb", urlPatterns = {"/ServletControllerWeb"})
public class ServletControllerWeb extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensagem = "";
        String sexo = request.getParameter("vSexo");                
        float peso = Float.parseFloat(request.getParameter("vPeso"));
        float altura = Float.parseFloat(request.getParameter("vAltura"));
        
        if(verificarIMC(request).equals("Abaixo do peso")){
            mensagem = "Abaixo do peso";
        }
        else if(verificarIMC(request).equals("Peso normal")){
            mensagem = "Peso normal";
        }
        else if(verificarIMC(request).equals("Marginalmente acima do peso")){
            mensagem = "Marginalmente acima do peso";
        }
        else if(verificarIMC(request).equals("Acima do peso ideal")){
            mensagem = "Acima do peso ideal";
        }
        else{
            mensagem = "Obeso";
        }
        
        request.setAttribute("mensagem",mensagem);
        
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Controle</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Se você está vendo está página, aconteceu algum erro</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    public String verificarIMC(HttpServletRequest request) {
        
        String sexo = request.getParameter("vSexo");
        float peso = Float.parseFloat(request.getParameter("vPeso"));
        float altura = Float.parseFloat(request.getParameter("vAltura"));
        
        IMC objIMC = new IMC();
        CalcularIMC objCalcularIMC = new CalcularIMC();
        objCalcularIMC.setAltura(altura);
        objCalcularIMC.setPeso(peso);
        objCalcularIMC.setSexo(sexo);
        
        String resultado = objIMC.calcularIMC(objCalcularIMC);
        
        return resultado;
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

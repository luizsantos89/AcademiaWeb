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
import classes.AvaliacaoFisica;
import classes.IAvaliacaoFisica;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alunoces
 */
@WebServlet(name = "ServletControllerWeb", urlPatterns = {"/ServletControllerWeb"})
public class ServletControllerWeb extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        System.out.println(usuario);
        
        HttpSession session = request.getSession();
        session.setAttribute("usuario", usuario);
        
        response.sendRedirect("index.jsp");
    }

}

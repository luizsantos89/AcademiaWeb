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

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensagem = "";
        String sexo = request.getParameter("vSexo");
                
        float peso = Float.parseFloat(request.getParameter("vPeso"));
        float altura = Float.parseFloat(request.getParameter("vAltura"));
        
        /*CalcularIMC objCalcularIMC = null;
        objCalcularIMC.setAltura(altura);
        objCalcularIMC.setPeso(peso);
        objCalcularIMC.setSexo(sexo);
        float resultado = objCalcularIMC.calcularIMC();*/
        
        /*if(sexo.equals("M")){//1
            if(verificarIMC(request)<20.7f){//2
                mensagem = "Abaixo do peso";//3
            }
            else if(verificarIMC(request) < 26.4f){ //4
                mensagem = ("Peso normal"); //5
            }
            else if(verificarIMC(request) < 27.8f){ //6
                mensagem = ("Marginalmente acima do peso"); //7
            }
            else if(verificarIMC(request) < 31.1f){ //8
                mensagem = ("Acima do peso ideal"); //9
            }
            else { //10
                mensagem = ("Obeso"); //11
            }
        }
        else{ //12
            if(verificarIMC(request) < 19.1f){ //13
                mensagem = ("Abaixo do peso"); //14
            }
            else if(verificarIMC(request) < 25.8f){ //15
                mensagem = ("Peso normal"); //16
            }
            else if(verificarIMC(request) < 27.3f){ //17
                mensagem = ("Marginalmente acima do peso"); //18
            }
            else if(verificarIMC(request) < 32.3f){ //19
                mensagem = ("Acima do peso ideal"); //20
            }
            else { //21
                mensagem = ("Obeso"); //22
            }
        }*/
        
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
        
        //if (verificarIMC(request)){
        //    mensagem = "Aluno foi Aprovado!";
        //}else{
        //    mensagem = "Aluno foi Reprovado!";
        //}
        //request.setAttribute("mensagem",mensagem);
        
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
       // request.getAttributeNames();
        
        String sexo = request.getParameter("vSexo");
        float peso = Float.parseFloat(request.getParameter("vPeso"));
        float altura = Float.parseFloat(request.getParameter("vAltura"));
        //int frequencia = Integer.parseInt(request.getParameter("vFrequencia"));
        
        //CalcularIMC objCalcularIMC;
        //objCalcularIMC.setAltura(altura);
        //objCalcularIMC.setPeso(peso);
        //objCalcularIMC.setSexo(sexo);
                
        //return objCalcularIMC.CalcularIMC();
        
        IMC objIMC = new IMC();
        CalcularIMC objCalcularIMC = new CalcularIMC();
        objCalcularIMC.setAltura(altura);
        objCalcularIMC.setPeso(peso);
        objCalcularIMC.setSexo(sexo);
                
        //objIMC.calcularIMC(objCalcularIMC);
        //objIMC.setAltura(altura);
        //objIMC.setPeso(peso);
        //objIMC.setSexo(sexo);
        String resultado = objIMC.calcularIMC(objCalcularIMC);
        
        //float resultado = objIMC.calcularIMC();
        return resultado;
        
        
        //IMC objIMC;
        //objIMC.calcularIMC(IMC);
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

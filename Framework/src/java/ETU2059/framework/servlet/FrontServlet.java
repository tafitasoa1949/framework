/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ETU2059.framework.servlet;

import ETU2059.framework.Mapping;
import ETU2059.framework.ModelView;
import ETU2059.framework.annotation.MethodAnnotation;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tafitasoa-P15B-140
 */
@WebServlet(name = "FrontServlet", urlPatterns = {"/FrontServlet"})
public class FrontServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    HashMap<String,Mapping> mappingUrls;
    String test;
    @Override
    public void init()throws ServletException{
        mappingUrls = new HashMap<>();
        String path = this.getInitParameter("mode");
        
        try {
            Vector<MethodAnnotation> list = MethodAnnotation.getAnnotedMethods(path);
            for(MethodAnnotation me : list){
                Mapping map_indice = new Mapping(me.getMethod().getDeclaringClass().getName(), me.getMethod().getName());
                mappingUrls.put(me.getAnnotation().name(), map_indice);
            }
        } catch (Exception ex) {
            Logger.getLogger(FrontServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException,Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        /*out.println("Servlet : FrontServlet");
        out.println("<br>");
        out.println("Context Path :"+request.getContextPath());
        out.println("<br>");
        out.println("URL :"+request.getRequestURI());
        out.println("<br>");
        out.println("Parametre :");
        Enumeration<String> liste = request.getParameterNames();
        while(liste.hasMoreElements()){
            String element = liste.nextElement();
            String[] elementValues = request.getParameterValues(element);
            for(int i=0 ; i<elementValues.length ; i++){
                out.println(element+" "+(i+1)+" : "+elementValues[i]);
            }
        }
        
        out.print("<br>");
        out.println("Tous les HashMap");
        out.print("<br>");
        out.println("Taille mapping :"+mappingUrls.size());
        for (Map.Entry<String, Mapping> entry : mappingUrls.entrySet()) {
            out.print("<br>");
            out.println("Url :  "+entry.getKey() + " ,  Class :" +entry.getValue().getClassName() + " , Method : " + entry.getValue().getMethod());
            
        }*/

        try{
            String uri = request.getRequestURI();
            String url = uri.split("/")[uri.split("/").length-1];
            if(mappingUrls.containsKey(url)){
                Mapping map = mappingUrls.get(url);
                Class classe = Class.forName(map.getClassName());
                Object instance = classe.getConstructor().newInstance();
                Method meth = classe.getMethod(map.getMethod());
                Object obj = meth.invoke(instance);
                if(obj.getClass() == ModelView.class){
                    ModelView mv = (ModelView) obj;
                    for(Map.Entry<String,Object> entry : mv.getDonnees().entrySet()){
                        request.setAttribute(entry.getKey(), entry.getValue());
                    }
                    RequestDispatcher dispat = request.getRequestDispatcher(mv.getViewname());
                    dispat.forward(request,response);
                }else{
                    throw new Exception("erreur eto");
                }
            }
        }catch (Exception e){
            out.print(e.getMessage());
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(FrontServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(FrontServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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

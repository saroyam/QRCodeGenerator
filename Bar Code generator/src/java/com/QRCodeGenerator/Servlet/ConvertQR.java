/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QRCodeGenerator.Servlet;

import QRCodeGenerator.QRGenerator;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mukul
 */

public class ConvertQR extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String s = request.getParameter("textbox");
        
        try {
            QRGenerator.QRGenerator(s);
        } catch (Exception ex) {
            Logger.getLogger(ConvertQR.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        RequestDispatcher view = getServletContext().getRequestDispatcher("/index.html");
        view.forward(request, response);
        
//        ServletContext sc = getServletContext();
//
//        try (InputStream is = sc.getResourceAsStream("images/new.JPG")) {
//
//            // it is the responsibility of the container to close output stream
//            OutputStream os = response.getOutputStream();
//
//            if (is == null) {
//
//                response.setContentType("text/plain");
//                os.write("Failed to send image".getBytes());
//            } else {
//
//                byte[] buffer = new byte[1024];
//                int bytesRead;
//
//                response.setContentType("image/png");
//
//                while ((bytesRead = is.read(buffer)) != -1) {
//
//                    os.write(buffer, 0, bytesRead);
//                }
//            }
//        
//    }

 
    
}
}

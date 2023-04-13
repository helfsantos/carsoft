package br.com.carsoft.servlet;

import br.com.carsoft.dao.CarDao;
import br.com.carsoft.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/senac") //voce coloca o nome que configuramos no index
public class CreateCarServlet extends HttpServlet {

//sobre escrever o metodo

    @Override //escreve doPost para aparecer o metodo
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


//comentario = car-name
        String comentario = request.getParameter("comentario");

        Car car = new Car(comentario);

        new CarDao().createCar(car);

        response.sendRedirect("/find-all-cars");


    }



}



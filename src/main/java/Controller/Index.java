package Controller;

import entity.GeneratedCharacter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.log4j.Logger;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by tolly on 4/11/2017.
 */

@WebServlet (
        urlPatterns = {"/index.html"}
)
public class Index extends HttpServlet{
    private final Logger logger = Logger.getLogger((Index.class));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Client client = ClientBuilder.newClient();

            WebTarget target = client.target("http://localhost:8080/characterGenerator");
            String characterJsonString = target.request(MediaType.APPLICATION_JSON).get(String.class);

            GeneratedCharacter character = mapper.readValue(characterJsonString, GeneratedCharacter.class);

            req.setAttribute("generatedCharacter", character);
        } catch (Exception exception) {
            req.setAttribute("error", "An error was encountered.");
            logger.error(exception);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);
    }
}

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

    /**
     * This doGet overrides the regular, calling a webserivce to put
     * an object-fied JSON string onto the attributes for page access
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Client client = ClientBuilder.newClient();

            WebTarget target = client.target("http://52.14.40.39:8080/TeamProject/characterGenerator");
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

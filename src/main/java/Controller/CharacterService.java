package Controller;

import entity.GeneratedCharacter;
import persistence.CharacterDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Created by tolly on 4/11/2017.
 */
@Path("/characterGenerator")
public class CharacterService {
    private final Logger logger = Logger.getLogger((Index.class));
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("application/json")
    public Response getMessage() {
        // Return a simple message
        try {
            CharacterDao dao = new CharacterDao();
            GeneratedCharacter output = dao.generateCharacter();
            return Response.status(200).entity(output).build();
        } catch (Exception exception) {
            logger.error(exception);
            return Response.status(500).entity("An error was encountered.").build();
        }
    }
}

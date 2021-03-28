
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {
    /* The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
  //  @Produces("text/plain")
    @Produces("text/html")
    @Path("/{param}")
    public Response getMessageHtml(@PathParam("param") String name) {
        // Return a simple message
       // name = "SomeName";
        String output = "<html><body><h1>Hello " + name + "</h1></body</html>";
        return Response.status(200).entity(output).build();
    }

     */
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"

    @Produces("application/json")
    @Path("/{param}")
    public Response getMessageJson(@PathParam("param") String name) throws JsonProcessingException {


        //Creating the ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        //Converting the Object to JSONString
        String jsonString = mapper.writeValueAsString(name);
        String output = jsonString;
        return Response.status(200).entity(output).build();
    }
}
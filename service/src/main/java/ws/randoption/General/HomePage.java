package ws.randoption;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HomePage {
    @GET
    //@Produces(MediaType.TEXT_PLAIN_TYPE)
    @Produces(MediaType.TEXT_HTML)
    public String getIt() {
        return "<html>\n" +
                "<body>\n" +
                "    <h1>Random Option RESTFUL API (JSON)</h1>\n" +
                "    <h2>Available features:</h2>\n" +
                "    <ul>\n" +
                "        <li>/status</li>\n" +
                "        <li>/gen/pid</li>\n" +
                "        <li>/rand/{pid}</li>\n" +
                "    </ul>\n" +
                "</body>\n" +
                "</html>\n" +
                "";
    }
}

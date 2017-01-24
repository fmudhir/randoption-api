package ws.randoption;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("robots.txt")
public class Robots {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    //@Produces(MediaType.TEXT_HTML)
    public String getIt() {
        return "User-agent: *\n" +
                "Disallow: /";
    }
}
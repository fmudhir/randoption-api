package ws.randoption;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
public class StatusCheck {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "ok";
    }
}

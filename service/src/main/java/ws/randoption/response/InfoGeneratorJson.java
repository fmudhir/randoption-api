package ws.randoption;

public class InfoGeneratorJson {
    public String pid;

    public InfoGeneratorJson() {} // JAXB needs this

    public InfoGeneratorJson(String profileId) {
        this.pid = profileId;
    }
}
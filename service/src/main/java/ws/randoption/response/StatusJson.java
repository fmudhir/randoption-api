package ws.randoption;

public class StatusJson {
    public String status;

    public StatusJson() {} // JAXB needs this

    public StatusJson(String status) {
        this.status = status;
    }
}
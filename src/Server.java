import javax.xml.ws.Endpoint;
import User.UserController;
public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8001/", new UserController());
        System.out.println("Service is running");
    }
}

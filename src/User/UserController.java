package User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class UserController {

    List<User> users =new ArrayList<User>();

    public List<User> list(){
        return users;
    }

    @WebMethod
    public User get(@WebParam(name="id") int id){
        for(User u : users){
            if(u.getId() == id){
                return u;
            }
        }
        return null;  
    }

    @WebMethod
    public User add(@WebParam(name="name") String name,@WebParam(name="password") String password){
        // generate id
        int id = (int) (Math.random() * 100);
        User u = new User(id, name, password);
        users.add(u);
        return u;
    }
}
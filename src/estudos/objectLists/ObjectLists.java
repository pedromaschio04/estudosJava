package estudos.objectLists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectLists {
    public static void main(String[] args) {
        //Exemplo de como instanciar uma lista dinamica, e tabalhar com suas propriedades
        List<User> users = new ArrayList<>();
        for(int i=20;i<25;i++){
            User actualUser = new User("User "+i,i);
            users.add(actualUser);
        }
        users.clear();

        User newUserA = new User("Pedro",21);
        users.add(newUserA);
        User newUserB = new User("Pedro",21);
        users.add(newUserB);

        System.out.println("Método sem parâmetros " + users.get(0).showInfo());
        System.out.println("Método com parâmetros " + users.get(0).showInfo(false));

        System.out.println(users.toString());

        System.out.println(newUserA.equals(newUserB));
    }
}

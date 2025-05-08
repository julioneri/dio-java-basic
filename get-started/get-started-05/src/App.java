import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 21),
                                   new User("João", 33),
                                   new User("Eduardo", 41),
                                   new User("Ana", 19));
        printStringValue(Record::toString, users);
        printStringValue(User::name, users);
        printStringValue(user -> String.valueOf(user.age()), users);
        //users.forEach(System.out::println);

        
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}

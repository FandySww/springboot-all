import entity.User;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @Author fandayong
 * @Date 2021/2/25 3:26 PM
 * @description
 */
public class OptionalTest {
    public static void main(String[] args) {
//        User user = new User("john@gmail.com","1234");
//        User user1 = new User("john@gmail.com","1234");
//        Optional<User> opt = Optional.ofNullable(user);
//        User result = Optional.ofNullable(user).orElse(user1);
//        boolean a = opt.isPresent();
//        if (a) {
//            User user11 = opt.get();
//        }
//        opt.ifPresent(u->u.getEmail());
//        int aa = 0;

//        User user = null;
//        User user = new User("john@gmail.com", "1234");
//        System.out.println("Using orElse");
//        User result = Optional.ofNullable(user).orElse(createNewUser());
//        System.out.println("Using orElseGet");
//        User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());

        User user = new User("1234",null);
//        User user = null;
        String email = Optional.ofNullable(user)
                .map(u -> u.getEmail()).orElse("default@gmail.com");
        System.out.println(email);
    }
    private static User createNewUser() {
        System.out.println("Creating New User");
        return new User("extra@gmail.com", "1234");
    }
}

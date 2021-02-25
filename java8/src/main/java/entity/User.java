package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author fandayong
 * @Date 2021/2/25 3:23 PM
 * @description
 */
@Data
@AllArgsConstructor
public class User {
   private String name;
   private String email;
   private User createNewUser() {
      System.out.println("Creating New User");
      return new User("extra@gmail.com", "1234");
   }
}


package com.ecommerce.factory;

import com.ecommerce.domain.User;
import java.util.UUID;

public class UserFactory {

    public static User createUser(String firstName,
                                  String lastName,
                                  String userEmail,
                                  String cellNo,
                                  String userPassword) {

        String userId = UUID.randomUUID().toString();

        return User.UserBuilder.newInstance()
                .setUserId(userId)
                .firstName(firstName)
                .lastName(lastName)
                .userEmail(userEmail)
                .cellNo(cellNo)
                .userPassword(userPassword)
                .build();
    }
}

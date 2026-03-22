package com.ecommerce.factory;

import com.ecommerce.domain.User;
import com.ecommerce.util.Helper;

import java.util.UUID;

public class UserFactory {

    public static User createUser(String firstName,
                                  String lastName,
                                  String userEmail,
                                  String cellNo,
                                  String userPassword) {
        if(Helper.isNullOrEmpty(firstName)||
           Helper.isNullOrEmpty(lastName)){
throw new IllegalArgumentException("Name or surname required");

        }
        if(!Helper.isValidEmail(userEmail))
         throw new IllegalArgumentException("Invalid Email");

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

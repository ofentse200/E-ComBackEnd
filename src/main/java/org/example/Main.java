package org.example;

import com.ecommerce.domain.Address;
import com.ecommerce.domain.User;
import com.ecommerce.factory.AddressFactory;
import com.ecommerce.factory.UserFactory;

public class Main {
    public static void main(String[] args) {

        Address address= AddressFactory.createAddress(
                "27",
                "Ward 27",
                "Cape Town",
                "Western Cape",
                "445 Schoemansdaal",
                "South Africa");

        System.out.println(address);


        User user= UserFactory.createUser("Matinisa",
                "Lubisi",
                "222527269@mycput.ac.za",
                "0711909253",
                "mat3");
        System.out.println(user);
    }
}

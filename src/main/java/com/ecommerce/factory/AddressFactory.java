package com.ecommerce.factory;

import com.ecommerce.domain.Address;
import com.ecommerce.util.Helper;

import java.util.UUID;

public class AddressFactory {

    public static Address createAddress(
                                        String streetNumber,
                                        String streetName,
                                        String city,
                                        String province,
                                        String postalCode,
                                        String country) {
        if (Helper.isNullOrEmpty(streetNumber) ||
                Helper.isNullOrEmpty(streetName) ||
                Helper.isNullOrEmpty(city) ||
                Helper.isNullOrEmpty(postalCode)) {

            throw new IllegalArgumentException("Missing required address fields");
        }

        String addressId = UUID.randomUUID().toString();

        return Address.AddressBuilder.newInstance()
                .setAddressId(Helper.generateId())
                .streetNumber(streetNumber)
                .streetName(streetName)
                .city(city)
                .province(province)
                .postalCode(postalCode)
                .country(country)
                .build();
    }
}

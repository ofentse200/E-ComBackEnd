package com.ecommerce.factory;

import com.ecommerce.domain.Address;
import java.util.UUID;

public class AddressFactory {

    public static Address createAddress(
                                        String streetNumber,
                                        String streetName,
                                        String city,
                                        String province,
                                        String postalCode,
                                        String country) {

        String addressId = UUID.randomUUID().toString();

        return Address.AddressBuilder.newInstance()
                .setAddressId(addressId)
                .streetNumber(streetNumber)
                .streetName(streetName)
                .city(city)
                .province(province)
                .postalCode(postalCode)
                .country(country)
                .build();
    }
}

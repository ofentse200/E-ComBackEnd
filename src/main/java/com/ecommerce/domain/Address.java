package com.ecommerce.domain;

public class Address {

    private final String addressId;
    private final String streetNumber;
    private final String streetName;
    private final String city;
    private final String province;
    private final String postalCode;
    private final String country;

    public Address(AddressBuilder builder){

        this.addressId=builder.addressId;
        this.streetNumber=builder.streetNumber;
        this.streetName=builder.streetName;
        this.city=builder.city;
        this.province=builder.province;
        this.postalCode=builder.postalCode;
        this.country=builder.country;
    }


    public static class AddressBuilder{


        private String addressId;
        private String streetNumber;
        private String streetName;
        private String city;
        private String province;
        private String postalCode;
        private String country;

        public static AddressBuilder newInstance(){

            return new AddressBuilder();
        }

        public AddressBuilder setAddressId(String addressId){
            this.addressId=addressId;
            return this;
        }
        public AddressBuilder streetNumber(String streetNumber){
            this.streetNumber=streetNumber;
            return this;
        }
        public AddressBuilder streetName(String streetName){
            this.streetName=streetName;
            return this;
        }
        public AddressBuilder city(String city){
            this.city=city;
            return this;
        }
        public AddressBuilder province(String province){
            this.province=province;
            return this;
        }
        public AddressBuilder postalCode(String postalCode){
            this.postalCode=postalCode;
            return this;
        }
        public AddressBuilder country(String country){
            this.country=country;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
    @Override
    public String toString() {
        return "AddressBuilder{" +
                "addressId='" + addressId + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}




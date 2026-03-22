package com.ecommerce.domain;

public class User {

    private final String userId;
    private final String firstName;
    private final String lastName;
    private final String userEmail;
    private final String cellNo;
    private final String userPassword;


    public User( UserBuilder builder){

        this.userId=builder.userId;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.userEmail=builder.userEmail;
        this.cellNo=builder.cellNo;
        this.userPassword=builder.userPassword;

    }

    public static class UserBuilder{

        private String userId;
        private String firstName;
        private String lastName;
        private String userEmail;
        private String cellNo;
        private String userPassword;


        public static UserBuilder newInstance(){

            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId){
            this.userId=userId;
            return this;
        }

        public UserBuilder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public UserBuilder lastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public UserBuilder userEmail(String userEmail){
            this.userEmail=userEmail;
            return this;
        }
        public UserBuilder cellNo(String cellNo){
            this.cellNo=cellNo;
            return this;
        }
        public UserBuilder userPassword(String userPassword){
            this.userPassword=userPassword;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }
    @Override
    public String toString() {
        return "UserBuilder{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userEmail=" + userEmail +
                ", cellNo=" + cellNo +
                ", userPassword=" + userPassword +
                '}';
    }
}

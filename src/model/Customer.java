package model;

import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    private static String emailRegex = "^(.+)@(.+).com$";
    private Pattern pattern = Pattern.compile(emailRegex);



    public Customer(String firstName, String lastName , String email){
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, Invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public String getEmail(){
        return this.email;
    }


        @Override
        public String toString() {
        return "firstName: " + firstName +
                "lastName: " + lastName +
                "email: " + email;

    }
}

package passwordgen;

public class PasswordGenerator {

    private final String phrase = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ012345678910!@#$%^&*-_"; //this will include all possible + valid characters
    
    /*Typical password requirements:
        At least one capital letter, at least one letter, at least one symbol
    */

    public String getPhrase(){


        return phrase;
    }
    
}

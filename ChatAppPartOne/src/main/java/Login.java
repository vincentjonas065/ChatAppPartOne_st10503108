
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Login { 
    // GitHub update 1

    private String username;
    private String password;
    private String phoneNumber;

    //  USERNAME CHECK 
    public boolean checkUserName(String username) {
        // checks if username is valid (underscore + max 5 chars)
        return username.contains("_") && username.length() <= 5;
    }

    //PASSWORD CHECK
    public boolean checkPasswordComplexity(String password) {
        // checks password: 8+ chars, uppercase, number, special character

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        return password.length() >= 8 && hasUpper && hasNumber && hasSpecial;
    }

    //cellnumber chek
    public boolean checkCellPhoneNumber(String phoneNumber) {
      
        return phoneNumber.startsWith("+27") && phoneNumber.length() == 12;
    }

    // regester
    public String registerUser(String username, String password, String phoneNumber) {

        if (!checkUserName(username)) {
            return "Username is wrong.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is weak";
        }

        if (!checkCellPhoneNumber(phoneNumber)) {
            return "Phone wrong";
        }

        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;

        return "User registered successfully.";
    }

    // login
    public boolean loginUser(String username, String password) {
        return this.username != null &&
               this.username.equals(username) &&
               this.password.equals(password);
    }

    //login feedback
    public String returnLoginStatus(boolean loginSuccess) {
        return loginSuccess
                ? "youve loged in succesfully. Welcome!"
                : "Login failed";
    }
}
    


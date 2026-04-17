
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginClassTest {
    // unit tests for username, password, phone, login

    Login login = new Login();

    @Test
    public void testCheckUserName() {
        assertTrue(login.checkUserName("ab_1"));
        assertFalse(login.checkUserName("abcdef"));
        assertFalse(login.checkUserName("abcde"));
    }

 //password
    @Test
    public void testCheckPasswordComplexity() {
        assertTrue(login.checkPasswordComplexity("Abcdef1!"));
        assertFalse(login.checkPasswordComplexity("abcdefg"));
        assertFalse(login.checkPasswordComplexity("ABCDEFG1"));
        assertFalse(login.checkPasswordComplexity("Abcdefgh"));
    }

 //cellphonenumber
    @Test
    public void testCheckCellPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+27123456789"));
        assertFalse(login.checkCellPhoneNumber("0712345678"));
        assertFalse(login.checkCellPhoneNumber("+27123"));
    }

//username
    @Test
    public void testRegisterUser() {
        String result = login.registerUser("ab_1", "Abcdef1!", "+27123456789");
        assertEquals("User registered successfully.", result);
    }


    @Test
    public void testLoginUser() {
        login.registerUser("ab_1", "Abcdef1!", "+27123456789");

        assertTrue(login.loginUser("ab_1", "Abcdef1!"));
        assertFalse(login.loginUser("wrong", "wrong"));
    }

    @Test
    public void testReturnLoginStatus() {
        assertEquals("youve loged in succesfully. Welcome!", login.returnLoginStatus(true));
        assertEquals("Login failed", login.returnLoginStatus(false));
    }
}
    


import junit.framework.Assert;
import org.junit.Test;

import userregistration.UserRegistrationTesting;

public class ForTestingOfUserRegistration {
    @Test
    public void testCase(){

        Assert.assertEquals("Valid", UserRegistrationTesting.getUserFirstName("Shilpa"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserLastName("Bhonde"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserEmailID("shilpa123.shilpa@co.co.in"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserPhoneNumber("918888879983"));
        Assert.assertEquals("Valid",UserRegistrationTesting.getUserPassword("Doremon@1234"));
    }
}

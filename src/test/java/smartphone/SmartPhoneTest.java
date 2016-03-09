package smartphone;

import org.junit.Test;
import smartphone.SmartPhone;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


/**
 * Created by Vladimir.
 */
public class SmartPhoneTest {

    public static final String SAMSUNG = "Samsung";

    @Test
    public void equalsTest(){
        Date firstDate = new Date(100);
        SmartPhone firstSmartPhone = new SmartPhone(SAMSUNG, firstDate ,"revision A");
        assertEquals(firstSmartPhone, firstSmartPhone);

        Date secondDate = new Date(100);
        SmartPhone secondSmartPhone = new SmartPhone(SAMSUNG, secondDate ,"revision B");
        assertFalse(secondSmartPhone.equals(firstSmartPhone));

        Date thirdDate = new Date(100);
        SmartPhone thirdSmartPhone = new SmartPhone(SAMSUNG, thirdDate ,"revision A");
        assertEquals(firstSmartPhone, thirdSmartPhone);
    }
}

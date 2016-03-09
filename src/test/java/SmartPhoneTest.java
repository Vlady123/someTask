import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Vladimir.
 */
public class SmartPhoneTest {

    @Test
    public void equalsTest(){
        Date date1 = new Date(100);
        SmartPhone firstSmartPhone = new SmartPhone("Samsung", date1 ,"revision A");
        assertTrue(firstSmartPhone.equals(firstSmartPhone));
        Date date2 = new Date(100);
        SmartPhone secondSmartPhone = new SmartPhone("Samsung", date2 ,"revision B");
        assertFalse(secondSmartPhone.equals(firstSmartPhone));
        Date date3 = new Date(100);
        SmartPhone thirdSmartPhone = new SmartPhone("Samsung", date3 ,"revision A");
        assertTrue(firstSmartPhone.equals(thirdSmartPhone));
    }
}

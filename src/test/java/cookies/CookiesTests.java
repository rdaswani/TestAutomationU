package cookies;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CookiesTests extends BaseTests {

    @Test
    public void deleteCookieTest(){
        deleteCookie();
        System.out.println("Value of get cookie is "+getCookie());
        assertEquals(String.valueOf(getCookie()),"null","test failed");
    }
}

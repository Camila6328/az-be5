package lesson12;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BracketTests {
    BracketsV4 app = new BracketsV4();
//    @Test
//    public void validEmpty(){
//        assertTrue(
//                app.isValid("")
//        );
//    }

    @Test
    public void valid5() {
        assertTrue(app.isValid("{([])}"));
//        assertTrue(app.isValid("{}"));
//        assertTrue(app.isValid("{()}"));
//        assertTrue(app.isValid("{(["));
    }
}
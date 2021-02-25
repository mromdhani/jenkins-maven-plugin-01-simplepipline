package be.businesstraining;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
  
    @Test
    public void shouldReturn20WhenAdding10and10()
    {
        // ARRANGE 
        int a = 10;
        int b = 10;
        int expected = 20;

        // ACT 
        int actual = Calcul.additionner(10, 10);

        // ASSERT
        assertEquals( expected, actual );
    }
    public void shouldReturn100WhenMultiplying10and10()
    {
        int a = 10;
        int b = 10;

        int expected = 100;
        int actual = Calcul.multiplier(10, 10);
        assertEquals( expected, actual );
    }
}

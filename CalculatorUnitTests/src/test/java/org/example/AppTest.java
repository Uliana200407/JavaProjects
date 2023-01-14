package org.example;

import org.example.mathActions.Addition;
import org.example.mathActions.Division;
import org.example.mathActions.Multiplication;
import org.example.mathActions.Subtraction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple Action.
 */
public class AppTest {
    @Test
    public void TestAddition(){
        float addition = Addition.getAddition(2,2);
        Assert.assertEquals ( 4,addition, 0.0001);
    }
    @Test
    public void TestSubtraction(){
        float subtraction = Subtraction.getSubtraction ( (float) 6.6,3);
        Assert.assertEquals ( 3.6,subtraction, 0.0001);
    }
    @Test
    public void TestMultiplication(){
        float multiplication = Multiplication.getMultiplication ( (float) 6.6, (float) 3.3 );
        Assert.assertEquals ( 21.78,multiplication, 0.0001);
    }
    @Test
    public void TestDivision(){
        float division = Division.getDivision ( (float) 33.3, (float) 11.1 );
        Assert.assertEquals ( 3,division, 0.0001);
    }
    @Test
    public void TestDivisionNotEquals(){
        float division = Division.getDivision ( (float) 33.3, (float) 11.1 );
        Assert.assertNotEquals ( 5,division,0.0001 );
    }
    @Test
    public void TestAdditionNotEquals(){
        float addition = Addition.getAddition(88,2);
        if (addition !=44){
            throw new RuntimeException ("Illegal expression");
        }
    }
    @Test
    public void TestMultiplicationEquals(){
        float multiplication = Multiplication.getMultiplication ( (float) 6.6, (float) 3.3 );
        Assert.assertNotEquals ( 3,multiplication,0.0001 );

    }

}

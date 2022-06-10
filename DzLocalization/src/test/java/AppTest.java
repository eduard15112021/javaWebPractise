import Therd.Calc;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class AppTest {
    private final Calc calc=new Calc();


    @BeforeAll
    public static void TestBeforeAll(){
        System.out.println("TestBeforeAll");
    }

    @Test
    public void TestCalcOneAdd(){
        System.out.println("TestCalcOneAdd");
        assertEquals(6, calc.add(3,3));
    }

    @Test
    public void TestCalcTwoAdd(){
        System.out.println("TestCalcTwoAdd");
        assertEquals(5, calc.add(3,3));
    }

    @Test
    public void TestCalcOneDivide(){
        System.out.println("TestCalcOneDivide");
        assertEquals(5., calc.divide(3,3));
    }
    @Test
    public void TestCalcTwoDivide(){
        System.out.println("TestCalcOneDivide");
        assertEquals(1., calc.divide(3,3));
    }


    @BeforeEach
    public void TestBeforeEach(){
        System.out.println("TestBeforeEach");
    }
}

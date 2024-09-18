package com.keyin.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    Calculator calc = new Calculator();


    @Test
    public void testAdd() {
        Assertions.assertEquals(5,calc.add(3,2));
    }

    @Test
    public void testAddingException(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,()->{
            calc.add(0,0);
        });
        Assertions.assertEquals("0 + 0 is Nothing",exception.getMessage());
    }


}

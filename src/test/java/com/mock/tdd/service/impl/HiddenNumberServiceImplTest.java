package com.mock.tdd.service.impl;

import com.mock.tdd.service.HiddenNumberService;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(JUnitParamsRunner.class)
public class HiddenNumberServiceImplTest {

    private HiddenNumberService hiddenNumberService;

    private HiddenNumberServiceImpl sut;

    @Before
    public void init(){
        hiddenNumberService = mock(HiddenNumberService.class);
        sut = new HiddenNumberServiceImpl();
    }


    @Test
    @Parameters({"10, 2, 24, 2", "10, 5, 60, 5", "10, 9, 108, 9"})
    public void testCalculate(int firstNumber, int guessedNumber, int total, int predictedNumber){
        hiddenNumberService.multiply(firstNumber,guessedNumber);
        hiddenNumberService.addition(firstNumber,guessedNumber);
        hiddenNumberService.subtract(firstNumber,guessedNumber);
        hiddenNumberService.findHiddenNumber(total);

        sut.calculate(firstNumber,guessedNumber);

        assertEquals(predictedNumber, sut.calculate(firstNumber,guessedNumber));
        verify(hiddenNumberService).multiply(firstNumber,guessedNumber);
        verify(hiddenNumberService).addition(firstNumber,guessedNumber);
        verify(hiddenNumberService).subtract(firstNumber,guessedNumber);
        verify(hiddenNumberService).findHiddenNumber(total);
    }

    
    private Object[] parameterForTestCalculate() {
        return new Object[] {
                new Object[] {10, 2, 24, 2},
                new Object[] {10, 4, 48, 4},
                new Object[] {10, 7, 84, 7},
                new Object[] {10, 8, 96, 8},
                new Object[] {10, 9, 108, 9}
        };
    }

}

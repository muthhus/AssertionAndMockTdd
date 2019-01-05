package com.mock.tdd.service.impl;

import com.mock.tdd.service.HiddenNumberService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HiddenNumberServiceImplTest {

    private HiddenNumberService hiddenNumberService;

    private HiddenNumberServiceImpl sut;

    @Before
    public void init(){
        hiddenNumberService = mock(HiddenNumberService.class);
        sut = new HiddenNumberServiceImpl();
    }


    @Test
    public void testCalculate(){
        hiddenNumberService.multiply(10,2);
        hiddenNumberService.addition(10,2);
        hiddenNumberService.subtract(10,2);
        hiddenNumberService.findHiddenNumber(24);

        sut.calculate(10,2);

        assertEquals(2, sut.calculate(10,2));
        verify(hiddenNumberService).multiply(10,2);
        verify(hiddenNumberService).addition(10,2);
        verify(hiddenNumberService).subtract(10,2);
        verify(hiddenNumberService).findHiddenNumber(24);
    }

}

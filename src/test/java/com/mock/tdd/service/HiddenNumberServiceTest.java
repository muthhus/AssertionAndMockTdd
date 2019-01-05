package com.mock.tdd.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HiddenNumberServiceTest {

    private HiddenNumberService hiddenNumberService;

    @Before
    public void init(){
        hiddenNumberService = mock(HiddenNumberService.class);
    }

    @Test
    public void hiddenNumberServiceTest(){
        assertTrue(hiddenNumberService instanceof HiddenNumberService);
    }

    @Test
    public void addtionTest() {
        when(hiddenNumberService.addition(10,2)).thenReturn(12);
        assertEquals(12, hiddenNumberService.addition(10,2));
    }

    @Test
    public void multiplyTest(){
        when(hiddenNumberService.multiply(10,2)).thenReturn(20);
        assertEquals(20, hiddenNumberService.multiply(10,2));
    }

    @Test
    public void subtractTest(){
        when(hiddenNumberService.subtract(10,2)).thenReturn(8);
        assertEquals(8, hiddenNumberService.subtract(10,2));
    }

    @Test
    public void findHiddenNumberTest(){
        when(hiddenNumberService.findHiddenNumber(24)).thenReturn(2);
        assertEquals(2, hiddenNumberService.findHiddenNumber(24));
    }

}

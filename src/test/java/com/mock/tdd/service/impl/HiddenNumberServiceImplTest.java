package com.mock.tdd.service.impl;

import com.mock.tdd.service.HiddenNumberService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class HiddenNumberServiceImplTest {

    private HiddenNumberService hiddenNumberService;

    private HiddenNumberServiceImpl sut;

    @Before
    public void init(){
        hiddenNumberService = mock(HiddenNumberService.class);
    }

    @Test
    public  void findHiddenNumberTest(){
        sut = new HiddenServiceImpl();
    }

}

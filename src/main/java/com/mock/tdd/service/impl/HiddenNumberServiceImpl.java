package com.mock.tdd.service.impl;

import com.mock.tdd.service.HiddenNumberService;


public class HiddenNumberServiceImpl implements HiddenNumberService {

    public HiddenNumberServiceImpl(){
    }

    public int calculate(int a, int b){
       int number = multiply(a,b) + addition(a,b)-subtract(a,b);

        if(number > 0){
           return findHiddenNumber(number);
        } else {
            return -1;
        }
    }

    public int addition(int a, int b) {
        return a+b;
    }


    public int multiply(int a, int b) {
        return a*b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int findHiddenNumber(int total) {
        if((total/12) > 0) {
            return total / 12;
        } else {
            return -1;
        }
    }
}

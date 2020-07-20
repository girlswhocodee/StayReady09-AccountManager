package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {
    CheckingAccount cAccount;
    
    @Before
    public void initial() {
        cAccount = new CheckingAccount(246810, "Cam", 60.00, 2468, 500.00, 1.0);
    }

    @Test
    public void getNameTest(){
        //Given
        String expected = "Cam";

        //When 
        String actual = cAccount.getName();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAccountNumTest(){
        //Given
        Integer expected = 246810;

        //When 
        Integer actual = cAccount.getAccountNumber();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFeesTest() {
        //Given
        Double expected = 60.00;

        //When 
        Double actual = cAccount.getFees();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getRateTest(){
        //Given
        Double expected = 1.0;

        //When 
        Double actual = cAccount.getRate();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPinTest(){
        //Given
        Integer expected = 2468;

        //When 
        Integer actual = cAccount.getPin();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBalanceTest(){
        //Given
        Double expected = 549.00;
        cAccount.deposit(50.0);
        cAccount.withdraw(1.00);

        //When 
        Double actual = cAccount.getBalance();
        
        //Then
        Assert.assertEquals(expected, actual);
    }
}
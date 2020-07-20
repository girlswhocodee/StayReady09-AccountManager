package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
    SavingsAccount sAccount;
    
    @Before
    public void initial() {
        sAccount = new SavingsAccount(12345678, "Cam", 20.00, 1234, 1500.00, .03);
    }

    @Test
    public void getNameTest(){
        //Given
        String expected = "Cam";

        //When 
        String actual = sAccount.getName();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAccountNumTest(){
        //Given
        Integer expected = 12345678;

        //When 
        Integer actual = sAccount.getAccountNumber();
        
        //Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void getFeesTest() {
        //Given
        Double expected = 20.00;

        //When 
        Double actual = sAccount.getFees();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getRateTest(){
        //Given
        Double expected = 0.03;

        //When 
        Double actual = sAccount.getRate();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPinTest(){
        //Given
        Integer expected = 1234;

        //When 
        Integer actual = sAccount.getPin();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBalanceTest(){
        //Given
        Double expected = 1699.00;
        sAccount.deposit(200.0);
        sAccount.withdraw(1.00);

        //When 
        Double actual = sAccount.getBalance();
        
        //Then
        Assert.assertEquals(expected, actual);
    }
}
/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis.singleGame;
import java.util.Date;

/**
 * Auto-generated: 2018-05-06 21:33:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Home {

    private String decimalValue;
    private String fractionalValue;
    private String americanValue;
    private int expected;
    private int actual;
    public void setDecimalValue(String decimalValue) {
         this.decimalValue = decimalValue;
     }
     public String getDecimalValue() {
         return decimalValue;
     }

    public String getFractionalValue() {
        return fractionalValue;
    }

    public void setFractionalValue(String fractionalValue) {
        this.fractionalValue = fractionalValue;
    }

    public void setAmericanValue(String americanValue) {
         this.americanValue = americanValue;
     }
     public String getAmericanValue() {
         return americanValue;
     }

    public void setExpected(int expected) {
         this.expected = expected;
     }
     public int getExpected() {
         return expected;
     }

    public void setActual(int actual) {
         this.actual = actual;
     }
     public int getActual() {
         return actual;
     }

}
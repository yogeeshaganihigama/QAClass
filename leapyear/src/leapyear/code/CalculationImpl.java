/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear.code;
/**
 *
 * @author Iresh
 */
public class CalculationImpl implements Calculation{
            @Override
    public void calculate(int year) {
       
               if((year%4==0) && ((year%100!=0) || (year%400==0))){
                   System.out.println(year+" is a Leap Year");
               }else
                    System.out.println(year+" is not a Leap Year");
               
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.InputMismatchException;
import java.util.Scanner;
import leapyear.code.Calculation;
import leapyear.code.CalculationImpl;


/**
 *
 * @author Iresh
 */
public class Leapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculation calculation = new CalculationImpl();
        Scanner scanner = new Scanner(System.in);
        try {
           System.out.println("Enter Year");
        int year=scanner.nextInt();
        calculation.calculate(year); 
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage()+" WRONG!!!!!! You can enter numbers only");
        }
        
    }
    
}

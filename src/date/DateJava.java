/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class DateJava {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        showTodaysDate();
        showUSDateFormat();
        System.out.println("How many days would you like to add?: ");
        daysAddition(scan.nextLong());
        
        
    }
    public static void showUSDateFormat(){
        LocalDate today = LocalDate.now();
        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("US date format: "+today.format(usDateFormat));
    }
    
    public static void showTodaysDate(){
        LocalDate date = LocalDate.now();
        System.out.println("Today's date: "+date);
    }
    
    public static void daysAddition(long daysCount){
        LocalDate date = LocalDate.now();
        System.out.print(date+" plus "+ daysCount+" is ");
        date = date.plusDays(daysCount);
        System.out.println(date);
    }    
}

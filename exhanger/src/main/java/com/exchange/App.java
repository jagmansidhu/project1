package com.exchange;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App

{
    // exchange rates ------------
    // in future we get this data by api getting new fresh data
    // for now we just want a input of person and give the output of exchange rate
    private static double cadusd = .432;
    private static double usdcad = 1.4;

    // WHAT PURPOSE DOES THIS HAVE??
   // public static void in_out () {
     //   String in = "cad";
       // String out = "usd";
        // Here we take the conversion dollar signs
        // In future we can make it a dropdown we can grab from

 //   }

    // HEre we take in input of dollar amount and grab the in_out input 
    // and determine what our conversion is and do the calculation
    public static void convert(String in_conversion, String out_conversion, double amount ){
        String exchange_name = in_conversion + out_conversion;
        double output = 0.00;
        
        // When getting data from wayyy bigger database we would need some search algoritthm
        if(exchange_name.equals("cadusd")){
            output = amount * cadusd;
        } else {
            output = amount * usdcad;
        }
        System.out.println(output);
    }

    



    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Currency");
        String in = input.nextLine();

        System.out.print("Output Currency");
        String out = input.nextLine();

        System.out.print("Output Currency");
        double amnt = input.nextInt();

        convert(in, out, amnt);

    }
}


package secretaria.java;

import java.util.Scanner;

        
public class Netpay {
   

  public void getPay(){
        Scanner input = new Scanner(System.in);

        
         
         String name;
         int age,Rphr,Thrs,Tdeduc;
         double Tgross,Netpay;
         
         System.out.print("Enter your Name: ");
         name = input.nextLine();
          
         System.out.print("Enter your age:");
         age = input.nextInt();
         
         System.out.print("Enter rate per hour:");
         Rphr = input.nextInt();
         
         System.out.print("Enter total hours worked:");
         Thrs = input.nextInt();
         
         System.out.print("Enter total deductions:");
         Tdeduc = input.nextInt();
         
         Tgross = Rphr*Thrs;
         Netpay = Tgross-Tdeduc;
         
         
         System.out.println("--------------------");
         System.out.println("------SEE DETAILS------");
         System.out.println("--------------------");
         
         System.out.println("Date: September 12,2024");
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
         
         System.out.printf("Total gross: %.2f", +Tgross);
         System.out.println("\n Total Deduction: "+Tdeduc);
         System.out.println("\n--------------------");

                 
       
         
  }
}
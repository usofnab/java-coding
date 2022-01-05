/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephone.contract.manager;

import java.util.Scanner;

/**
 *
 * @author M1903433
 */
public class TelephoneContractManager {
    static Scanner sc = new Scanner(System.in);
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("1.  Enter new Contract\n2.  Display Summary of Contracts\n3.  Display Summary of Contracts for Selected Month\n4.  Find and display Contract\n0.  Exit");
        System.out.print("Please select a menu number: ");
        menuLoop();
    }// MAIN END
    public static void menuLoop(){
    String menuNum = "1";
    while (!"0".equals(menuNum)){
        menuNum = sc.next();
        if ("1".equals(menuNum)){
            menu1();
        }else if("2".equals(menuNum)){
            menu2();
        }else if("3".equals(menuNum)){
            menu3();
        }else if("4".equals(menuNum)){
            menu4();
        }else if("0".equals(menuNum)){
            System.out.println("Thanks for using our system!");
        }else{
            System.out.print("Please select an actual menu number: ");
        }
    }
    }
    public static void menu1(){
    
    }
    public static void menu2(){
    
    }
    public static void menu3(){
    
    }
    public static void menu4(){
    
    }
}// DO NOT TYPE PAST HERE

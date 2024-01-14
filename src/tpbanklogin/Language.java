/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpbanklogin;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class Language {
     Scanner sc = new Scanner(System.in);
    Validation check = new Validation();

    //ChooseLanguageNumber
    public int chooseLanguage() {
        System.out.println("--------Login--------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Choose optiopn: ");
        String option = sc.nextLine();
        boolean loop = true;
        //loop for check input language number
        while (loop) {
            if (check.checkLanguageNumber(option)) {
                loop = false;
            } else {
                System.out.println("Only enter 1 or 2 or 3. Please try again!(Chi nhap 1,2 hoac 3. Vui long thu lai)");
                System.out.print("Option: ");
                option = sc.nextLine();
                loop = true;
            }
        }
        return Integer.parseInt(option);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpbanklogin;

/**
 *
 * @author Slime nightmare
 */
public class MainScreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //step 1: Choose language
        Language lang = new Language();
        int language = lang.chooseLanguage();
        System.out.println("language = " + language);
        //step 2: Input account number
        //step 3: Input password
        //step 4: Input capcha
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpbanklogin;

/**
 *
 * @author Slime nightmare
 */
public class Validation {
    //check input language number
    public boolean checkLanguageNumber(String languageNumber){
        return languageNumber.matches("[1-3]");
    }
}

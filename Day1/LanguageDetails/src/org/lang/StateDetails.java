/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lang;

/**
 *
 * @author siva9
 */
public class StateDetails {
    public void southIndia(){
        System.out.println("Method southIndia");
    }
    public void northIndia(){
        System.out.println("Method northIndia");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LanguageInfo obj1 = new LanguageInfo();
        StateDetails obj2 = new StateDetails();
        obj2.southIndia();
        obj2.northIndia();
        obj1.tamilLanguage();
        obj1.englishLanguage();
        obj1.hindiLanguage();
    }
    
}

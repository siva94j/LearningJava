/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.company;

/**
 *
 * @author siva9
 */
public class CompanyInfo {

   public void companyName(){
       System.out.println("I am currently working at AlphaCloudLabs");
   }
   public void companyId(){
       System.out.println("Company id is 12345678");
   }
   public void companyAddress(){
       System.out.println("Address: 40, Global Infocity, MGR Main Road, Perungudi-96");
   }
    public static void main(String[] args) {
        CompanyInfo obj = new CompanyInfo();
        obj.companyName();
        obj.companyId();
        obj.companyAddress();
    }
    
}

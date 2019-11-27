/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.phone;

/**
 *
 * @author siva9
 */
public class PhoneInfo {
    public void phoneName(){
        System.out.println("Phone: iPhone 7");
    }
    public void phoneimeiNum(){
        System.out.println("IMEI: 123456789");
    }
    public void Camera(){
        System.out.println("Camera: 12MP");
    }
    public void storage(){
        System.out.println("Storage: 128GB");
    }
    public void osName(){
        System.out.println("osName: iOS 13.2");
    }
    public static void main(String[] args) {
        PhoneInfo obj = new PhoneInfo();
        obj.phoneName();
        obj.phoneimeiNum();
        obj.Camera();
        obj.storage();
        obj.osName();
    }
    
}

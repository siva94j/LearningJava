/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp;

/**
 *
 * @author alpha
 */
public class Employee {
    int emp_id = 123456789;
    String emp_name = "Siva";
    String emp_dob = "24/02/1994";
    long emp_phone = 9791268599l;
    String emp_email = "siva94j@gmail.com";
    String emp_address = "Plot 77, 3rd Main Road, CBI Colony, Perungudi - 96";
    
    public void empId()
    {
        System.out.println("Employee ID:"+emp_id);
    }
    public void empName()
    {
        System.out.println("Employee ID:"+emp_name);
    }
    public void empDOB()
    {
        System.out.println("Employee ID:"+emp_dob);
    }
    public void empPhone()
    {
        System.out.println("Employee ID:"+emp_phone);
    }
    public void empEmail()
    {
        System.out.println("Employee ID:"+emp_email);
    }
    public void empAddress()
    {
        System.out.println("Employee ID:"+emp_address);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empId();
        emp.empName();
        emp.empDOB();
        emp.empPhone();
        emp.empEmail();
        emp.empAddress();
    }
}

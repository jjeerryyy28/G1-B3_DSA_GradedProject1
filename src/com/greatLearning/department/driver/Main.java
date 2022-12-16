
package com.greatLearning.department.driver;

import com.greatLearning.department.AdminDepartment;
import com.greatLearning.department.HRDepartment;
import com.greatLearning.department.SuperDepartment;
import com.greatLearning.department.TechDepartment;


public class Main {

    public Main(){
        super();
    }

    public static void main(String[] args) {
        SuperDepartment sd = null;
        HRDepartment hr = new HRDepartment();
        AdminDepartment ad = new AdminDepartment();
        TechDepartment td = new TechDepartment();

        System.out.print("\n");

        //Displaying functionality for HR Department:-
        System.out.println("Welcome to "+hr.departmentName());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.doActivity());
        //now through upcasting super class reference variables
        sd = hr;
        System.out.println(sd.isTodayAHoliday());
        System.out.println();
        //Display function for hr department ends here

        //Displaying functionality for Tech Department:-
        System.out.println("Welcome to "+td.departmentName());
        System.out.println(td.getTodaysWork());
        System.out.println(td.getWorkDeadline());
        System.out.println(td.getTechStackInformation());
        //similarly again upcasting:
        sd = td;
        System.out.println(sd.isTodayAHoliday());
        System.out.println();
        //display function for tech department ends here

        //displaying functionalities for admin department:
        System.out.println("Welcome to "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        //upcasting
        sd = ad;
        System.out.println(sd.isTodayAHoliday());
        //display function for admin department ends here


    }
}

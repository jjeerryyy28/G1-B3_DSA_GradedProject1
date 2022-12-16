package com.greatLearning.department;
/*
* This class contains HR Department functionality
*
*   @author Lovely, Kunal, Sarang, Prajwal
*/
public class HRDepartment extends SuperDepartment{

    public HRDepartment(){
        super();
    }

    public String departmentName(){
        return "HR Department";
    }

    public String getTodaysWork(){

        return "Fill today’s timesheet and mark your attendance";
    }

    public String getWorkDeadline(){

        return "Complete by EOD ";
    }

    public String doActivity(){
        return "team Lunch";
    }
}

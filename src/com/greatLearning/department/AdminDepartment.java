package com.greatLearning.department;

public class AdminDepartment extends  SuperDepartment{

    public AdminDepartment(){
        super();
    }

    public String departmentName(){
        return "Admin Department";
    }

    public String getTodaysWork(){
        return "Complete your document submission";
    }

    public String getWorkDeadline(){
        return "Complete by EOD";
    }
}

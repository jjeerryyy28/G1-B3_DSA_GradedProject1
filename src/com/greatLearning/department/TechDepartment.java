package com.greatLearning.department;

public class TechDepartment extends SuperDepartment{
    public TechDepartment(){
        super();
    }

    public String departmentName(){
        return "Tech Department";
    }

    public String getTodaysWork(){
        return "Complete coding of module 1";
    }

    public String getWorkDeadline(){
        return "Complete by EOD";
    }

    public String getTechStackInformation(){
        return "core Main";
    }
}

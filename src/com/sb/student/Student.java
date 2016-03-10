package com.sb.student;

/**
 * Created by KJMACBOOK on 3/4/16.
 */

public class Student
{
    private String firstName = "";
    private String lastName = "";
    public String courseName = "";
    public Student next;

    public Student(String fName, String lName)
    {
        this.firstName = fName;
        this.lastName = lName;
    }

    public Student(String cName)
    {
        this.courseName = cName;
    }


    //Getters and Setters
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String fName)
    {
        this.firstName = fName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lName)
    {
        this.lastName = lName;
    }

    public String getCourseName (String courseName)
    {
        return courseName;
    }

    public String setCourseName (String courseName)
    {
        this.courseName = courseName;
    }


    public void display()
    {
        System.out.println(courseName);
    }


    public String toString()
    {
        return courseName;
    }

}





















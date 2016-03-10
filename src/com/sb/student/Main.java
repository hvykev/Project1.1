package com.sb.student;

import java.util.Scanner;

/**
 * Created by KJMACBOOK on 3/10/16.
 */

public class Main
{
    public String className;
    public int enrolledStudents;

    // Reference to next link made in the SLList
    // Holds the reference to the Link that was created before it
    // Set to null until it is connected to other links

    public Main next;

    public Main (String className, int enrolledStudents)
    {
        this.className = className;
        this.enrolledStudents = enrolledStudents;
    }

    public void display()
    {
        System.out.println(className + "\n Total Students Enrolled: " + enrolledStudents);
    }

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        int classChoice;
        String classNameChoice;
        int enrolledStudents = 0;

        Course offeredCourse = new Course();

        // Insert Link and add a reference to the node Link added just prior
        // to the field next

        offeredCourse.insertFirstLink("ENG101", enrolledStudents);
        offeredCourse.insertFirstLink("ECON101", enrolledStudents);
        offeredCourse.insertFirstLink("SE101", enrolledStudents);
        offeredCourse.insertFirstLink("MATH101", enrolledStudents);

        offeredCourse.display();
        System.out.println("Enter the amount of classes you are registering for. Maximum of 4. ");
        classChoice = ui.nextInt();

        if (classChoice > 4)
        {
            classChoice = 4;
        }

        ui.nextLine();

        for (int flc =0; classChoice > flc; flc++)
        {
            System.out.println("Please enter a course name:");
            classNameChoice = ui.nextLine();
            offeredCourse.find(classNameChoice);
        }

        offeredCourse.display();
    }
}

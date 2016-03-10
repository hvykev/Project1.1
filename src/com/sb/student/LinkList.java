package com.sb.student;

/**
 * Created by KJMACBOOK on 3/4/16.
 */

public class LinkList
{
    public Student firstLink;

    LinkList()

    {
        firstLink = null;
    }

    public boolean isEmpty()
    {
        return(firstLink == null);
    }

    public void insertFirstLink(String fName, String lName)
    {
        Student newLink = new Student(fName, lName);

        newLink.next = firstLink;

        firstLink = newLink;
    }

    public Student removeFirst()
    {
        Student linkReference = firstLink;

        if(!isEmpty())
        {
            firstLink = firstLink.next;
        }
        else
        {
            System.out.println("Empty LinkedList");
        }

        return linkReference;
    }

    public void display()
    {
        Student myLink = firstLink;

        while(myLink != null)
        {
            myLink.display();

            System.out.println("Next Link: ");

            myLink = myLink.next;

            System.out.println();
        }
    }

    public Student find (String courseName)
    {
        Student myLink = myLink;

        if (! isEmpty())
        {
            while (myLink.courseName != courseName)
            {
                if (myLink.next == null)
                {
                    return null;
                }
                else
                {
                    myLink = myLink.next;
                }
            }
        }
        else
            {
                System.out.println("Empty LinkedList");
            }
            return myLink;
        }

        public Student removeLink (String courseName)
        {
            Student currentLink = firstLink;
            Student previousLink = firstLink;

            while (currentLink.courseName != courseName)
            {
                if(currentLink.next == null)
                {
                    return null;
                }
                else
                {
                    previousLink = currentLink;
                    currentLink = currentLink.next;
                }
            }
            if(currentLink == firstLink)
            {
                return null;
            }
            return currentLink;
        }
    }
}//end class


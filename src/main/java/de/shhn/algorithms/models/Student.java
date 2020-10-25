package de.shhn.algorithms.models;

public class Student implements Comparable  {
    public Student()
    {

    }
    public Student(int studentNumber, String fullName, double grade)
    {
        this.StudentNumber = studentNumber;
        this.FullName = fullName;
        this.Grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if(this.Grade == student.Grade)
            return 0;
        else if(this.Grade > student.Grade)
            return 1;
        else
            return -1;
    }

    public int StudentNumber;
    public String FullName;
    public double Grade;

}

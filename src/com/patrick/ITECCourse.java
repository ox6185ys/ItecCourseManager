package com.patrick;
import java.util.ArrayList;
/**
 * Created by Patrick on 3/13/2016.
 */
public class ITECCourse {
    private String name;
    private int code;
    private ArrayList <String> students;
    private int maxStudents;
    private String roomNumber;
    //Constructor
    ITECCourse(String courseName, int courseCode, int courseMaxStudents, String roomNumber)
    {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.roomNumber = roomNumber;
    }
    public void addStudent(String studentName)
    {
        //don't need to check if students ArrayList is null –
        //we know that the constructor set it up
        students.add(studentName);
    }
    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        //System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The class meets in room number " + roomNumber );
        System.out.println("The max number of students that can enroll in this course is " + this.maxStudents);
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
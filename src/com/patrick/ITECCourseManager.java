package com.patrick;

/**
 * Created by Patrick on 3/13/2016.
 */
public class ITECCourseManager {
    public static void main(String args[]) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "50");
        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.writeCourseInfo();
        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30, "60");

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.writeCourseInfo();

    }
}

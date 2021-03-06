package com.example.service.Interface;


import com.example.model.Course;
import com.example.model.Student;

import java.util.List;

public interface IStudentService {
//    enroll in a class
//    drop a class
//    view their current schedule
//    view their unofficial transcript
//    buy an official transcript ($5)
//    view all course
//    view all classes in current semester
//    view all classes in a subject in current semester
//    view all classes by an instructor in a current semester
//    view all classes at a certain time in the current semester
//    view all courses in a department
//    view all current classes in a department
//    view all majors in a department

    List<Student> getAllStudents();
    List<Class> GetAllClassesOfStudentByID(int studentId);
    List<Class> GetAllSchedules(int studentId);
    List<Course> GetAllCoursesByDepartmentID(int departmentId);
    List<Class> GetClassesOfUserDepartmentById(int studentId, int department);
//    List<Major> GetAllMajorsByDepartmentId(int department);


}
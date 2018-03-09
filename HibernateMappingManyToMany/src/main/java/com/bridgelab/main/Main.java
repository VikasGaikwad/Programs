package com.bridgelab.main;

import com.bridgelab.dao.StudentDao;
import com.bridgelab.dto.Student;
import com.bridgelab.dto.Subject;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Sam","Disilva");
        Student student2 = new Student("Joshua", "Brill");
         
        Subject subject1 = new Subject("Economics");
        Subject subject2 = new Subject("Politics");
        Subject subject3 = new Subject("Foreign Affairs");
 
        //Student1 have 3 subjects
        student1.getSubjects().add(subject1);
        student1.getSubjects().add(subject2);
        student1.getSubjects().add(subject3);
         
        //Student2 have 2 subjects
        student2.getSubjects().add(subject1);
        student2.getSubjects().add(subject2);
        StudentDao.saveStudent(student1);
        StudentDao.saveStudent(student2);
	}

}

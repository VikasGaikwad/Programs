package com.bridgeit.main;

import com.bridgeit.dao.StudentDao;
import com.bridgeit.dao.UniversityDao;
import com.bridgeit.dto.Student;
import com.bridgeit.dto.University;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Sam","Disilva","Maths");
		Student student2 = new Student("Joshua", "Brill", "Science");
		Student student3 = new Student("Peter", "Pan", "Physics");
		
		University university = new University("CAMBRIDGE", "ENGLAND");
		UniversityDao.saveUniversity(university);
		student1.setUniversity(university);
		student2.setUniversity(university);
		student3.setUniversity(university);
		StudentDao.saveStudent(student1);
		StudentDao.saveStudent(student2);
		StudentDao.saveStudent(student3);
		
	}

}

package com.mapping.main;



import com.mapping.dao.AddressDao;
import com.mapping.dao.StudentDao;
import com.mapping.dto.Address;
import com.mapping.dto.Student;

public class ClientForSave {
	public  static  void main(String args[])
	{

		Student  s = new Student();
		s.setStudentId(101);
		s.setStudentName("James");
		s.setGrp("mpc");

		Address  ad = new Address();
		ad.setAddressId(1);
		ad.setPlace("Carolina");

		ad.setParent(s);
		
		
		 StudentDao.saveStudent(s);
		 AddressDao.saveAddress(ad);
		
	}
}

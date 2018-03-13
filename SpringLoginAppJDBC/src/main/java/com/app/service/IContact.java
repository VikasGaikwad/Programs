package com.app.service;

import java.util.List;

import com.app.model.Contact;

public interface IContact {
	
	/*defining CRUD operations for DAO */
	public void saveOrUpdate(Contact contact);
	public void delete(int contactId);
	public void contact(int contactId);
	public List<Contact> list();

}

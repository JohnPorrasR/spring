package com.johnporrasr.service;

import java.util.List;

import com.johnporrasr.entity.Contact;
import com.johnporrasr.model.ContactModel;

public interface ContactService {

	  public abstract ContactModel addContact(ContactModel contactModel);

	  public abstract List<ContactModel> listAllContacts();
	  
	  public abstract Contact findContactById(int id);
	  
	  public abstract void removeContact(int id);
	  
	  public abstract ContactModel findContactByIdModel(int id);
  
}

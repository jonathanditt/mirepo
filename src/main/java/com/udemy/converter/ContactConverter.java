package com.udemy.converter;

import org.springframework.stereotype.Component;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {
	
	public Contact convertContactModel2Contact(ContactModel contactMoldel){
		Contact contact = new Contact();
		contact.setCity(contactMoldel.getCity());
		contact.setFirstname(contactMoldel.getFirstname());
		contact.setId(contactMoldel.getId());
		contact.setLastname(contactMoldel.getLastname());
		contact.setTelephone(contactMoldel.getTelephone());
		return contact;
	}
	
	public ContactModel convertContact2ContactModel(Contact contact){
		ContactModel contactModel =  new ContactModel() ;
		contactModel.setCity(contact.getCity());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setId(contact.getId());
		contactModel.setLastname(contact.getLastname());
		contactModel.setTelephone(contact.getTelephone());
		return contactModel;
	}

}

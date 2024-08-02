package com.contact.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.entity.Contact;


public interface ContactRepo extends JpaRepository<Contact, Serializable>{	
	
	public List<Contact> findByStatus(String status);
}

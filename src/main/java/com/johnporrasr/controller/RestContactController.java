package com.johnporrasr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.johnporrasr.model.ContactModel;

@RestController
public class RestContactController {
	
	@CrossOrigin("http://localhost:8080")
	@RequestMapping(value = "/listacontactos", method = RequestMethod.GET, headers = {"Content-type=application/json"})
	public ResponseEntity<ContactModel> listarContatos()
	{
		ContactModel cm = new ContactModel(2, "John", "Porrasr", "900900900", "Lima");
		return new ResponseEntity<ContactModel>(cm, HttpStatus.OK);
	}

}

package com.springboot.datatransfering.datatransfer.com.springboot.datatransfering.datatransfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.datatransfering.datatransfer.com.springboot.datatransfering.datatransfer.service.DataObjectService;

@RestController
public class DataObjectController {

	@Autowired
	private DataObjectService service;

	@GetMapping("/get-file")
	public void getData() {
		service.getData();
	}

}

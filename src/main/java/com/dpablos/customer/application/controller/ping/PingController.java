package com.dpablos.customer.application.controller.ping;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class PingController {

	@GetMapping(path = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> ping() {
		return ResponseEntity.ok().build();
	}

}
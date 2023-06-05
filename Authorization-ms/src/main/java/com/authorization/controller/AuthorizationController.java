package com.authorization.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.ems.service.CustomUserDetailService;
import com.ems.util.JwtUtil;


@RestController
public class AuthorizationController {


		private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizationController.class);

		private JwtUtil jwtUtil;

		private CustomUserDetailService userDetailService;

		private AuthenticationManager authenticationManager;

		
		@Autowired
		public AuthorizationController(JwtUtil jwtUtil, CustomUserDetailService userDetailService,
				AuthenticationManager authenticationManager) {

			this.jwtUtil = jwtUtil;
			this.userDetailService = userDetailService;
			this.authenticationManager = authenticationManager;
		}
		
		@GetMapping("/")
		public ResponseEntity<String> welcome() {
			LOGGER.info("STARTED authorization microservice welcome");
			LOGGER.info("END - authorization microservice welcome");
			return ResponseEntity.ok("Wecome to security application");
		}
		
		@PostMapping("/authenticate")
		public ResponseEntity<String> generateToken(@RequestBody AuthRequest authRequest) throws Exception {
			LOGGER.info("STARTED - generateToken");
			try {
				authenticationManager.authenticate(
						new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));

			} catch (Exception e) {
				LOGGER.error("EXCEPTION - generateToken");
				throw new ResourceNotFound("user not found");
			}

			LOGGER.info("END - generateToken");
			return ResponseEntity.ok(jwtUtil.generateToken(authRequest.getUserName()));
		}
		

	}



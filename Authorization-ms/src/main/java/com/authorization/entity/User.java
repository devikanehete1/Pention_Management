package com.authorization.entity;

import javax.persistence.Id;

public class User {

	
		@Id
		private int id;
		private String userName;
		private String password;
		public User() {
			
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public User(int i, String userName, String password) {
			super();
			this.id =i;
			this.userName = userName;
			this.password = password;
		}

	}


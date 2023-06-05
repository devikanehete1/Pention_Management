package com.authorization.entity;

public class AuthRequest {
	

		private String userName;
		private String password;
		
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserName() {
			return userName;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getPassword() {
			return password;
		}
		
		public AuthRequest(String userName, String password) {
			super();
			this.userName = userName;
			this.password = password;
		}
		public AuthRequest() {
			super();
		}
		

	
}

package com.casestudy;

public class Person {
	 private String personName;
	    private String emailld;
		public String getPersonName() {
			return personName;
		}
		public void setPersonName(String personName) {
			this.personName = personName;
		}
		public String getEmailld() {
			return emailld;
		}
		public void setEmailld(String emailld) {
			this.emailld = emailld;
		}
		public Person(String personName, String emailld) {
			super();
			this.personName = personName;
			this.emailld = emailld;
		}
	    
		
}


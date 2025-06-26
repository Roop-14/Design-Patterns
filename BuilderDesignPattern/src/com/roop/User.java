package com.roop;

public final class User {

	private final String userName;// must
	private final String userId;// must
	private final String userAge;
	private final String useremail;

	private User(Builder builder) {

		this.userName = builder.userName;
		this.userId = builder.userId;
		this.userAge = builder.userAge;
		this.useremail = builder.useremail;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserAge() {
		return userAge;
	}

	public String getUseremail() {
		return useremail;
	}

	public static class Builder {
		private final String userName;// must
		private final String userId;// must
		private String userAge;
		private String useremail;

		public Builder(String userName, String userId) {

			this.userName = userName;
			this.userId = userId;
		}

		public Builder setUserAge(String userAge) {

			this.userAge = userAge;
			return this;
		}

		public Builder setUserEmail(String useremail) {

			this.useremail = useremail;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

}

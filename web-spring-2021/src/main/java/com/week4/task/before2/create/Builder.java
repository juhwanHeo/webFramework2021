package com.week4.task.before2.create;

/*
 * 디자인 생성 패턴: 빌더
 * https://readystory.tistory.com/121
*/
class User {
	private String name;
	private int age;
	private String addr;
	
	public User(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	static class UserBuilder {
		private String name;
		private int age;
		private String addr;
		
		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder setAddr(String addr) {
			this.addr = addr;
			return this;
		}
		
		public User build() {
			return new User(name, age, addr);
		}
		
	}
	
}

public class Builder {
	public static void main(String[] args) {
		User user = new User.UserBuilder()
				.setName("Heo")
				.setAge(23)
				.setAddr("��⵵")
				.build();
		
		System.out.println(user);
	}
}

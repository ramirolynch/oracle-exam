package com.ramirolynch;

import java.io.IOException;

public class HandlingExceptions {
	
	public static void main(String[] args) {
		
		HandlingExceptions age1 = new HandlingExceptions();
		
		// setAge2 must be surrounded by try / catch
		
		try {
			age1.setAge2(101);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// setAge1 doesn't need to be surrounded by try / catch because
		// it is an unchecked exception
		
		age1.setAge1(0);
		
	}

	private int age;
	
	// this is an unchecked exception so it will compile and run without try catch
	
	void setAge1(int age) throws IllegalArgumentException {
		if(age <= 0) {
			throw new IllegalArgumentException("the age should be higher than 0");
		}
		
		this.setAge(age);
	}
	
	
	// this is a checked exception so we have to try / catch
	void setAge2(int age) throws IOException {
		
		if(age > 100) { throw new IOException("the person is too old");
	
		}
		
		this.setAge(age);
		
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

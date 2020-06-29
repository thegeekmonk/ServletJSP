package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="student")
public class Student 
{
	@Id
    private int roll;
    private String name;
    
    
	public int getRoll() 
	{
		return roll;
	}
	public void setRoll(int roll) 
	{
		this.roll = roll;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	@Override
	public String toString() 
	{
		return "Student [roll=" + roll + ", name=" + name + "]";
	}  
	
    
}

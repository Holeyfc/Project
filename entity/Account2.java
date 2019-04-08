//@author HoleyFanClub
//@version 2.0
package entity;

import javax.swing.*;
import controllers.*;
public class Account2 {
  
  String password;
  String username;
  String firstName;
  String lastName;
  Character status;
  Character type;
  DatabaseController lib;
  SearchController search;
  LogonController log;
  boolean loggedIn;
  
  public Account2(String username, String firstName, String lastName, String password, Character type, Character status)
  {
    this.username = username;
    this.password = password;
    this.status = status;
    this.type = type;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public void setUsername(String name)
  {
	  this.username = name;
  }
  public String getUsername()
  {
	  return this.username;
  }
  public void setPassword(String password)
  {
	  this.password = password;
  }
  public String getPassword()
  {
	  return this.password;
  }
  public void setStatus(char status)
  {
	  this.status = status;
  }
  public char getStatus()
  {
	  return this.status;
  }
  public void setType(char type)
  {
	  this.type = type;
  }
  public char getType()
  {
	  return this.type;
  }
  public void setFirst(String fName)
  {
	  this.firstName = fName;
  }
  public String getFirst()
  {
	  return this.firstName;
  }
  public void setLast(String lName)
  {
	  this.lastName = lName;
  }
  public String getLast()
  {
	  return this.lastName;
  }
  
  public void logon()
  {
	this.loggedIn = true;  
  }
  
  public void logoff()
  {
	this.loggedIn = false;  
  }
  
  public boolean isLoggedIn()
  {
	  return this.loggedIn;
  }
  
  
}




package entity;
import UI.*;
import controllers.*;

/**
 * @author HoleyFanClub
 * @version 2.0
 *
 */
public class Admin extends Account2
{
  
  
  private String password;
  public String userName, first, last;
  private char type;
  private char status;
  

  /**
   * creating an admin account
   * @param userName the user name
   * @param password the password of the account
   * param type the account type, admin or student
   */
  public Admin(String username, String first, String last,
		  String password, char type, char status) 
  {
	  super(username, first, last, password, type, status);
  }
 
   
  }

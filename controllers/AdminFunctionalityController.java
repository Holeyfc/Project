/**
 * 
 */
package controllers;
import entity.*;
import controllers.*;

/**
 * @author nhoberg001
 *
 */
public class AdminFunctionalityController {
  
  /**
   * 
   */
  public LogonController logger;
  public DatabaseController database;
  
  public AdminFunctionalityController() 
  {
    this.database = new DatabaseController();
  }
  
  /**
   * 
   * @param user
   */
  public void deactivateUser(Account2 user)
  {
    this.database.deactivateUser(user);
  }
  
  /**
   * 
   */
  public void editUser(Account2 user)
  {
	  
	    String[][] users = this.database.getListOfUniversities();
	    for(int i = 0; i < users.length; i++)
	    {
	    	if(user.getUsername() == users[i][2])
	    	{
	    		throw new IllegalArgumentException();
	    		//username is not unique
	    	}
	    } 
  }
  /**
   * java.lang.String school, java.lang.String state, java.lang.String location,
   java.lang.String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath,
   double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
   double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale
   */
  
  public void addNewUniversity(University university)
  {
    String[][] unis = this.database.getListOfUniversities();
    for(int i = 0; i < unis.length; i++)
    {
    	if(university.getName() == unis[i][0])
    	{
    		throw new IllegalArgumentException();
    	}
    }
	  this.database.addUniversity(university);
  }
  
  /**
   * 
   * @param username
   * @param password
   */
  public int addNewUser(User user) //necessimos paramatinos
  {
	    String[][] users = this.database.getUsers();
	    for(int i = 0; i < users.length; i++)
	    {
	    	if(user.getUsername() == users[i][2])
	    	{
	    		throw new IllegalArgumentException();
	    	}
	    }
    return this.database.addUser(user);
  }
  
  
  /**
   * 
   */
  public int deleteUser(String username)
  {
   return this.database.deleteUser(username);
  }
  
  /**
   * 
   * @param username
   */
  public void editUniversity(University uni) 
  {
	  this.database.editUniversity(uni);
  }
  
  /**
   * 
   * @param username
   * @param oldPassword
   * @param newPassword
   */
  public void resetUsersPassword(String username, String newPassword)
  {
    this.database.changePassword(username, newPassword);  
  }
  
  /**
   * UC16 if uni is not saved
   * @param uniName
   */
  public int deleteUniversity(String uniName)
  {
    return this.database.deleteUniversity(uniName);
  }
  
  /**
   * For view List of users
   * @return
   */
  
  public java.lang.String[][] getListOfUsers()
  {
    return this.database.getUsers();
  }
  
  /**
   * should test isLoggedIn, true = logger.logout, false = exception
   */
  public void logout()
  {
    this.logger.logout();
  }
  
  /**
   * 
   */
  public void login(String username, String password)
  {
    this.logger.login(username, password);
  }
}

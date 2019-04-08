package controllers;
import dblibrary.project.csci230.*;
import entity.*;
import UI.*;
import java.util.*;

/**
 * @author nhoberg001
 *
 */

public class DatabaseController {
  
  /**
   * 
   */
  private UniversityDBLibrary dbLibrary;
  
  public DatabaseController() {
    this.dbLibrary = new UniversityDBLibrary("holeyfan", "csci230");
  }
  
  /**
   * UC10
   */
  public int addUser(User user) 
  {
    return this.dbLibrary.user_addUser(user.getFirst(), user.getLast(), user.getUsername(), user.getPassword(), user.getType()); //needs getters
  }
  
  /**
   * 
   */
  public int deactivateUser(Account2 user)
  {
    return this.dbLibrary.user_editUser(user.getUsername(), user.getFirst(), user.getLast(),
                                 user.getPassword(), user.getType(), 'N');
  }
  
  public void editUser(Account2 user)
  {
    this.dbLibrary.user_editUser(user.getUsername(), user.getFirst(), user.getLast(),
    			user.getPassword(), user.getType(), user.getStatus());
  }
  
  
  /**
   * UC19
   */
  public int deleteUser(String username)
  {
  return this.dbLibrary.user_deleteUser(username);
  }
    
  
  /**
   * UC12
   */
  public int addUniversity(University uni)
  {
	  	if(this.getUniversity(uni.getName())!= null)
	  	{
    return dbLibrary.university_addUniversity(uni.getName(), uni.getState(), uni.getLocation(), uni.getControl(), uni.getNumOfStudents(), 
                                              uni.getPercentFemale(), uni.getSatVerbal(), uni.getSatMath(), uni.getExpenses(), uni.getFinAid()
                                              , uni.getNumApplicants(), uni.getPerAdmitted(), uni.getPerEnrolled(),
	  	                                             uni.getAcademicScale(),  uni.getSocialScale(), uni.getLifeScale()); 
	  	}
	  	else
	  	{
	  		return 0;
	  	}
	  	}
  
  /**
   * 
   * @param username
   */
  public void getUserInfo(String username)
  {}
  
  /**
   * UC9?
   */
  public java.lang.String[][] getUsers()
  {
    return this.dbLibrary.user_getUsers();
  }
  
  /**
   * UC9?
   */
  public java.lang.String[][] getUsernamesWithSavedSchools()
  {
    return this.dbLibrary.user_getUsernamesWithSavedSchools();
  }
  
  /**
   * 
   */
  public University getUniversity(String uniName)
  {
	University returnVal = null;
    String[][] unis = this.dbLibrary.university_getUniversities();
    for(int i = 0; i < unis.length; i++)
    {
    	for(int j = 0; j < unis[i].length; j++)
    	{
    		if(uniName.equals(unis[i][0]))
    				{
    			returnVal = new University(unis[i][0], unis[i][1], unis[i][2], unis[i][3],
    					 Integer.parseInt(unis[i][4]), Double.parseDouble(unis[i][5]),  Double.parseDouble(unis[i][6]),
    					 Double.parseDouble(unis[i][7]), Double.parseDouble(unis[i][8]), Double.parseDouble(unis[i][9]),
    					 Integer.parseInt(unis[i][10]), Double.parseDouble(unis[i][11]), Double.parseDouble(unis[i][12]),
    					 Integer.parseInt(unis[i][13]), Integer.parseInt(unis[i][14]), Integer.parseInt(unis[i][15]));
    				}			
    	}
    	
    }
    return returnVal;
    //for loop for finding the uni by the search criteria given i.e. params
  }
  
  /**
   * Used for UC2, UC4
   */
  public java.lang.String[][] getListOfUniversities()
  {
    return this.dbLibrary.university_getUniversities();
  }
  
  /**
   * UC13
   * @param uni
   */
  
  public int editUniversity(University uni) 
  {
    return dbLibrary.university_editUniversity(uni.getName(), uni.getState(), uni.getLocation(), uni.getControl(), uni.getNumOfStudents(), 
                                              uni.getPercentFemale(), uni.getSatVerbal(), uni.getSatMath(), uni.getExpenses(), uni.getFinAid()
                                              , uni.getNumApplicants(), uni.getPerAdmitted(), uni.getPerEnrolled(),
                                              uni.getAcademicScale(),  uni.getSocialScale(), uni.getLifeScale()); 
  }
  
  /**
   * UC11
   * @param username
   * @param password
   */
  public int changePassword(String username, String password)
  {
    String[][] users = this.dbLibrary.user_getUsers();
    for (int i = 0; i < users.length; i ++)
    {
      if (users[i][2] == username)
      {
        users[i][3] = password;
      }
    }
    return 0;
  }
  
  /**
   * UC16 removes a uni from database if no user has it saved
   */
  public int deleteUniversity(String uniName)
  {
	  if((this.getUniversity(uniName)).getSavedStatus() == false)
	  {
    return this.dbLibrary.university_deleteUniversity(uniName);
	  }
	  else
	  {
		return 0;  
	  }
  }
  
  /**
   * 
   */
  public int removeUniversityFromUser(String username, String uniName)
  {
    return this.dbLibrary.user_removeSchool(username, uniName);
  }
  
  /**
   * UC8
   */
  public int saveSchool(String username, String uniName)
  {
    return this.dbLibrary.user_saveSchool(username, uniName);
  }
  
}

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
  public String userName;
  private char type;
  private char status;
  
  AdminFunctionalityController afc;
  UniversityController uc;
  //AdminUI adUI;
  
<<<<<<< HEAD
  /**
   * creating an admin account
   * @param userName the user name
   * @param password the password of the account
   * param type the account type, admin or student
   */
  public Admin() 
  {
 log = new LogonController();
  }
  
=======
  public Admin() {
    
  }
  
  public void logout()
  {}
  
>>>>>>> c137dac61e9a4365c71516e150aad2b0883005f7
  /**
   * logout of the account
   * @param admin the account to be log out
   */
  public void logout()
  {
    //log out of the account
     log.logout();
  }
  
  /**
   * login to the account
   * @param userName the userName
   * @param password the password
   * @param type the accoun't type, admin or student
   */
  public void login()
  {
    
    this.afc.login("holeyfan", "csci230");
  }
  
  /**
   * view the list of universities
   * @param university the universities to view
   */
  public void viewUniversities()
  {
    
    //view the university
   //this.uc.viewUniversity("BARD");
    
  }
  
  /**
   * view the list of user
   */
  public void viewUsers()
  {
    //view the list of users
    //this.adUI.viewListOfUsers();
    
  }
  
  /**
   * add a new user
   * @param user the user
   */
  public void addNewUser()
  {
    User user = new User("lUser");
    //add a new user
    this.afc.addNewUser(user);
  }
  
  /**
   * reset the user's password
   * @param user the account's password to be change
   */
  public void resetUserPassword()
  {
    this.afc.resetUsersPassword("jUser", "lpassword");
    
  }
  
  /**
   * add a new university
   */
  public void addNewUniversity()
  {
    University sPC = new University("SAINT PAUL COLLEGE");
    //add a new university
    this.afc.addNewUniversity(sPC);

  }
  
  /**
   * edit the information of the university
   */
  public void editUniversityInfo()
  {
    //edit a university's information
    
    this.afc.editUniversity("BROWN");
  }
  
  /**
   * delete school
   */
  public void deleteSchool()
  {
    //delete the university
    this.afc.deleteUniversity("SAINT PAUL COLLEGE");
    
  }
  
  /**
   * save the statistic of school searched  
   */
  public void saveSchoolSearchStatistics()
  {
    
    
  }
  
  /**
   * delete user's account
   */
  public void deleteUser()
  {
    
  }
  
  
  /**
   * view the profile of an account
   */
  public void viewProfile()
  {
    
    System.out.println("username: " + username + " password: " + password + " type: " + type + " status: " + status);
    
  }
  
  
  
}

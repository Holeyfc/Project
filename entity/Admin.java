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
  DatabaseController lib;
  //AdminUI adUI;
  
  
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
    
    this.afc.login("nadmin", "jpass");
  }
  
  /**
   * view the list of universities
   * @param university the universities to view
   */
  public void viewUniversities()
  {
    
    String[][] schools = this.lib.getListOfUniversities();
    for(int i = 0; i < schools.length; i++)
    {
      for(int j = 0; j < schools[i].length; j++)
      {
        System.out.println(schools[i][j]);
      }
    }
    
  }
  
  /**
   * view the list of user
   */
  public void viewUsers()
  {
    String[][] users = this.lib.getUsers();
    for(int i = 0; i < users.length; i++)
    {
      for(int j = 0; j < users[i].length; j++)
      {
        System.out.println(users[i][j]);
      }
      
    }
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
    this.afc.resetUsersPassword("juser", "lpassword");
    System.out.print("Password has been changed.");
  }
  
  /**
   * add a new university
   */
  public void addNewUniversity()
  {
    University sPC = new University("SAINT PAUL COLLEGE");
    
    //add a new university
    this.lib.addNewUniversity(sPC);
    
  }
  
  /**
   * edit the information of the university
   */
  public void editUniversityInfo()
  {
    //edit a university's information
    this.afc.editUniversity("BROWN");
    System.out.print("University information has been update.");
  }
  
  /**
   * delete school
   */
  public void deleteSchool()
  {
    //delete the university
    this.afc.deleteUniversity("SAINT PAUL COLLEGE");
    System.out.print("University has been deleted.");
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
    afc.deleteUser("lUser");
    System.out.print("The user has been deleted.");
  }
  
  
  /**
   * view the profile of an account
   */
  public void viewProfile()
  {
    String[][] users = this.lib.getUsers();
    for(int i = 0; i < users.length; i++)
    {
      for(int j = 0; j < users[i].length; j++)
      {
        System.out.println(users[i][j]);
      }
      
    }
    
    
    
  }
}
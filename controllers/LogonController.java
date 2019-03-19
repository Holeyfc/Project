/**
 * 
 */
package controllers;


/**
 * @author nhoberg001
 *
 */
public class LogonController {
  
  UserFunctionalityController UFC;
  AdminFunctionalityController AFC;
  
  public DatabaseController database;
  
  public LogonController() {
    this.database = new DatabaseController();
  }
  
  /**
   * UC1
   * @param username
   * @param password
   * @param type is either active or inactive
   */
  public void login(String username, String password)
  {
    int bool = 0;
    String[][] users = this.database.getUsers();
    for (int i = 0; i < users.length; i++)
    {
      if (users[i][2] == username)
      {
        if (users[i][3]  == password)
        {
          if (users[i][5] == "a")
          {
            System.out.println("Login successful"); 
            bool++;
          }
          else
          {
            System.out.println("Login unsuccessful because this account is inactive"); 
          }
        }
        else
        {
          System.out.println("Login unsuccessful because of an incorrect username of password");
        }
      }
      if (bool == 0)
      {
                System.out.println("Login unsuccessful because of an incorrect username of password"); 
      }
    }
  }
  
  //from communication
  //public User findByMemberName()
  /**
   * 
   */
  public void logout()
  {}
  
}

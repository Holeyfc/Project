//@author HoleyFanClub
//@version 2.0
package entity;

import dblibrary.project.csci230.*;
import javax.swing.*;
import controllers.*;
public class Account2 {
  
  String password;
  String username;
  char status;
  char type;
  DatabaseController lib;
  SearchController search;
  LogonController log;
  
  public Account2()
  {
    String username = "x";
    String password = "x";
    char status = 'a';
    char type = 'u';
    lib = new DatabaseController();
    search = new SearchController();
    log = new LogonController();
    
  }
  public void logout()
  {
    log.logout();
  }
  
  public void login()
  {
   
    System.out.println("juser"); 
    log.login("juser", "jpass");
    System.out.println("luser");
    log.login("luser", "jpass");
    System.out.println("nadmin");
    log.login("nadmin", "jpass");
    System.out.println("bad password");
    log.login("nadmin" , "1324");
    System.out.println("bad username");
    log.login("1234", "1234");
    
  }
  
  public void viewSavedUniversities()
  {
    String[][] schools = this.lib.getUsernamesWithSavedSchools();
    for(int i = 0; i < schools.length; i++)
    {
      for(int j = 0; j < schools[i].length; j++)
      {
        System.out.println(schools[i][j]);
      }
    }
  }
  
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
  
  public void search()
  {
    search.searchUniversities("HARVARD");
  }
  
  public void viewSearchResults()
  {
    search.searchResults();
  }
  
  public void viewUniversity()
  {
    search.viewUniversity("HARVARD");
  }
  
  public void saveUniversity()
  {
   System.out.println("saving a new school to juser" + this.lib.saveSchool("juser", "HARVARD"));
   System.out.println("saving an already saved school to luser" + this.lib.saveSchool("luser", "BROWN")); 
   System.out.println("trying to save a school to a nonexistent user" + this.lib.saveSchool("nadmin", "BROWN"));
  }
  
  public void sortUniversityByCriteria()
  {
  }
  
  public void searchOthersSchools()
  {
    String[][] usersAndSchools = lib.getUsernamesWithSavedSchools();
    for(int i = 0; i < usersAndSchools.length; i++)
    {
      if(usersAndSchools[i][0].equals("juser"))
         {
           System.out.println("juser's schools");
           for(int j = 0; j < usersAndSchools[i].length; j++)
           {
             System.out.println(usersAndSchools[i][j]);
           }
         }
    }
  }
  
}




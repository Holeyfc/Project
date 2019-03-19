/**
 * 
 */
package controllers;

/**
 * @author nhoberg001
 *
 */
public class SearchController {
  
  /**
   * 
   */
  
  
  public DatabaseController database;
  public boolean found;
  public String name;
  
  public SearchController()
  {
    this.database = new DatabaseController();
  }
  /**
   * 
   */
  public void searchResults()
  {
    if(this.found = true)
    {
      System.out.println("school " + name + " found.");
    }
    else
    {
      System.out.println("school " + name + " not found in database.");
    }
  }
  
  /**
   * 
   */
  public void searchUniversities(String name)
  {
    found = false;
    this.name = name;
    String[][] university = database.getListOfUniversities();
    for(int i = 0; i < university.length; i++)
    {
      if(university[i][0].equals(name))
      {
        found = true;
      }
    }
  }
  
  public void viewUniversity(String name)
  {
    String[][] university = database.getListOfUniversities();
    for(int i = 0; i < university.length; i++)
    {
      if(university[i][0].equals(name))
      {
        for(int j = 0; j < university[i].length; j++)
        {
          System.out.println(university[i][j]);
        }
      }
    }
  }
  
  /**
   * 
   */
  public void getUniversities()
  {}
  
  /**
   * @param args
   */
}

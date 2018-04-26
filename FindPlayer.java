package linkedlistv2;

public class FindPlayer 
{
    
    public static Player findByFirstName()
    {
       //Variables
        String userName = "";
        int counter = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("    You have chosen to search by First Name....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a first name to search by....");
        System.out.print("First Name: ");
        userName = SavitchIn.readLine();
        userName = List.checkIfInputValid(userName);
        userName = userName.toLowerCase();
        
       List.current = List.head;
       if ( List.head == null )
       {   
           System.out.println("");
           System.out.println("There are no player's in the database to search for...");
       }
       else if ( List.head != null )
       {
           List.current = List.head;
           while ( List.current != null )
           {
               counter++;
               if ( List.current.firstName.equals(userName) )
               {
                   System.out.println("");
                   System.out.println("Player Found!");
                   foundPlayer = List.current;
                   List.current = List.current.next;
                   List.current = null;
               }
               else if ( !List.current.firstName.equals(userName) )
               {
                    List.current = List.current.next;
                    if ( counter > 1 )
                    {
                        List.previous = List.previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( List.current == null )
                    {
                       System.out.println("");
                       System.out.println("Player not found.");
                    }
               }
               else
               {
                   System.out.println("General Error 101 - There was an error that occured in the Find First Name while loop.... Please Contact Admin");
               }
               
           }
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Find First Name Method.... Please Contact Admin");
       }
       
       return foundPlayer;
    }
    
    public static Player findByLastName()
    {
       //Variables
        String userName = "";
        int counter = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("    You have chosen to search by Last Name....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a last name to search by....");
        System.out.print("Last Name: ");
        userName = SavitchIn.readLine();
        userName = List.checkIfInputValid(userName);
        userName = userName.toLowerCase();
        
       List.current = List.head;
       if ( List.head == null )
       {
           System.out.println("");
           System.out.println("There are no player's in the database to search for...");
       }
       else if ( List.head != null )
       {
           List.current = List.head;
           while ( List.current != null )
           {
               counter++;
               if ( List.current.lastName.equals(userName) )
               {
                   System.out.println("");
                   System.out.println("Player Found!");
                   foundPlayer = List.current;
                   List.current = List.current.next;
                   List.current = null;
               }
               else if ( !List.current.lastName.equals( userName) )
               {
                    List.current = List.current.next;
                    if ( counter > 1 )
                    {
                        List.previous = List.previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( List.current == null )
                    {
                       System.out.println("Player not found.");
                    }
               }
               else
               {
                   System.out.println("General Error 101 - There was an error that occured in the Find First Name while loop.... Please Contact Admin");
               }
               
           }
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Find First Name Method.... Please Contact Admin");
       }
       
       return foundPlayer;
    }
    
    public static Player findByPosition()
    {
       //Variables
        String userName = "";
        int counter = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("    You have chosen to search by Position....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a position to search by....");
        System.out.print("Position: ");
        userName = SavitchIn.readLine();
        userName = List.checkIfInputValid(userName);
        userName = userName.toLowerCase();
        
       List.current = List.head;
       if ( List.head == null )
       {
           System.out.println("");
           System.out.println("There are no player's in the database to search for...");
       }
       else if ( List.head != null )
       {
           List.current = List.head;
           while ( List.current != null )
           {
               counter++;
               if ( List.current.position.equals(userName) )
               {
                   System.out.println("");
                   System.out.println("Player Found!");
                   foundPlayer = List.current;
                   List.current = List.current.next;
                   List.current = null;
               }
               else if ( !List.current.position.equals( userName) )
               {
                    List.current = List.current.next;
                    if ( counter > 1 )
                    {
                        List.previous = List.previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( List.current == null )
                    {
                       System.out.println("Player not found.");
                    }
               }
               else
               {
                   System.out.println("General Error 101 - There was an error that occured in the Find First Name while loop.... Please Contact Admin");
               }
               
           }
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Find First Name Method.... Please Contact Admin");
       }
       
       return foundPlayer;
    }
    
    public static Player findByGender()
    {
       //Variables
        String userName = "";
        int counter = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("    You have chosen to search by Gender....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a gender to search by....");
        System.out.print("Gender: ");
        userName = SavitchIn.readLine();
        userName = List.checkIfInputValid(userName);
        userName = userName.toLowerCase();
        
       List.current = List.head;
       if ( List.head == null )
       {
           System.out.println("");
           System.out.println("There are no player's in the database to search for...");
       }
       else if ( List.head != null )
       {
           List.current = List.head;
           while ( List.current != null )
           {
               counter++;
               if ( List.current.gender.equals(userName) )
               {
                   System.out.println("");
                   System.out.println("Player Found!");
                   foundPlayer = List.current;
                   List.current = List.current.next;
                   List.current = null;
               }
               else if ( !List.current.gender.equals( userName) )
               {
                    List.current = List.current.next;
                    if ( counter > 1 )
                    {
                        List.previous = List.previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( List.current == null )
                    {
                       System.out.println("Player not found.");
                    }
               }
               else
               {
                   System.out.println("General Error 101 - There was an error that occured in the Find First Name while loop.... Please Contact Admin");
               }
               
           }
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Find First Name Method.... Please Contact Admin");
       }
       
       return foundPlayer;
    }
    
    public static Player findByThrowingSide()
    {
       //Variables
        String userName = "";
        int counter = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("   You have chosen to search by Throwing Side....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a throwing side to search by....");
        System.out.print("Throwing Side: ");
        userName = SavitchIn.readLine();
        userName = List.checkIfInputValid(userName);
        userName = userName.toLowerCase();
        
       List.current = List.head;
       if ( List.head == null )
       {
           System.out.println("");
           System.out.println("There are no player's in the database to search for...");
       }
       else if ( List.head != null )
       {
           List.current = List.head;
           while ( List.current != null )
           {
               counter++;
               if ( List.current.throwingSide.equals(userName) )
               {
                   System.out.println("");
                   System.out.println("Player Found!");
                   foundPlayer = List.current;
                   List.current = List.current.next;
                   List.current = null;
               }
               else if ( !List.current.throwingSide.equals( userName) )
               {
                    List.current = List.current.next;
                    if ( counter > 1 )
                    {
                        List.previous = List.previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( List.current == null )
                    {
                       System.out.println("Player not found");
                    }
               }
               else
               {
                   System.out.println("General Error 101 - There was an error that occured in the Find First Name while loop.... Please Contact Admin");
               }
               
           }
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Find First Name Method.... Please Contact Admin");
       }
       
       return foundPlayer;
    }
    
    public static Player findByTeamName()
    {
       //Variables
        String userName = "";
        int counter = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("   You have chosen to search by Team Name....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a team name to search by....");
        System.out.print("Team Name: ");
        userName = SavitchIn.readLine();
        userName = List.checkIfInputValid(userName);
        userName = userName.toLowerCase();
        
       List.current = List.head;
       if ( List.head == null )
       {
           System.out.println("");
           System.out.println("There are no player's in the database to search for...");
       }
       else if ( List.head != null )
       {
           List.current = List.head;
           while ( List.current != null )
           {
               counter++;
               if ( List.current.teamName.equals(userName) )
               {
                   System.out.println("");
                   System.out.println("Player Found!");
                   foundPlayer = List.current;
                   List.current = List.current.next;
                   List.current = null;
               }
               else if ( !List.current.teamName.equals( userName) )
               {
                    List.current = List.current.next;
                    if ( counter > 1 )
                    {
                        List.previous = List.previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( List.current == null )
                    {
                       System.out.println("Player not found.");
                    }
               }
               else
               {
                   System.out.println("General Error 101 - There was an error that occured in the Find First Name while loop.... Please Contact Admin");
               }
               
           }
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Find First Name Method.... Please Contact Admin");
       }
       
       return foundPlayer;
    }
    
    public static Player findByJerseyNum()
    {
       //Variables
        int userInt = 0;
        int counter = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("   You have chosen to search by Jersey Number....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a jersey number to search by....");
        System.out.print("Jersey Number: ");
        userInt = SavitchIn.readLineInt();
        
       List.current = List.head;
       if ( List.head == null )
       {
           System.out.println("");
           System.out.println("There are no player's in the database to search for...");
       }
       else if ( List.head != null )
       {
           List.current = List.head;
           while ( List.current != null )
           {
               counter++;
               if ( List.current.jerseyNum == userInt )
               {
                   System.out.println("");
                   System.out.println("Player Found!");
                   foundPlayer = List.current;
                   List.current = List.current.next;
                   List.current = null;
               }
               else if ( List.current.jerseyNum != userInt )
               {
                    List.current = List.current.next;
                    if ( counter > 1 )
                    {
                        List.previous = List.previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( List.current == null )
                    {
                       System.out.println("Player not found.");
                    }
               }
               else
               {
                   System.out.println("General Error 101 - There was an error that occured in the Find First Name while loop.... Please Contact Admin");
               }
               
           }
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Find First Name Method.... Please Contact Admin");
       }
       
       return foundPlayer;
    }
    
    public static Player findByAge()
    {
       //Variables
        int userInt = 0;
        int counter = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("   You have chosen to search by Age....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter an age to search by....");
        System.out.print("Age: ");
        userInt = SavitchIn.readLineInt();
        
       List.current = List.head;
       if ( List.head == null )
       {
           System.out.println("");
           System.out.println("There are no player's in the database to search for...");
       }
       else if ( List.head != null )
       {
           List.current = List.head;
           while ( List.current != null )
           {
               counter++;
               if ( List.current.age == userInt )
               {
                   System.out.println("");
                   System.out.println("Player Found!");
                   foundPlayer = List.current;
                   List.current = List.current.next;
                   List.current = null;
               }
               else if ( List.current.age != userInt )
               {
                    List.current = List.current.next;
                    if ( counter > 1 )
                    {
                        List.previous = List.previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( List.current == null )
                    {
                       System.out.println("Player not found.");
                    }
               }
               else
               {
                   System.out.println("General Error 101 - There was an error that occured in the Find First Name while loop.... Please Contact Admin");
               }
               
           }
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Find First Name Method.... Please Contact Admin");
       }
       
       return foundPlayer;
    }
    
    
}

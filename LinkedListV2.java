package linkedlistv2;

public class LinkedListV2 
{
    public static void printDirections()
    {
        System.out.println("________________________________________________");
        System.out.println("|              Database Program                |");
        System.out.println("|              Baseball Database               |");
        System.out.println("|          Programmer : Tyler Davis            |");
        System.out.println("|               Date: 4/22/2018                |");
        System.out.println("________________________________________________");
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static int findPlayerBy()
    {
       //Variables 
        int userChoice = 0;
        
        System.out.println("");
        System.out.println("                           Find Player Menu");
        System.out.println("_______________________________________________________________________________");
        System.out.println("");
        System.out.println("                  How would you like to search?");
        System.out.println("[ 1 - First Name    ] [ 2 - Last Name ] [ 3 - Position ] [ 4 - Gender     ]");
        System.out.println("[ 5 - Throwing Side ] [ 6 - Team Name ] [ 7 - Age      ] [ 8 - Jersey Num ]");
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        
        //Error checking
        while (( userChoice <=0 ) || ( userChoice > 8 ))
        {
            System.out.println("I'm sorry but you have entered and invalid choice.");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        
        return userChoice;
        
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void addPlayer()
    {
       if ( List.head == null )         // If the linked list is empty create the head or first player of the list ( This head should never change )
       {
           List.addHead();
           Player.currentPlayer++;
       }
       else if ( Player.currentPlayer >= 1 )   // If the head is already created it jumps to the next spot in the linked list and adds that player
       {
           List.addNext();
           Player.currentPlayer++;
       }
       else
       {
           System.out.println("General Error 101 - There was an error that occured in the Add Player Method.... Please Contact Admin");
       }
       if ( Player.currentPlayer <= 1 ) // Runs when the first players created initially sets current to head which is null, once first place is added it sets current to head again which now has one player.
       {
           List.crawlNext = List.head;
       }
       
        
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void deletePlayer()
    {
        //Variables
        int userChoice = 0;
        Player foundPlayer = null;
        int userFindChoice = 0;
        
        System.out.println("");
        System.out.println("                 Delete Player Menu ");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("[ 1 - Delete Specific Player ] [ 2 - Delete All ]");
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        
        //Error Checking
        while (( userChoice <= 0) || ( userChoice > 2 ))
        {
            System.out.println("You have entered an invalid choice.. Try Again.");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        
        switch (userChoice) {
            case 1:
                userFindChoice = findPlayerBy();
                    switch (userFindChoice) {
                        case 1:
                            foundPlayer = FindPlayer.findByFirstName();
                            break;
                        case 2:
                            foundPlayer = FindPlayer.findByLastName();
                            break;
                        case 3:
                            foundPlayer = FindPlayer.findByPosition();
                            break;
                        case 4:
                            foundPlayer = FindPlayer.findByGender();
                            break;
                        case 5:
                            foundPlayer = FindPlayer.findByThrowingSide();
                            break;
                        case 6:
                            foundPlayer = FindPlayer.findByTeamName();
                            break;
                        case 7:
                            foundPlayer = FindPlayer.findByAge();
                            break;
                        case 8:
                            foundPlayer = FindPlayer.findByJerseyNum();
                            break;
                        default:
                            break;
                    }
                    List.deleteSpecific(foundPlayer);
                break;
            case 2:
                List.deleteAll();
                break;
            default:
                break;
        }
        
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void editPlayer()
    {
        //Variables
        int userFindChoice = 0;
        Player foundPlayer = null;
        
        System.out.println("");
        System.out.println("                  Edit Player Menu");
        System.out.println("________________________________________________");
        System.out.println("   Please select an option below to continue..");
        System.out.println("");
        
        if (List.head == null)
        {
            System.out.println("   There are no player's in the database.");
        }
        else if ( List.head != null )
        {
            userFindChoice = findPlayerBy();
            switch (userFindChoice) {
                case 1:
                    foundPlayer = FindPlayer.findByFirstName();
                    break;
                case 2:
                    foundPlayer = FindPlayer.findByLastName();
                    break;
                case 3:
                    foundPlayer = FindPlayer.findByPosition();
                    break;
                case 4:
                    foundPlayer = FindPlayer.findByGender();
                    break;
                case 5:
                    foundPlayer = FindPlayer.findByThrowingSide();
                    break;
                case 6:
                    foundPlayer = FindPlayer.findByTeamName();
                    break;
                case 7:
                    foundPlayer = FindPlayer.findByAge();
                    break;
                case 8:
                    foundPlayer = FindPlayer.findByJerseyNum();
                    break;
                default:
                    break;
            }
            List.editPlayer(foundPlayer);
        }
        else
        {
            System.out.println("General Error in edit player");
        }
        
        
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void printPlayers()
    {
        //Variables
        int userChoice = 0;
        int userFindChoice = 0;
        Player foundPlayer = null; 
        
        System.out.println("");
        System.out.println("                 Print Player Menu ");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("[ 1 - Print Specific Player ] [ 2 -  Print All ]");
        System.out.println("");
        
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        
        //Error checking to make sure user can't enter outside 1 or 2
        while (( userChoice <= 0 ) || ( userChoice > 2))
        {
            System.out.println("");
            System.out.println("I'm sorry that is not a valid option, try again.");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        
        if ( List.head == null)
        {
            System.out.println("");
            System.out.println("I'm sorry there are no player's in the database...");
        }
        else if ( List.head != null)
        {
            switch (userChoice) { 
                case 1:
                    userFindChoice = findPlayerBy();
                    switch (userFindChoice) {
                        case 1:
                            foundPlayer = FindPlayer.findByFirstName();
                            break;
                        case 2:
                            foundPlayer = FindPlayer.findByLastName();
                            break;
                        case 3:
                            foundPlayer = FindPlayer.findByPosition();
                            break;
                        case 4:
                            foundPlayer = FindPlayer.findByGender();
                            break;
                        case 5:
                            foundPlayer = FindPlayer.findByThrowingSide();
                            break;
                        case 6:
                            foundPlayer = FindPlayer.findByTeamName();
                            break;
                        case 7:
                            foundPlayer = FindPlayer.findByAge();
                            break;
                        case 8:
                            foundPlayer = FindPlayer.findByJerseyNum();
                            break;
                        default:
                            break;
                    }
                    List.printSpecific(foundPlayer);  
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("You have selected to print all players in database....");
                    System.out.println("");
                    List.printAll();
                    break;
                default:
                    System.out.println("General Error 101 - There was an error that occured in the Print Player Method, in choice else statement.... Please Contact Admin");
                    break;
            }
        }
        else
        {
            System.out.println("General Error 101 - There was an error that occured in the Print Player Method.... Please Contact Admin");
        }
        
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void linkedListMain()
    {
        //Variables 
        int userChoice = 0; // This variable is for the users switchboard choice
        
        
        printDirections();
        while( userChoice != 5 ) // While keeps asking user for a switchboard choice until they enter 5 which is to quit, loop ends....
        {
            userChoice = Menu.showMenu();
            Menu.runChoice();
        }
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args)
    {
        linkedListMain(); // Start of Program
    }
    
}

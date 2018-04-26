package linkedlistv2;

public class Menu 
{
    public static int userChoice = 0;
    
    
    public static int showMenu()
    {
        //Variables 
        
        
        //Logic
        System.out.println("");
        System.out.println("     Which option would you like to choice?");
        System.out.println("________________________________________________");
        System.out.println("|            [  1 -   ADD PLAYER   ]           |");
        System.out.println("|            [  2 - DELETE PLAYER  ]           |");
        System.out.println("|            [  3 -  EDIT PLAYER   ]           |");
        System.out.println("|            [  4 - PRINT PLAYERS  ]           |");
        System.out.println("|            [  5 -    EXIT        ]           |");
        
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        
        //Error Checking to ensure user cannot enter in a choice other than 1,2,3,4,5
        while ((userChoice <= 0) || (userChoice > 5))
        {
            System.out.println("I'm sorry you have entered an invalid choice. Try Again.");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        
        return userChoice;
        
    }
    
    public static void runChoice()
    {
            switch (userChoice) {
            case 1:
                LinkedListV2.addPlayer();
                break;
            case 2:
                LinkedListV2.deletePlayer();
                break;
            case 3:
                LinkedListV2.editPlayer();
                break;
            case 4:
                LinkedListV2.printPlayers();
                break;
            case 5:
                System.out.println("");
                System.out.println("You have chosen to leave the database.... Goodbye!");
                break;
            default:
                System.out.println("General Error 101 - Error timed out in run Choice Method.....");
                break;
        }
        
        
    }

    
}

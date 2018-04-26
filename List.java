package linkedlistv2;

public class List 
{
    public static Player current = null;            // The current slot its currenly on
    public static Player head = null;               // The start of the linked list
    public static Player tempHeadPointer = null;    // Temp pointer to delete head
    public static Player previous = null;           // Previous slot to the slot its on
    public static Player crawlNext = null;
    public static Player tail = null;
    public static String userInput = "";
    public static int userInt = 0;
    
    public static String checkIfInputValid(String userInput)
    {
        while(!userInput.matches("[A-Za-z]+"))
        {
            System.out.println("I'm sorry you have entered an invalid character.");
            System.out.print("Try again : ");
            userInput = SavitchIn.readLine();        
        }
        
        return userInput;
    }
    
    public static Player checkForEnd()
    {
        current = head;
        
        while ( current != null)
        {
            current = current.next;
            tail = current;
        }
        
        return tail;
    }
    
    public static void addHead()
    {
        head  = new Player();
        System.out.println("Please enter the player's [   First Name    ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        head.firstName = userInput;

        System.out.println("Please enter the player's [   Last Name     ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        head.lastName = userInput; 

        System.out.println("Please enter the player's [   Position      ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        head.position = userInput;

        System.out.println("Please enter the player's [   Gender        ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        head.gender = userInput;

        System.out.println("Please enter the player's [   Throwing Side ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        head.throwingSide = userInput;

        System.out.println("Please enter the player's [   Team name     ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        head.teamName = userInput;

        System.out.println("Please enter the player's [   Age           ]");
        userInt = SavitchIn.readLineInt();
        head.age = userInt;

        System.out.println("Please enter the player's [   Jersey Number ]");
        userInt = SavitchIn.readLineInt();
        head.jerseyNum = userInt;
        
    }
    
    public static void addNext()
    {
        crawlNext.next = new Player();
        crawlNext = crawlNext.next;
        System.out.println("Please enter the player's [   First Name    ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        crawlNext.firstName = userInput;

        System.out.println("Please enter the player's [   Last Name     ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        crawlNext.lastName = userInput; 

        System.out.println("Please enter the player's [   Position      ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        crawlNext.position = userInput;

        System.out.println("Please enter the player's [   Gender        ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        crawlNext.gender = userInput;

        System.out.println("Please enter the player's [   Throwing Side ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        crawlNext.throwingSide = userInput;

        System.out.println("Please enter the player's [   Team name     ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        crawlNext.teamName = userInput;

        System.out.println("Please enter the player's [   Age           ]");
        userInt = SavitchIn.readLineInt();
        crawlNext.age = userInt;

        System.out.println("Please enter the player's [   Jersey Number ]");
        userInt = SavitchIn.readLineInt();
        crawlNext.jerseyNum = userInt;
    
    }
    
    public static void editPlayer(Player playerFound)
    {
        System.out.println("");
        current = head;
        previous = head;
        Player nextSlot = null;
        
        int counter = 0;
        
        if ( playerFound == null )
        {
           // Nothing was found error message already printed here
        }
        else if ( playerFound != null )
        {
            while ( current != playerFound )
            {
                current = current.next;
                if ( counter > 1 )
                {
                    previous = previous.next;
                }
                counter++;
            }
            nextSlot = current.next;
            
            if (current == head)
            {
                System.out.println("Please enter the player's [   First Name    ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                head.firstName = userInput;

                System.out.println("Please enter the player's [   Last Name     ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                head.lastName = userInput; 

                System.out.println("Please enter the player's [   Position      ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                head.position = userInput;

                System.out.println("Please enter the player's [   Gender        ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                head.gender = userInput;

                System.out.println("Please enter the player's [   Throwing Side ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                head.throwingSide = userInput;

                System.out.println("Please enter the player's [   Team name     ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                head.teamName = userInput;

                System.out.println("Please enter the player's [   Age           ]");
                userInt = SavitchIn.readLineInt();
                head.age = userInt;

                System.out.println("Please enter the player's [   Jersey Number ]");
                userInt = SavitchIn.readLineInt();
                head.jerseyNum = userInt;
            }
            else
            {
                System.out.println("Please enter the player's [   First Name    ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                current.firstName = userInput;

                System.out.println("Please enter the player's [   Last Name     ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                current.lastName = userInput; 

                System.out.println("Please enter the player's [   Position      ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                current.position = userInput;

                System.out.println("Please enter the player's [   Gender        ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                current.gender = userInput;

                System.out.println("Please enter the player's [   Throwing Side ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                current.throwingSide = userInput;

                System.out.println("Please enter the player's [   Team name     ]");
                userInput = SavitchIn.readLine();
                userInput = checkIfInputValid(userInput);
                userInput = userInput.toLowerCase();
                current.teamName = userInput;

                System.out.println("Please enter the player's [   Age           ]");
                userInt = SavitchIn.readLineInt();
                current.age = userInt;

                System.out.println("Please enter the player's [   Jersey Number ]");
                userInt = SavitchIn.readLineInt();
                current.jerseyNum = userInt;
            }
        }
        else
        {
            System.out.println("General Error in Edit player method");
        }
    }
    
    public static void printAll()
    {
        current = head;
        for (int i = 0 ; i < Player.currentPlayer; i++)
        {
            System.out.println("Player's First Name    : " + current.firstName);
            System.out.println("Player's Last Name     : " + current.lastName);
            System.out.println("Player's Position      : " + current.position);
            System.out.println("Player's Gender        : " + current.gender);
            System.out.println("Player's Throwing Side : " + current.throwingSide);
            System.out.println("Player's Team Name     : " + current.teamName);
            System.out.println("Player's Age           : " + current.age);
            System.out.println("Player's Jersey Number : " + current.jerseyNum);
            System.out.println("");
            current = current.next;
        }
    }
    
    public static void printSpecific(Player playerFound)
    {
        if ( playerFound == null )
        {
            System.out.println("");
            System.out.println("The player was not found in the database.");
        }
        else if ( playerFound != null)
        {
            System.out.println("");
            System.out.println("Player's First Name    : " + playerFound.firstName);
            System.out.println("Player's Last Name     : " + playerFound.lastName);
            System.out.println("Player's Position      : " + playerFound.position);
            System.out.println("Player's Gender        : " + playerFound.gender);
            System.out.println("Player's Throwing Side : " + playerFound.throwingSide);
            System.out.println("Player's Team Name     : " + playerFound.teamName);
            System.out.println("Player's Age           : " + playerFound.age);
            System.out.println("Player's Jersey Number : " + playerFound.jerseyNum);
            System.out.println("");
        }
        else
        {
            System.out.println("General Error in Find specific player method.");
        }
    }
    
    public static void deleteAll()
    {
        if (head == null)
                {
                    System.out.println("");
                    System.out.println("There are no players in the database to delete.");
                }
                else if ( head != null )
                {
                    if ( Player.currentPlayer == 1 )
                    {
                        tempHeadPointer = head;
                        head = head.next;
                        tempHeadPointer.next = null;
                    }
                    else if ( Player.currentPlayer > 1 )
                    {
                       while (head != null)
                        {
                            head = null;
                        } 
                    }
                    else
                    {
                        System.out.println("General error in switch statement for delete all");
                    }
                    System.out.println("");
                    System.out.println("Player's Deleted");
                }
                else
                {
                    System.out.println("General Error in Delete All players method..");
                }
        Player.currentPlayer = 0;
        
    }
    
    public static void deleteSpecific(Player playerFound)
    {
        //Variables 
        int counter = 0;
        
        if ( playerFound == null )
        {
            // No players in database error message already displayed.
        }
        else if ( playerFound != null )
        {
            checkForEnd();
            current = head;
            previous = head;
            while ( current != null)
            {
                counter++;
                if ( playerFound == current)
                {
                    if (( counter > 1 ) && ( current != tail ))
                    {
                        previous.next = current.next;
                        current.next = null;
                        current = current.next;    
                        System.out.println("Player Deleted!");
                        Player.currentPlayer--;
                    }
                    else if ( counter <= 1 )
                    {
                        tempHeadPointer = head;
                        head = head.next;
                        tempHeadPointer.next = null;
                        System.out.println("Player Deleted!");
                        current = null;
                        Player.currentPlayer--;
                    }
                    else if ((current == tail) && ( counter > 1 ))
                    {
                        System.out.println("Player Deleted!");
                        current = null;
                        //previous.next = List.current;
                    }
                    
                }
                else if ( playerFound != current)
                { 
                    current = current.next;
                    if ( counter > 1)
                    {
                        previous = previous.next; // Sets the previous to start crawling 1 later than current
                    }
                    if ( current ==null )
                    {
                       System.out.println("");
                       System.out.println("I'm sorry we could not find that player."); 
                    }
                }
                else
                {
                    System.out.println("General Error in delete specific method");
                }
            }
            
        }
        else 
        {
            System.out.println("General Error in delete specific method");
        }
    
    }
    
    
    
    
}

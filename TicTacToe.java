/*The "TicTacToe" Class.

Program Name: TicTacToe
Programmer: Lance Bantoto
Date: June 17th, 2014
Description: I programmed the game Tic-tac-toe, also known as Xs and Os.
It is a classic game that is played with two players on a 3x3 grid. A player wins
when he/she places three straight Xs or Os.

*/

import java.awt.*;
import hsa.Console;

public class TicTacToe
{
    public static void delay (int millisecs)  // Delay Method
    {
	try
	{
	    Thread.currentThread ().sleep (millisecs);
	}


	catch (InterruptedException e)
	{
	}
    }


    static Console c;           // The Output console

    public static void main (String[] args)
    {
	c = new Console ();

	//Variable Declaration
	int x1, x2, x3, x4, x5, o1, o2, o3, o4;

	//Color Creation
	Color LIGHTPURPLE = new Color (217, 210, 238);

	//Font Creation
	Font TITLEPAGE1 = new Font ("Calibri", Font.PLAIN, 50);
	Font TITLEPAGE2 = new Font ("Calibri", Font.PLAIN, 18);

	TitlePage ();

	//Code for Player 1's 1st turn
	x1 = c.getChar ();

	if (x1 == 'q')
	{
	    OneOneX ();
	}

	else if (x1 == 'w')
	{
	    TwoOneX ();
	}

	else if (x1 == 'e')
	{
	    ThreeOneX ();
	}

	else if (x1 == 'a')
	{
	    OneTwoX ();
	}

	else if (x1 == 's')
	{
	    TwoTwoX ();
	}

	else if (x1 == 'd')
	{
	    ThreeTwoX ();
	}

	else if (x1 == 'z')
	{
	    OneThreeX ();
	}

	else if (x1 == 'x')
	{
	    TwoThreeX ();
	}

	else if (x1 == 'c')
	{
	    ThreeThreeX ();
	}

	else
	{
	    c.println ("Invalid character.");
	}

	//Switch Possession
	PChange1 ();

	//Player 2's 1st turn
	o1 = c.getChar ();

	if (o1 == '7')
	{
	    OneOneO ();
	}

	else if (o1 == '8')
	{
	    TwoOneO ();
	}

	else if (o1 == '9')
	{
	    ThreeOneO ();
	}

	else if (o1 == '4')
	{
	    OneTwoO ();
	}

	else if (o1 == '5')
	{
	    TwoTwoO ();
	}

	else if (o1 == '6')
	{
	    ThreeTwoO ();
	}

	else if (o1 == '1')
	{
	    OneThreeO ();
	}

	else if (o1 == '2')
	{
	    TwoThreeO ();
	}

	else if (o1 == '3')
	{
	    ThreeThreeO ();
	}

	else
	{
	    c.println ("Invalid character.");
	}

	//Switch Possession
	PChange2 ();

	//Player 1's 2nd turn
	x2 = c.getChar ();

	if (x2 == 'q')
	{
	    OneOneX ();
	}

	else if (x2 == 'w')
	{
	    TwoOneX ();
	}

	else if (x2 == 'e')
	{
	    ThreeOneX ();
	}

	else if (x2 == 'a')
	{
	    OneTwoX ();
	}

	else if (x2 == 's')
	{
	    TwoTwoX ();
	}

	else if (x2 == 'd')
	{
	    ThreeTwoX ();
	}

	else if (x2 == 'z')
	{
	    OneThreeX ();
	}

	else if (x2 == 'x')
	{
	    TwoThreeX ();
	}

	else if (x2 == 'c')
	{
	    ThreeThreeX ();
	}

	else
	{
	    c.println ("Invalid character.");
	}

	//Switch Possession
	PChange1 ();

	//Player 2's 2nd turn
	o2 = c.getChar ();

	if (o2 == '7')
	{
	    OneOneO ();
	}

	else if (o2 == '8')
	{
	    TwoOneO ();
	}

	else if (o2 == '9')
	{
	    ThreeOneO ();
	}

	else if (o2 == '4')
	{
	    OneTwoO ();
	}

	else if (o2 == '5')
	{
	    TwoTwoO ();
	}

	else if (o2 == '6')
	{
	    ThreeTwoO ();
	}

	else if (o2 == '1')
	{
	    OneThreeO ();
	}

	else if (o2 == '2')
	{
	    TwoThreeO ();
	}

	else if (o2 == '3')
	{
	    ThreeThreeO ();
	}

	else
	{
	    c.println ("Invalid character.");
	}

	//Switch Possession
	PChange2 ();

	//Player 1's 3rd turn
	x3 = c.getChar ();

	if (x3 == 'q')
	{
	    OneOneX ();
	}

	else if (x3 == 'w')
	{
	    TwoOneX ();
	}

	else if (x3 == 'e')
	{
	    ThreeOneX ();
	}

	else if (x3 == 'a')
	{
	    OneTwoX ();
	}

	else if (x3 == 's')
	{
	    TwoTwoX ();
	}

	else if (x3 == 'd')
	{
	    ThreeTwoX ();
	}

	else if (x3 == 'z')
	{
	    OneThreeX ();
	}

	else if (x3 == 'x')
	{
	    TwoThreeX ();
	}

	else if (x3 == 'c')
	{
	    ThreeThreeX ();
	}

	else
	{
	    c.println ("Invalid character.");
	}

	//Switch Possession
	PChange1 ();

	//Player 2's 3rd turn
	o3 = c.getChar ();

	if (o3 == '7')
	{
	    OneOneO ();
	}

	else if (o3 == '8')
	{
	    TwoOneO ();
	}

	else if (o3 == '9')
	{
	    ThreeOneO ();
	}

	else if (o3 == '4')
	{
	    OneTwoO ();
	}

	else if (o3 == '5')
	{
	    TwoTwoO ();
	}

	else if (o3 == '6')
	{
	    ThreeTwoO ();
	}

	else if (o3 == '1')
	{
	    OneThreeO ();
	}

	else if (o3 == '2')
	{
	    TwoThreeO ();
	}

	else if (o3 == '3')
	{
	    ThreeThreeO ();
	}

	else
	{
	    c.println ("Invalid character.");
	}

	//Switch Possession
	PChange2 ();

	//Player 1's 4th turn
	x4 = c.getChar ();

	if (x4 == 'q')
	{
	    OneOneX ();
	}

	else if (x4 == 'w')
	{
	    TwoOneX ();
	}

	else if (x4 == 'e')
	{
	    ThreeOneX ();
	}

	else if (x4 == 'a')
	{
	    OneTwoX ();
	}

	else if (x4 == 's')
	{
	    TwoTwoX ();
	}

	else if (x4 == 'd')
	{
	    ThreeTwoX ();
	}

	else if (x4 == 'z')
	{
	    OneThreeX ();
	}

	else if (x4 == 'x')
	{
	    TwoThreeX ();
	}

	else if (x4 == 'c')
	{
	    ThreeThreeX ();
	}

	else
	{
	    c.println ("Invalid character.");
	}

	//Switch Possession
	PChange1 ();

	//Player 2's 4th turn

	o4 = c.getChar ();

	if (o4 == '7')
	{
	    OneOneO ();
	}

	else if (o4 == '8')
	{
	    TwoOneO ();
	}

	else if (o4 == '9')
	{
	    ThreeOneO ();
	}

	else if (o4 == '4')
	{
	    OneTwoO ();
	}

	else if (o4 == '5')
	{
	    TwoTwoO ();
	}

	else if (o4 == '6')
	{
	    ThreeTwoO ();
	}

	else if (o4 == '1')
	{
	    OneThreeO ();
	}

	else if (o4 == '2')
	{
	    TwoThreeO ();
	}

	else if (o4 == '3')
	{
	    ThreeThreeO ();
	}

	else
	{
	    c.println ("Invalid character.");
	}

	//Switch Possession
	PChange2 ();

	//Player 1's 5th turn
	x5 = c.getChar ();

	if (x5 == 'q')
	{
	    OneOneX ();
	}

	else if (x5 == 'w')
	{
	    TwoOneX ();
	}

	else if (x5 == 'e')
	{
	    ThreeOneX ();
	}

	else if (x5 == 'a')
	{
	    OneTwoX ();
	}

	else if (x5 == 's')
	{
	    TwoTwoX ();
	}

	else if (x5 == 'd')
	{
	    ThreeTwoX ();
	}

	else if (x5 == 'z')
	{
	    OneThreeX ();
	}

	else if (x5 == 'x')
	{
	    TwoThreeX ();
	}

	else if (x5 == 'c')
	{
	    ThreeThreeX ();
	}

	else
	{
	    c.println ("Invalid character.");
	}


    }


    public static void TitlePage ()  //Method for Title Page
    {
	//Title Page Grid

	c.fillRect (0, 0, 640, 500);
	c.setColor (Color.white);

	Font TITLEPAGE1 = new Font ("Calibri", Font.PLAIN, 50);
	Font TITLEPAGE2 = new Font ("Calibri", Font.PLAIN, 18);
	c.setFont (TITLEPAGE1);

	c.drawRect (150, 100, 300, 300);
	c.drawLine (150, 200, 450, 200);
	c.drawLine (150, 300, 450, 300);
	c.drawLine (250, 100, 250, 400);
	c.drawLine (350, 100, 350, 400);

	delay (400);
	c.drawString ("Tic", 170, 165);
	delay (400);
	c.drawString ("Tac", 265, 265);
	delay (400);
	c.drawString ("Toe", 360, 365);

	c.setFont (TITLEPAGE2);
	delay (400);
	c.drawString ("Press 1 to play", 5, 450);
	c.drawString ("Press 2 for instructions", 5, 470);

	c.setCursor (23, 30);
	int HomeScreen = c.readInt ();

	if (HomeScreen == 1)
	{
	    c.clear ();
	    GameScreen ();
	}

	else if (HomeScreen == 2)
	{
	    c.clear ();
	    Instructions ();
	}

	else
	{
	    c.println ("Error: invalid character.");
	}
    }


    public static void GameScreen ()  //Method for GAME SCREEN
    {
	Color LIGHTPURPLE = new Color (217, 210, 238);
	c.setColor (LIGHTPURPLE);
	c.fillRect (0, 0, 640, 500);

	c.setColor (Color.black);

	Font TITLEPAGE1 = new Font ("Calibri", Font.PLAIN, 50);
	Font TITLEPAGE2 = new Font ("Calibri", Font.PLAIN, 14);
	Font TITLEPAGE3 = new Font ("Calibri", Font.PLAIN, 24);

	//TicTacToe Box
	c.drawLine (300, 100, 300, 400);
	c.drawLine (400, 100, 400, 400);
	c.drawLine (500, 100, 500, 400);
	c.drawLine (600, 100, 600, 400);
	c.drawLine (300, 100, 600, 100);
	c.drawLine (300, 200, 600, 200);
	c.drawLine (300, 300, 600, 300);
	c.drawLine (300, 400, 600, 400);
	//Possession box
	c.setFont (TITLEPAGE1);
	c.drawString ("Posession", 50, 50);
	c.drawRoundRect (70, 80, 160, 80, 15, 15);
	c.drawRect (90, 100, 40, 40);
	c.drawRect (170, 100, 40, 40);

	//Initial Possession for player 1 (X)
	c.setFont (TITLEPAGE2);
	c.drawString ("Player 1", 89, 95);
	c.drawString ("Player 2", 167, 95);
	c.setColor (Color.yellow);
	c.fillRect (90, 100, 41, 41);

	//Instructions
	c.setColor (Color.black);
	c.setFont (TITLEPAGE3);
	c.drawString ("Game Instructions", 58, 210);

	c.setFont (TITLEPAGE2);
	c.drawString ("1.Player 1 goes first.", 1, 240);
	c.drawString ("2. Press the key that places X or O in the right", 1, 260);
	c.drawString ("position.", 1, 280);
	c.drawString ("3. Keep taking turns until there are three Xs or Os", 1, 300);
	c.drawString ("in a row, or there is nowhere to place an X or O.", 1, 320);
	c.drawString ("4. The game must always end in a win for one player", 1, 340);
	c.drawString ("or a tie.", 1, 360);
	c.drawString ("5. You're up, player 1!", 1, 380);
	
	c.drawString ("If Player 1 gets 3 Xs in a row, Player 1 wins!",1,420);
	c.drawString ("If Player 2 gets 3 Os in a row, Player 2 wins!",1,440);
	c.drawString ("If neither, it's a tie!", 1,460);

    }


    public static void Instructions ()  //Method for Instructions
    {
	//Create and fill background
	Color LIGHTPURPLE = new Color (217, 210, 238);
	c.setColor (LIGHTPURPLE);
	c.fillRect (0, 0, 640, 500);

	//Introduce Fonts
	Font TITLEPAGE1 = new Font ("Calibri", Font.PLAIN, 50);
	Font TITLEPAGE2 = new Font ("Calibri", Font.PLAIN, 16);

	c.setColor (Color.black);
	c.setFont (TITLEPAGE1);
	c.drawString ("Instructions", 190, 50);

	c.setFont (TITLEPAGE2);
	c.drawString ("1. Player 1 is X and Player 2 is O.", 0, 100);
	c.drawString ("2. Player 1 goes first and places an X on one of the squares.", 0, 125);
	c.drawString ("3. Player 2 then places a O. ", 0, 150);
	c.drawString ("4. Keep alternating moves until one of you has drawn a row of three or until no one can win!", 0, 175);
	c.drawString ("Keyboard controls are shown below.", 0, 210);


	c.drawString ("Player 1 Controls", 100, 250);

	c.drawRect (75, 275, 180, 180);
	c.drawLine (75, 335, 255, 335);
	c.drawLine (75, 395, 255, 395);
	c.drawLine (135, 275, 135, 455);
	c.drawLine (195, 275, 195, 455);

	c.drawString ("Player 2 Controls", 410, 250);

	c.drawRect (375, 275, 180, 180);
	c.drawLine (375, 335, 555, 335);
	c.drawLine (375, 395, 555, 395);
	c.drawLine (435, 275, 435, 455);
	c.drawLine (495, 275, 495, 455);

	c.setFont (TITLEPAGE1);
	c.drawString ("Q", 87, 320);
	c.drawString ("W", 142, 322);
	c.drawString ("E", 210, 322);
	c.drawString ("A", 87, 380);
	c.drawString ("S", 153, 380);
	c.drawString ("D", 208, 380);
	c.drawString ("Z", 91, 440);
	c.drawString ("X", 153, 440);
	c.drawString ("C", 208, 440);


	c.drawString ("7", 392, 320);
	c.drawString ("8", 452, 320);
	c.drawString ("9", 512, 320);
	c.drawString ("4", 392, 380);
	c.drawString ("5", 452, 380);
	c.drawString ("6", 512, 380);
	c.drawString ("1", 392, 440);
	c.drawString ("2", 452, 440);
	c.drawString ("3", 512, 440);

	c.setFont (TITLEPAGE2);
	c.drawString ("Press any key to continue", 0, 490);
	c.getChar ();

	GameScreen ();
    }


    public static void PChange1 ()  //Method to switch possession from Player 1 to Player 2
    {
	Color LIGHTPURPLE = new Color (217, 210, 238);
	c.setColor (LIGHTPURPLE);
	c.fillRect (90, 100, 41, 41);
	c.setColor (Color.yellow);
	c.fillRect (170, 100, 41, 41);
	c.setColor (Color.black);
    }


    public static void PChange2 ()  //Method to switch possession from Player 2 to Player 1
    {
	Color LIGHTPURPLE = new Color (217, 210, 238);
	c.setColor (LIGHTPURPLE);
	c.fillRect (170, 100, 41, 41);
	c.setColor (Color.yellow);
	c.fillRect (90, 100, 41, 41);
	c.setColor (Color.black);
    }


    // (1,1) means the first square in the 3x3 grid. It's the top left corner.

    public static void OneOneX ()  //Method to draw X at the (1,1) square
    {
	c.drawLine (310, 110, 390, 190);
	c.drawLine (310, 190, 390, 110);

    }


    public static void OneOneO ()  //Method to draw O at the (1,1) square
    {
	c.drawOval (310, 110, 80, 80);
    }


    public static void TwoOneX ()  //Method to draw X at (2,1)
    {
	c.drawLine (410, 110, 490, 190);
	c.drawLine (410, 190, 490, 110);
    }


    public static void TwoOneO ()  //Method to draw O at (2,1)
    {
	c.drawOval (410, 110, 80, 80);
    }


    public static void ThreeOneX ()  //Method to draw X at (3,1)
    {
	c.drawLine (510, 110, 590, 190);
	c.drawLine (510, 190, 590, 110);
    }


    public static void ThreeOneO ()  //Method to draw O at (3,1)
    {
	c.drawOval (510, 110, 80, 80);
    }


    public static void OneTwoX ()  //Method to draw X at (1,2)
    {
	c.drawLine (310, 210, 390, 290);
	c.drawLine (310, 290, 390, 210);
    }


    public static void OneTwoO ()  //Method to draw O at (1,2)
    {
	c.drawOval (310, 210, 80, 80);
    }


    public static void TwoTwoX ()  //Method to draw X at (2,2)
    {
	c.drawLine (410, 210, 490, 290);
	c.drawLine (410, 290, 490, 210);
    }


    public static void TwoTwoO ()  //Method to draw O at (2,2)
    {
	c.drawOval (410, 210, 80, 80);
    }


    public static void ThreeTwoX ()  //Method to draw X at (3,2)
    {
	c.drawLine (510, 210, 590, 290);
	c.drawLine (510, 290, 590, 210);
    }


    public static void ThreeTwoO ()  //Method to draw O at (3,2)
    {
	c.drawOval (510, 210, 80, 80);
    }


    public static void OneThreeX ()  //Method to draw X at (1,3)
    {
	c.drawLine (310, 310, 390, 390);
	c.drawLine (310, 390, 390, 310);
    }


    public static void OneThreeO ()  //Method to draw O at (1,3)
    {
	c.drawOval (310, 310, 80, 80);
    }


    public static void TwoThreeX ()  //Method to draw X at (2,3)
    {
	c.drawLine (410, 310, 490, 390);
	c.drawLine (410, 390, 490, 310);
    }


    public static void TwoThreeO ()  //Method to draw O at (2,3)
    {
	c.drawOval (410, 310, 80, 80);
    }


    public static void ThreeThreeX ()  //Method to draw X at (3,3)
    {
	c.drawLine (510, 310, 590, 390);
	c.drawLine (510, 390, 590, 310);
    }


    public static void ThreeThreeO ()  //Method to draw O at (3,3)
    {
	c.drawOval (510, 310, 80, 80);
    }


    public static void PossessionBox ()  // Method to draw possession box
    {
	// Method to draw possession box
	c.drawRoundRect (70, 80, 160, 80, 15, 15);
	c.drawRect (90, 100, 40, 40);
	c.drawRect (170, 100, 40, 40);
    }


    public static void Scoreboard ()  //Method to draw scoreboard
    {
	// Method to draw possession box
	c.drawRoundRect (70, 80, 160, 80, 15, 15);
	c.drawRect (90, 100, 40, 40);
	c.drawRect (170, 100, 40, 40);
	//Method to draw scoreboard
	c.drawLine (150, 175, 150, 400);
	c.drawLine (50, 200, 250, 200);
    }
} // TicTacToe class



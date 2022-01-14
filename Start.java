import java.util.Scanner;

public class Start
{
	public static void main(String[]args)
	{
	Scanner in = new Scanner(System.in);

		System.out.println("\nApp demo:\n");

		Ball MyBall = new Ball();
		Platform MyPlatform = new Platform();
		Rating MyRating = new Rating();
		Button MyButton = new Button();
/*
		System.out.println("6) Coins array:");
		Coin[] MyArrayCoins = new Coin[5];
		for (int i = 0; i < 5; i = i + 1)
		{
			MyArrayCoins[i] = new Coin();
			MyArrayCoins[i].RandXY();
			MyArrayCoins[i].Display();
		}


		System.out.println("7) Returning an integer value from a method through a helper class:");
		Coin CoinAux = new Coin();
		CoinAux = MyRating.GetCoin(3);
		CoinAux.Display();
*/
		System.out.println("Laba 8) Static: ");
		// Формирование объектов класса Button:
		Button A = new Button(true);
		Button B = new Button(true);
		Button C = new Button(false);
		Button D = new Button(false);

		A.NewList();
		
		System.out.println("New list: ");
		// Вызов статической компанентной функции:
		D.reprint();

		System.out.println("Add elements: ");
		// Включение созданных компанентов в двусвязанный список:
		A.Add(); B.Add(); C.Add(); D.Add();

		System.out.println("Reprint: ");
		// Печать в обратном порядке значений элементов списка:
		D.reprint();
/*
		System.out.println("9) String: ");
		MyBall.Set(0,0,"BOSS");
		MyBall.Display();
		MyBall.ModernName();
		MyBall.Display();
*/



/*
		System.out.println("\nData Ball:");
		MyBall.Set(0,0,"BOSS");
		MyBall.Display();
		
		//Platform
		System.out.println("\nData Platform:");
		MyPlatform.Set(25,10);
		MyPlatform.Display();

		System.out.println("\nData Rating:");
		MyRating.Set(4,MyArrayCoins);
		MyRating.Display();

		//Button
		System.out.println("\nData Button:");
		MyButton.Set(false);
		MyButton.Display();

		System.out.println("\nIndividual functions:\n");
		System.out.println("\nTake a ball step:\n");
		MyBall.MoveBall();
		MyBall.Display();

	    System.out.println("\nRandom changing the platform angle:\n");
	    MyPlatform.RandRotate();
	    MyPlatform.Display();


		System.out.println("\nEntering data using the example of a ball:\n");
		MyBall.InpData();
		System.out.println("\nNew data Ball:");
		MyBall.Display();
		*/
	}
}
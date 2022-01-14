import java.util.Scanner;

//Рейтинг
public class Rating
{
	private int points = 0;
	private Coin[] ArrayCoins = new Coin[5];


//Конструктор
public Rating()
{
	points = 0;
	Coin C = new Coin();
	C.Set(0,0);
	for (int i = 0; i < 5; i++)
		ArrayCoins[i] = C;
}

//Ф-ии получения данных из полей
public int GetPoints()
{
	return points;
}

public Coin GetCoin (int i)
{
	Coin C = new Coin();
	//if (i < 5 && i > -1)
		C = ArrayCoins[i];
	return C;
}


//Задание полей класса 
public void Set(int pointsi, Coin array[])
{
	points = pointsi;
		for (int i = 0; i < 5; i++)
			ArrayCoins[i] = array[i];
}




//Вывод рейтинга
public void Display()
{
	System.out.println("Points = " + points);
	System.out.println("Coins: ");
	for (int i = 0; i < 5; i=i+1)
		ArrayCoins[i].Display();
}

public void PlusRating(){
	points = points + 1;
}

}
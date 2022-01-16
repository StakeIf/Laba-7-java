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
	Coin C = new Coin(0,0);
	for (int i = 0; i < 5; i++)
		ArrayCoins[i] = C;
}

public Rating(int points)
{
    this.points = points;
    Coin C = new Coin();
    for (int i = 0; i < 5; i++)
        ArrayCoins[i] = C;
}

public Rating(int pointsi, Coin[] array)
{
    points = pointsi;
    Coin C= new Coin();
    for (int i = 0; i < 5; i++)
        ArrayCoins[i] = array[i];
}

public void SetPoint(int pointsi)
{
    points = pointsi;
}

public void SetCoinArray(Coin[] array)
{
    Coin C;
    for (int i = 0; i < 5; i++)
        ArrayCoins[i] = array[i];
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
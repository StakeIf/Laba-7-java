import java.util.Scanner;

//Монета
public class Coin
{
	private int x = 0;
	private int y = 0;


//Конструктор
public Coin()
{
	x = 0;
	y = 0;
}

//Ф-ии получения данных из полей
public int GetX()
{
	return x;
}
public int GetY()
{
	return y;
}

//Задание полей класса Монета
public void Set(int xi, int yi)
{
	x = xi;
	y = yi;
}

//Ввод данных о Монете
public void InpData()
{
	Scanner in = new Scanner(System.in);

	System.out.println("Input x");
	x = in.nextInt();
	System.out.println("Input y");
	y = in.nextInt();
	in.close();
}

//Случайный ввод координат монеты
public void RandXY()
{
	x = (int) (Math.random() * 10);
	y = (int) (Math.random() * 10);
}


//Вывод данных о Монете
public void Display()
{
	System.out.println("X = " + x + " Y = " + y);
}

}
import java.util.Scanner;

//Платформе
public class Platform
{
	private int angle = 0;
	private int height = 0;

//Конструктор
public Platform()
{
	angle = 0;
	height = 0;
}

//Ф-ии получения данных из полей
public int GetAngle()
{
	return angle;
}
public int GetHeight()
{
	return height;
}

//Задание полей класса Платформа
public void Set(int anglei, int heighti)
{
	angle = anglei;
	height = heighti;
}

//Ввод данных о Платформе
public void InpData()
{
	Scanner in = new Scanner(System.in);

	System.out.println("Input angle");
	angle = in.nextInt();
	System.out.println("Input height");
	height = in.nextInt();
	in.close();
}


//Вывод данных о Платформе
public void Display()
{
	System.out.println("angle = " + angle + " \nheight = " + height);
}

//Случайное изменение угла
public void RandRotate()
{
	angle = (int) (Math.random() * 10);
}

}
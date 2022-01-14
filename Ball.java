import java.util.Scanner;

//Мяч
public class Ball
{
	private int x = 0;
	private int y = 0;
	private String Name = "";


//Конструктор
public Ball()
{
	x = 0;
	y = 0;
	Name = "";
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
public String GetName()
{
	return this.Name;
}

//Задание полей класса Мяч
public void Set(int xi, int yi, String Namei)
{
	x = xi;
	y = yi;
	this.Name = Namei;
}

//Ввод данных о Мяче
public void InpData()
{
	String os = System.getProperty("os.name");
	String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866":"utf-8");
	Scanner in = new Scanner(System.in, consoleEncoding);

	System.out.println("Input x");
	x = in.nextInt();
	System.out.println("Input y");
	y = in.nextInt();
	System.out.println("Input Name");
	String s = in.nextLine();
	Name = in.nextLine();
	in.close();
}


//Вывод данных о Мяче
public void Display()
{
	System.out.println("X = " + x + " Y = " + y + " Name - " + Name);
}

//Сделать шаг

public void MoveBall()
{
	Scanner in = new Scanner(System.in);	

	System.out.println("Press \n  'D' to increase the x value \n  'A' to decrease the x value\n  'W' to increase the y value\n  'S' to decrease the y value");
	String k = in.next();
	char key = k.charAt(0);
	if (key == 'a')
        x--;
    if (key == 'd')
        x++;
    if (key == 'w')
        y++;
    if (key == 's')
        y--;
}

public void ModernName()
{
	Name = "Ball " + Name;
}

}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit Apple = new Fruit ("Fuji Apple","Red",21);
		System.out.println (Apple.name);
		System.out.println (Apple.color);
		System.out.println (Apple.weight +"kg");
		
System.out.println ("-----------------------------------------");
		Apple GreenApple = new Apple("Green Apple","Green",30);
		System.out.println (GreenApple.name);
		System.out.println (GreenApple.color);
		System.out.println (GreenApple.weight +"kg");

System.out.println ("-----------------------------------------");

		Apple RedApple = new Apple ("Red Apple","Red",25);
		System.out.println (RedApple.name);
		System.out.println (RedApple.color);
		System.out.println (RedApple.weight+"kg");

System.out.println ("-----------------------------------------");
		
		Fruit Watermelon = new Fruit ("Watermelon","Green",20);
		System.out.println (Watermelon.name);
		System.out.println (Watermelon.color);
		System.out.println (Watermelon.weight);
	}

	

}

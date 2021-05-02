
public class Watermelon extends Fruit  {
	private String color;
	private double weight ;
	public Watermelon(String name, String color, double weight) {
		  super(name, color,weight);
		  this.weight = weight ;
	    System.out.println("Watermelon constructor is invoked");
	  }
}

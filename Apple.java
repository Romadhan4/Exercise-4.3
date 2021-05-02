
public class Apple extends Fruit {
	String color ;
	double weight;
	  public Apple(String name, String color,double weight) {
		  super(name, color, weight);
		  this.color=color;
		  this.weight = weight;
		  
	    System.out.println("Apple constructor is invoked");
	  }
}

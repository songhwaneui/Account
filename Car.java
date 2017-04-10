
public class Car implements Valuable {
	private String name;
	private double price;
	
	public Car(String name, double price){
		this.name=name;
		this.price=price;
	}
	
	@Override
	public double EstimateValue(int month){
		price = 0.8*price;
		for(int i=0;i<month;i++)
		{
			price=price-(price*0.01);
		}
		return price;
	}
	public String toString(){
		return String.format("car name: MyCar\ninitial price:5000.00");
		
	}
	
}

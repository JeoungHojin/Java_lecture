
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTest c = new CarTest(2,80,"red");
			
		System.out.println(c.toString());
		c.changeGear(5);
		c.speedUp();
		System.out.println(c.toString());
		c.speedDown();
		System.out.println(c.toString());
	}

}
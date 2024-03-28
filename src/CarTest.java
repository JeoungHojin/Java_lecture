
public class CarTest {
	private int gear;
	private int speed;
	private String color;
	
	public CarTest(int gear_, int speed_, String color_){
		gear = gear_;
		speed = speed_;
		color =color_;
	}


	void changeGear(int newGear) {
		gear = newGear;
	}
	
	public String toString() {
		return "Car [color = "+color+",speed="+speed+",gear="+gear+"]";
				
	}
	
	void speedUp() {
		speed += 10;
	}
	
	void speedDown() {
		speed -= 10;
	}
	
}

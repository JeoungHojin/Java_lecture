import java.util.*;
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w ,h; // wide , height
		double perimeter, area;
		System.out.print("input the wide and height");
		Scanner input = new Scanner(System.in);
		w = input.nextInt();
		h = input.nextInt();
		area = w * h;
		perimeter = 2*(w+h);
		System.out.println("wide of the box is "+area+"\nheight of the box is "+perimeter);
	}

}
//print와 println의 차이 : print는 줄바꿈 x println은 줄바꿈 o
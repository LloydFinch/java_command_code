
import java.util.Random;

class Hello{
	public static void main(String []args){

		Random random = new Random();
		int a = random.nextInt(100);
		System.out.println("hello world!");
		System.out.println("next random = " + a);
	}
}

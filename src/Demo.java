import java.util.Date;


public class Demo {
	public static void main(String[] args) {
		for (int i = 0; i < 500; i++) {
			System.out.print((new Date()).getTime() + i * 1000);
			System.out.println(",");
		}
	}
}

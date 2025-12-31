package Simple;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234, rev = 0;

		while (num != 0) {
		    rev = rev * 10 + num % 10;
		    num = num / 10;
		}

		System.out.println(rev); // 4321
	}

}

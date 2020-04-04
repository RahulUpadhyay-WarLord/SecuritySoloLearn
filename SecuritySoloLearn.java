import java.util.Scanner;

public class SecuritySoloLearn {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
		//char [] signs = input.toCharArray();
		int money = input.indexOf('$');
		int thief = input.indexOf('T');
		System.out.println("money: " + money + ", thief: " + thief);
		String sub = subStr(input, money, thief);
		System.out.println(sub);
		String ret = "";
		if (sub.contains("G")) {
			ret = "quiet";
		} else {
			ret = "ALARM";
		}
		System.out.println(ret);
	}

	static String subStr(String in, int mon, int thi) {
		String ret = "";
		if (mon < thi) {
			ret = in.substring(mon+1,thi);
		} else {
			ret = in.substring(thi+1,mon);
		}
		return ret;
	}
}

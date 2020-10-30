package _07_regex;

public class RegexDemo {

	public static void main(String[] args) {
		String input = "19986485632";
		String regex = "^1[3|5|7|8|9]\\d{9}$";
		System.out.println(input.matches(regex));

	}

}

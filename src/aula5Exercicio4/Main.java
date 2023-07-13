package aula5Exercicio4;

import java.util.Stack;

public class Main {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "(){}[]";
		System.out.println(s1 + " entrada é válida? " + isValid(s1));

		String s2 = "({[]})";
		System.out.println(s2 + " entrada é válida? " + isValid(s2));

		String s3 = "({[}])";
		System.out.println(s3 + " entrada é válida?: " + isValid(s3));
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}

		return stack.isEmpty();
	}

}

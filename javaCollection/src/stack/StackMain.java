package stack;

public class StackMain {
	public static void main(String[] args) {
		Stack stack = new StackImpl(3);
		stack.push("홍길동");
		stack.push("강감찬");
		stack.push("이순신");
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}
}
package stack;

public class StackImpl implements Stack{
	/*
	 자료구조를 코딩할 때는 인터페이스를 구현하면서
	 반드시(?) 메소드가 공통으로 처리한 값을 두는 
	 배열이나 자료구조를 필드에 두어야 한다.
	 */	
	private Object[] objects; // 필드에 Object타입의 배열선언
	private int pointer;
	
	public StackImpl() {
		this(10);
	}
	
	
	public StackImpl(int capacity) {
		objects = new Object[capacity]; // 배열을 선언하는데 최소한 약간의 동적개념 적용
		pointer = 0; // 인덱스 초기화는 0부터
	}


	@Override
	public void push(Object obj) {
		if (isFull()) {
			System.out.println("스택 용량을 초과하였습니다."); //스택은 좌->우가 아니라 하->상으로 쌓이는 구조
			return;
		} else {
			objects[pointer++] = obj;
		}
		
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			System.out.println("스택에 저장된 객체가 없습니다.");
			return null;
		} else {
			Object obj = objects[--pointer];
			objects[pointer] = null;
			return obj;
		}
		
	}

	@Override
	public boolean isEmpty() {		
		return pointer == 0;
	}

	@Override
	public boolean isFull() {		
		return pointer == objects.length; // objects는 배열이므로 index크기값을 나타내는 length사용
	}

	@Override
	public int size() {
		return pointer;
	}
	
}

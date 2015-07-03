package stack;

public interface Stack {
	/*
	 스택은 최상위에 객체를 저장한다.
	 */
	public void push(Object obj);
	/*
	 스택의 최상위의 객체를 제거하면서 가져온다.
	 */
	public Object pop();
	/*
	 스택이 비어있는지 여부를 반환한다.
	 */
	public boolean isEmpty();
	/*
	 스택이 꽉차있는지 여부를 반환한다.
	 */
	public boolean isFull();
	/*
	 스택이 저장된 객체의 수를 반환한다.	 
	 */
	public int size();
}

package thread;

public class Atm {
	public synchronized void inchul(String name){
		/*
		 synchronized 키워드는 동기화 키워드로
		 멀티 스레드가 비동기 개념을 지원하는데
		 금융거래등의 반드시 동기화 해야하는 로직을 구현할 떄는
		 이 키워드를 메소드 접근제한자 뒤에 붙인다. 
		 */
		System.out.println(name + "님이 돈을 인출요청함");
		for (int i = 0; i < 100000000; i++) {
			if(i==10000){
				System.out.println(name + "님이 인출중");
			}
		}
		System.out.println(name + "님이 인출해서 나감");
	}
}

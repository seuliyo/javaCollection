package hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = scanner.next();
		System.out.println("비밀번호를 입력하세요");
		String password = scanner.next();
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt();
		System.out.println("주소를 입력하세요");
		String addr = scanner.next();
		/*
		 객체를 생성해서 완성시키세요
		 객체를 생성하는 이유는 단 한가지
		 객체가 불러오는 메소드를 활용하기 위해서
		 */
		
		MemberService service = new MemberServiceImpl();
		service.join(name, addr, age, id, password);
		
		while (true) { // 무한루프 패턴은 if조건에서 break가 필수로 존재해야한다.			
			System.out.println("로그인을 하세요");
			System.out.println("아이디를 입력해주세요.");
			id = scanner.next();
			System.out.println("비밀번호를 입력해주세요.");
			password = scanner.next();
			String msg = service.login(id, password);
			String flag = msg.substring(0, 5);
			/*System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println(service.login(scanner.next(id), scanner.next(password)));*/
			if (flag.equals("환영합니다")) {
				System.out.println(msg);
				break;
			} else if(flag.equals("비번이 다")) {
				System.out.println(msg);
				continue; // 무한루프에서 계속 돌아라
			} else if(flag.equals("입력하신 ")){
				System.out.println(msg);
				continue;
			} else {
				System.out.println("다시 입력해 주세요. ");
				continue;
			}					
		}
	}
}
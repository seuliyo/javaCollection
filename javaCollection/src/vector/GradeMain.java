package vector;

import java.util.Scanner;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		Grade hong = new Grade("1111", "홍길동", 90, 80, 70);
		Grade kang = new Grade("2222", "강감찬", 80, 50, 30);
		Grade kim = new Grade("3333", "김유신", 40, 20, 10);
		Grade lee = new Grade("4444", "이순신", 100, 100, 100);
		
		service.input(hong);
		service.input(kang);
		service.input(kim);
		service.input(lee);
		
		System.out.println("====== 전체 조회 ======");
		service.printList();
		
		System.out.println("====== 학번으로 조회 ======");
		Scanner scanner = new Scanner(System.in);
		System.out.println(service.searchGradeByHak(scanner.next()));
		

	}
}
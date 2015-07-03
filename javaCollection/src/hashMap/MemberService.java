package hashMap;

public interface MemberService {
	/*회원가입 기능 : 파라미터 추가는 개발자 자유*/
	public void join(String name, String addr, int age, String id, String password);
	/*로그인 기능 : 파라미터 추가는 개발자 자유 */
	public String login(String id, String password);
}

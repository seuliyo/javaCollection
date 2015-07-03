package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	
	Map<String,Object> map = new HashMap<String,Object>();
	Member member = new Member();
	
	@Override
	public void join(String name, String addr, int age, String id, String password) {
		member.setName(name);
		member.setAddr(addr);
		member.setAge(String.valueOf(age));
		member.setId(id);
		member.setPassword(password);
		/* DB에 연결이 되었다면 (이 과정이 JSP라면) 이것이 정답
		map.put(member.getId(), new Member(member.getId(), member.getPassword()
				member.getPassword(), member.getName()
				member.getAge(), member.getAddr()));*/
		map.put("id",member.getId());
		map.put("password",member.getPassword());
		map.put("name",member.getName());
		map.put("age",member.getAge());
		map.put("addr", member.getAddr());
		
		
	}

	@Override
	public String login(String id, String password) {
		String msg = "";	
		//if문을 true로 주고 어떤 상황이면 true를 반환할지 고민
		if (map.get("id").equals(id) && map.get("password").equals(password)) { // && 두 조건 모두 충족
			msg = "환영합니다. " + member.getAddr() + "에 사시는 "
					+ member.getAge() + "세 " + member.getName() + "님";								
		} else if(map.get("id").equals(id) && !map.get("password").equals(password)){
			msg = "비밀번호가 다릅니다. 다시 입력하세요.";
		} else {
			msg = "입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요.";
		}
		return msg;
	}

}

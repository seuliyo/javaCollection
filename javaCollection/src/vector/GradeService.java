package vector;

import java.util.Vector;

public interface GradeService {
	/*
	 학생별 성적을 입력하는 기능 
	 */
	public void input(Grade grade);
	/*
	 전체 학생성적표 출력
	 */
	public void printList();
	/*
	 학번으로 성적을 조회하는 기능
	 */
	public String searchGradeByHak(String hak);
	/*
	 이름으로 성적을 조회하는 기능 (단, 동명이인이 존재할 경우 전부 출력)
	 */
	public Vector<Grade> searchGradesByName(String name);
}

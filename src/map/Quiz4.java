package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz4 {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> map = new HashMap<>();
			Student student1 = new Student(1001, "둘리", 90, 80, 70);
			Student student2 = new Student(1002, "도우너", 55, 65, 75);
			Student student3 = new Student(1003, "또치", 80, 50, 50);
			
			map.put(student1.studentId, student1);
			map.put(student2.studentId, student2);
			map.put(student3.studentId, student3);
			
			Set<Integer> keys = map.keySet();
			
			for (int key : keys) {
				Student student = map.get(key);
				int sum = student.korScore + student.mathScore + student.engScore;
				double avg = sum / 3.0;
				
				System.out.println(student.name + "학생의 총점: " + sum + " 평균 : " + avg );
				
			}
			
			int korSum = 0;
			int mathSum = 0;
			int engSum = 0;
			
			
			for (int key : keys) {
				Student student = map.get(key);
				korSum = korSum + student.korScore;
				mathSum = mathSum + student.mathScore;
				engSum = engSum + student.engScore;
			} // for문이 다 끝나야지 과목에 대한 정보가 나옴
			
			// for문 밖에서 출력해야함!
			System.out.println("국어의 총점: " + korSum + " 평균: " +(korSum / 3.0));
			System.out.println("수학의 총점: " + mathSum + " 평균: " +(mathSum / 3.0));
			System.out.println("영어의 총점: " + engSum + " 평균: " +(engSum / 3.0));
			
	}

}

class Student {
	int studentId;
	String name;
	int korScore;
	int mathScore;
	int engScore;
	
	public Student(int studentId, String name, int korScore, int mathScore, int engScore) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", korScore=" + korScore + ", mathScore="
				+ mathScore + ", engScore=" + engScore + "]";
	}
	
}

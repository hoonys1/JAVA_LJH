package Day10.Ex02_Object;
// 교제 357페이지
class Student {
	
	int studentId;			// 학번
	String studentName;		// 이름
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// obj 가 Student 클래스가 아니면, 다른 객체
		if( !(obj instanceof Student) )
			return false;
		
		Student student2 = (Student) obj;
		// 학번이 같으면 같은 학생이다.
		if( this.studentId == student2.studentId ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}

public class StudentEquals {

	public static void main(String[] args) {
		Student student = new Student(1001, "김조은");	// Student1 의 주소
		Student student2 = student;						// Student2 의 주소는 Student1을 그대로 가져왔다
		Student student3 = new Student(1001, "김조은");	// Student3 의 주소는 새로 만든거라 Student1과 다르다.
		
		if( student == student2)
			System.out.println("student와 student2 의 주소가 같습니다.");
		else
			System.out.println("student와 student2 의 주소가 다릅니다.");
		
		
		if( student.equals(student2))
			System.out.println("student와 student2 는 같은 학생입니다.");
		else
			System.out.println("student와 student2 는 다른 학생입니다.");
		// -----------------------------------------------------------
		if( student == student3)
			System.out.println("student와 student3 의 주소가 같습니다.");
		else
			System.out.println("student와 student3 의 주소가 다릅니다.");
		
		if( student.equals(student3))
			System.out.println("student와 student3 는 같은 학생입니다.");
		else
			System.out.println("student와 student3 는 다른 학생입니다.");
	}
}

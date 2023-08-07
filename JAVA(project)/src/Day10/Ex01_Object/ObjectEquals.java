package Day10.Ex01_Object;

// 교제 357페이지
class Student {
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
}

public class ObjectEquals {

	public static void main(String[] args) {
		Student student = new Student(1001, "김조은");	// Student1 의 주소
		Student student2 = student;						// Student2 의 주소는 Student1을 그대로 가져왔다
		Student student3 = new Student(1001, "김조은");	// Student3 의 주소는 새로 만든거라 Student1과 다르다.
		
		if( student == student2)
			System.out.println("student와 student2 의 주소가 같습니다.");
		else
			System.out.println("student와 student2 의 주소가 다릅니다.");
		
		
		if( student.equals(student2))
			System.out.println("student와 student2 는 같습니다.");
		else
			System.out.println("student와 student2 는 다릅니다.");
		// -----------------------------------------------------------
		if( student == student3)
			System.out.println("student와 student3 의 주소가 같습니다.");
		else
			System.out.println("student와 student3 의 주소가 다릅니다.");
		if( student.equals(student3))
			System.out.println("student와 student3 는 같습니다.");
		else
			System.out.println("student와 student3 는 다릅니다.");
	}
}

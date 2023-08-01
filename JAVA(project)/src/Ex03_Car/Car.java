package Ex03_Car;

public class Car {
	// 모델명,속도
	String medel;
	private int speed;

	// 생성자
	public Car() {
	
	}

	public Car(String medel) {
		this.medel = medel;
	}

	public Car(String medel, int speed) {
		this.medel = medel;
		this.speed = speed;
	}

	// getter : 변수의 값을 가져오는 메소드
	// setter : 변수의 값을 불러오는 메소드
	// 겟터/세터 이름 : getName(), setName()
	// - get/set 뒤에 변수명을 첫글자를 대문자로해서 메소드명 정의(관례)
	// 자동완성 : alt + shift + S -> R

	public String getMedel() {
		return medel;
	}

	public void setMedel(String medel) {
		this.medel = medel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if( speed < 0)
			speed = 0;
		
		if( speed >= 300)
			speed = 300;
			
		this.speed = speed; 
		
	}
	
	
	
}

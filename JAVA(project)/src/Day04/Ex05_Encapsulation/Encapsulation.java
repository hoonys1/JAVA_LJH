package Day04.Ex05_Encapsulation;

/*
 *  통장계좌
 *  - 예금액
 *  - 은행명
 *  - 계좌번호
 *  - 예금주
 */
public class Encapsulation {

	private int deposit;
	private String bank;
	private String depoNuber;
	private String depositor;
	
	// 기본 생성자
	public Encapsulation() {
		
	}
	// 매개변수가 있는 생성자
	public Encapsulation(int deposit, String bank, String depoNuber, String depositor) {
		this.deposit = deposit;
		this.bank = bank;
		this.depoNuber = depoNuber;
		this.depositor = depositor;
	}


	// getter, setter
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getDepoNuber() {
		return depoNuber;
	}

	public void setDepoNuber(String depoNuber) {
		this.depoNuber = depoNuber;
	}

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}
	// toString
	@Override
	public String toString() {
		return "Encapsulation [deposit=" + deposit + ", bank=" + bank + ", depoNuber=" + depoNuber + ", depositor="
				+ depositor + "]";
	}
	
	
	
}

package kr.s23.object.bank;

public class MinusAccount extends BankAccount{
	private long minusLimit;  //private이니까 set메서드를 넣으려고 한다. 

	//생성자
	public MinusAccount(String number,String password, String name, long balance, long minusLimit) {
		//BankAccount 부모클래스의 인자가 있는 생성자를 호출
		super(number, password, name, balance);
		this.minusLimit=minusLimit;
	}
	
	//메서드 오버라이딩(재정의)
	@Override
	public void withdraw(long amount) {
		if(amount<=0) {
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
			return;
		}
		if(balance + minusLimit < amount) {  //한도적용도 해야한다.
			System.out.println("한도 초과로 출금되지 않습니다.");
			return;
		}
		balance -= amount;
		System.out.printf("%,d원이 출금되었습니다.%n",amount);
	}
	//메서드 오버라이딩(재정의)
	@Override
	public void printAccount() {
		System.out.println("------------");
		System.out.println("(마이너스)계좌번호:"+number);
		System.out.println("비밀번호 : " +password);
		System.out.printf("계좌잔액 : %,d원%n",balance);
		System.out.printf("마이너스 한도 : %,d원%n", minusLimit);
		System.out.println("--------------");		
	}
}
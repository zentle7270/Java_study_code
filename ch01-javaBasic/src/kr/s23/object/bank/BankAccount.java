package kr.s23.object.bank;

public class BankAccount {
	//멤버 변수
	protected String number;
	protected String password;
	protected String name;
	protected long balance;
	//생성자  //number,password 등 데이터를 전달하려고 한다.
	public BankAccount(String number,String password, String name, long balance) {  
		this.number = number;
		this.password = password;
		this.name = name;
		this.balance = balance;
		System.out.println("계좌가 개설되었습니다.");//전달한 번호가 보여짐
	}
	//입금하기 
	public void deposit(long amount) {
		if(amount<=0) {
			System.out.println("0이하의 금액은 입금할 수 없습니다.");
			//특정 조건일 때 void형 메서드를 빠져나감 
			return; //return을 사용하면 밑의 2줄을 실행하지 않고 아예 함수를 빠져나간다
		}
		balance+=amount;
		System.out.println(amount+"원이 입금 되었습니다.");
	}
	//출금하기 
	public void withdraw(long amount) {  //return으로 인해 단일 if문 명시(복잡도 낮추기 위해)
		if (amount<=0) {  				//다중 if문 사용해도 된다. 
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
			return;
		}
		if(balance<amount) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance-=amount;
		System.out.println(amount+"원이 출금 되었습니다.");
	}
	public void printAccount() {  //통합적으로 출력해주기 때문에 get메서드를 생성하지 않음. 
		System.out.println("------------");
		System.out.println("(일반)계좌번호:"+number);
		System.out.println("비밀번호 : " +password);
		System.out.println("예금주 :"+name);
		System.out.printf("계좌잔액: %,d원%n", balance);
		System.out.println("------------");		
	}
}
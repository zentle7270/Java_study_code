package kr.s10.object.method;

class Worker{
	/*
	 * [실습]
	 * Worker
	 * 1) 멤버 변수 : 직원 이름(name), 급여(money), 계좌 잔고(balance)
	 * 2) 멤버 메서드 : work(실행하면 moeny에 1000원 누적)
	 * 			   deposite(실행하면 money의 돈을 balane에 누적시키고 
	 * 						money는 0으로 처리)
	 * WorkerMain의 main
	 * 1) Worker객체 생성
	 * 2) 직원의 이름 지정
	 * 3) 10번 일하는데 번 돈이 3000원일 때마다 계좌에 저축
	 * 4)직원 이름, 현재 계좌에 입금되지 않고 남아 있는 급여(money),
	 *   계좌 잔고(balance)를 출력하시오.
	 */
	String name;
	int money;      
	int balance;
	
	public void work() {
		money+=1000;
	}
	public void deposite(){
		balance+=money;
		money=0;
	}
}
public class WorkerMain {
	public static void main(String[] args) {
		Worker wk=new Worker();
		wk.name="김연습";
		//10번을 일함. 3000원 벌 때마다 저축. 
		for(int i=1;i<=10;i++) {  //i값을 사용하지 않는 case. 횟수만 사용
			wk.work();
			if(wk.money>=3000) {  //3000원 일때마다 저축           //>= 이 아니라 ==이어야 되는 거 아닌가?의문
								//worker.money%3000==0 도 가능	
				wk.deposite();
			}
		}
		System.out.println("직원 이름: "+wk.name);
		System.out.printf("현재 계좌에 입금되지 않고 남아 있는 급여:%,d원%n",wk.money);
		System.out.printf("계좌 잔고: %,d원%n",wk.balance);
	}

}

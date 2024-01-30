package kr.s15.object.constructor;
//3과목 처리할 때가 있고, 5과목 처리할 때가 있는 코드
class Student{
	//멤버 변수
	int korean;
	int english;
	int math;
	int history;
	int science;
	int num; //과목수
	
	//생성자 
	public Student(int k, int e, int m) {
		korean = k;
		english=e;
		math =m;
		num=3; //과목수 지정
	}
	public Student(int k, int e, int m, int h,int s) {
		korean = k;
		english=e;
		math =m;
		history=h;
		science=s;
		num=5; //과목수 지정
	}
	//총점 구하기
	
	public int getTotal() {
		int total;
		if(num ==3) {
			total=korean+english+math;
		}else {
			total= korean+english+math+history+science;
		}
		return total;
		
	}
	//평균 구하기
	public int getAverage() {
		return getTotal()/num;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Student st= new Student(90,97,95);
		
		System.out.println("총점 : " + st.getTotal());
		System.out.println("평균 : " + st.getAverage());
		System.out.println("---------------------");
		
		Student st2= new Student(88,82,84,87,90);
		
		System.out.println("총점 : "+ st2.getTotal());
		System.out.println("평균 : " + st2.getAverage());
	}
}



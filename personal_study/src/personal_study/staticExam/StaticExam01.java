package personal_study.staticExam;

class StaticExam02 {
	static int k = 1;
	public void printK() {
		System.out.println(k);
	}
	
	public void plus2AndPrintK() {
		this.printK();
		k += 2;
		System.out.println(k);
	}
	
}

public class StaticExam01 {
	static int j; // static은 전역 변수에만 사용 가능하다.
	public static void main(String[] args) {
		int j; // 지역 변수에는 사용할 수 없다.
		System.out.println(StaticExam02.k);
		
		// 인스턴스를 하나 만든다.
		StaticExam02 se1 = new StaticExam02();
		
		// 또다른 인스턴스를 하나 만든다.
		StaticExam02 se2 = new StaticExam02();
		
		// se1에서 plus2AndPrintK를 호출한다
		se1.plus2AndPrintK();
		
		// 각각의 인스턴스의 결과를 확인한다.
		se1.printK();
		se2.printK();
	}
}

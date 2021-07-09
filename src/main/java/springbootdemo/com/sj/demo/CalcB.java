package springbootdemo.com.sj.demo;

public class CalcB implements Calc {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("CalcB providing add logic");
	}

	@Override
	public int add(int x, int y) {
		System.out.println(" CalcB " +(x+y));
		return y;
		// TODO Auto-generated method stub
		
	}


}

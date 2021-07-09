package springbootdemo.com.sj.demo;

public class CalcA implements Calc {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("CalcA providing add logic");
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(" CalcA " + (x+y));;
		return y;
	}

}

package springbootdemo.com.sj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class User {
@Value("6")
int x;
@Value("9")
int y;
@Autowired
Calc calc;
public void invokeAdd() {
	calc.add(x,y);
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public Calc getCalc() {
	return calc;
}
public void setCalc(Calc calc) {
	this.calc = calc;
}

}

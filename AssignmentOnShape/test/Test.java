package com.test;
import com.shape.*;
public class Test {
	public static void main(String[] args) {
Square sq=new Square(25);
Rectangle rc=new Rectangle(10,20);
sq.calcArea();
sq.calcPeri();
rc.calcArea();
rc.calcPeri();
}
}
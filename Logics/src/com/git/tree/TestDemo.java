package com.git.tree;

public class TestDemo extends Test{
	int a=5,b=5;
	public int sum(){
		return a+b;
	}
public static void main(String[] args) {
	Test t1=new Test();
	System.out.println(t1.sum());
	TestDemo t=new TestDemo();
	System.out.println(t.sum());
	//Alert
	Test f=new TestDemo();
	System.out.println(((TestDemo)f).a);
	
	
}
}

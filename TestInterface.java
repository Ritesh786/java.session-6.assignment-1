package com.Ritesh.test;

import com.Ritesh.tools.*;

public class TestInterface {

	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		Interface3 dbj=new Interface3();
      System.out.println("Number is  " +obj.IntPar(6));
      System.out.println("And the square of number is " +dbj.IntPar(6));
	}

}

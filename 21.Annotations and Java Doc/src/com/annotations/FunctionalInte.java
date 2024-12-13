package com.annotations;

@FunctionalInterface
interface Function
{
	public void add();
}

public class FunctionalInte {

	public static void main(String[] args) {

		Function f=() ->System.out.println("Functional interfcae addition Operation");
		f.add();
	}

}

package com.annotations;

class My<T>
{
	@SafeVarargs
	private void show(T...arg)
	{
		for(T x:arg)
		{
			System.out.println(x);
		}
	}
}

public class SafeVar {

	public static void main(String[] args) {

		
	}

}

package com.brij.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println("Data = "+data);
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("welcome to git demo");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

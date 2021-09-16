package com.AWSlambda.awslambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class App implements RequestHandler<Object, Object>
{

	public Object handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		System.out.println("welcome to lambda function");
		return null;
	}
   /* public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
	
	
	
}

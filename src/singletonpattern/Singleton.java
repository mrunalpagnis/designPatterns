package singletonpattern;

import javax.management.RuntimeErrorException;

public class Singleton {
	private volatile static Object s;
	private Singleton()
	{
		if(s!=null) 
		{
			throw new RuntimeErrorException(null, "");
		}
	}
	public static Singleton getInstance(){
		if(s==null)
		{
			synchronized(Singleton.class) {			
			if(s==null)
				s = new Object();
			
			}
		}
		return (Singleton) s;
	}
}

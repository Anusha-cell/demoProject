package cm.singleton;

public class Teacher {
	
	private Teacher()
	{
		
	}
	
	
	
	
	private static Teacher t;
	public static Teacher getInstance()
	{
		if(t==null) t=new Teacher();
		return t;
		
	}

}

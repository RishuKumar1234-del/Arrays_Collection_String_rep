package strings;

public class InternMethodEx1 {

	public static void main(String[] args) {
		
		String s1= new String("Hello");
		s1=s1.concat("java");
		System.out.println(s1);
		
		StringBuffer buffer=new StringBuffer("Hello");
		buffer=buffer.append("python");
		System.out.println(buffer);
		
		char[] chars = {'k','r','s','h','n','a'}; // create an array of random characters
				String s3 = new String(chars);
				String s4 = s3.intern();
				System.out.println(s4);//krishna
				System.out.println(s3==s4);//true
		
				//System.out.println("the classloader name: "  +s3.getClass().);
				
				internMethodImplementation();

	}
	
	public static void internMethodImplementation() {
		String s1="yash";//pool
		String s2="yash";//pool
		String s3=new String("yash");//heap area
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));
		String s4=s3.intern();
		System.out.println(s1==s4);//now it will give true because s3 has been brought into pool by using intern method
		
		
		
	}

}

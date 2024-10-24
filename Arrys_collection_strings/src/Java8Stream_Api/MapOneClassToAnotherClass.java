package Java8Stream_Api;

public class MapOneClassToAnotherClass {

	public static void main(String[] args) {
		MapOneClassToAnotherClass.Sum.a=10;
		MapOneClassToAnotherClass.Sum.b=20;
		MapOneClassToAnotherClass.Sum.c=MapOneClassToAnotherClass.Sum.doSum(MapOneClassToAnotherClass.Sum.a, MapOneClassToAnotherClass.Sum.b, 40);
		System.out.println(MapOneClassToAnotherClass.Sum.c);
		

	}
	//nested class
	static class Sum{
	   static	int a,b,c;
		public static int doSum(int n1,int n2,int n3){
			n3=n1+n2+n3;
			
			return n3;
		}
	}

}

package Java8Stream_Api;

import java.util.ArrayList;
import java.util.List;

public class Studentttttttt {
	String name;
	Long phoneNum;
	String email;
	
	

	public Studentttttttt(String name, Long phoneNum, String email) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}



	public static void main(String[] args) {
		
		List<Studentttttttt> list=new ArrayList<Studentttttttt>();
		list.add(new Studentttttttt("risi", 962345203l, "risi321@gmail.com"));
		list.add(new Studentttttttt("govind", 8543267l, "govind321@gmail.com"));
		list.add(new Studentttttttt("risi", 962345208l, "risikhandu321@gmail.com"));
		list.add(new Studentttttttt("priti", 78654321l, "prit654@gmail.com"));
		list.add(new Studentttttttt("ranjeet", 9386339514l, "raju1234@gmail.com"));
		list.add(new Studentttttttt("suri", 862345203l, "suri@gmail.com"));
		
		System.out.println("following is the only name from list");
		fetchOnlyName(list);
		System.out.println("\n\nfollowing is the only phone number from list");
		fetchOnlyPhoneNum(list);
		System.out.println("\n\nfollowing is the only email from list");
		fetchOnlyEmail(list);
		

	}
	public static void fetchOnlyPhoneNum(List<Studentttttttt> npe) {
		npe.stream().map(e->e.phoneNum).forEach(t->{
			System.out.print(t + " ");
		});
	}
	
	public static void fetchOnlyName(List<Studentttttttt> npe) {
		npe.stream().map(e->e.name).forEach(t->{
			System.out.print(t + " ");
		});
	}
	
	public static void fetchOnlyEmail(List<Studentttttttt> npe) {
		npe.stream().map(e->e.email).forEach(t->{
			System.out.print(t + " ");
		});
	}

}

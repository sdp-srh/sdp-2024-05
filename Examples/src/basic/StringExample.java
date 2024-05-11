package basic;

public class StringExample {

	public static void main(String[] args) {
		
		char[] ch={'s','d','p','s','r','h'};
		String s1 = new String(ch);
		System.out.println(s1);
		
		String s2= "sdpsrh";
		System.out.println(s2);

		
		String s3 = "sdp2022";
		String s4 = s3.replace("22", "23");
		System.out.println(s4);
		
		
		String s = "Sachin";
		s.concat(" Tendulkar");
		System.out.println(s);
		
		String sconcat = s.concat(" Tendulkar");
		System.out.println(sconcat);
	}
	
	
}

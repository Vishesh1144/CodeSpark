import java.util.*;

class Password {
	public static void main(String args[]){
		int upper=0,lower=0,digit=0,sc=0;
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter Password");
		String s=scc.next();

		if(s.length()<8){
			System.out.println("Passwprd is Invalid ");
		}
		else{

			for(int i=0; i<s.length(); i++){
				char ch=s.charAt(i);
				if(ch>='A' && ch<='Z')
					upper=1;
				if(ch>='a' && ch<='z')
					lower=1;
				if(ch>='0' && ch<='9')
					digit=1;
				if(ch=='$' || ch=='#' || ch=='%')
					sc=1;
			}
		if(upper==1 && lower==1 && digit==1 && sc==1)
			System.out.println("Passworld is Valid");
		else
			System.out.println("Passwprd is Invalid ");

		}
	}
}
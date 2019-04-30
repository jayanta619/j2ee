package Lembda;

import java.util.function.Predicate;

public class Check {

	public static void main(String[] args) {


		Printable p=new Printable() {

			@Override
			public void  print(int x) {
		
				
			}
//		public void print() {
//			System.out.println("print");
//		}
//		};
//p.print();
//	
//
//Printable p1=()-> System.out.println("Lprint");
//p1.print();
//	
// Predicate <String> predicate=new Predicate <String>() {
// public boolean test(String t) {
//	 if(t.length()>5)
//		 return true;
// 
// return false;
//		 }
// 
// 
// };
// Passwordchecker p2=new  Passwordchecker() ;
//
//	 p2.check("jam",predicate);
//	 
//	 
//	 Predicate <String> pc= t-> {return(t.length()>5) ? true:false;};
//	 
//	 p2.check("greater",pc);
//	 
		};
	 Square s= new Square();
		 
	s.print(5);
		
	 Printable p2=x-> System.out.println(x*x);
s.print(9);
 }
}




















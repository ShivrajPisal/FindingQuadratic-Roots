public class quadraticroots {
    public static void main(String[] args) {
		// Implement your code here 
		double x=0,a=1,b=4,c=4,d=((b*b)-4*a*c);
		System.out.print(d);
		if(d==0){
		    x=-b/(2*a);
		    System.out.println("The root is"+x);
		}
		else if(d>0){
		    x=(-b-(b*b-4*a*c))/(2*a);
		    System.out.println("The 1st root is"+x);
		     x=(-b+(b*b-4*a*c))/(2*a);
		     System.out.println("The 2nd root is"+x);
		}
		else if(d<0){
		    System.out.println("The equation has no real roots");
		}
	}
}

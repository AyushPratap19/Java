import java.util.Scanner; //scanner class in take input from user
public class hello {    //class
    public static void main(String[] args)  //function
    {
        Scanner sc=new Scanner(System.in); 
        //system.in is used to take input from keyboard
         System.out.println("enter the marks of 5 subject to calculate percentage");
         float a=sc.nextFloat();
         float b=sc.nextFloat();
         float c=sc.nextFloat();
         float d=sc.nextFloat();
         float e=sc.nextFloat();
         sc.nextLine(); 
         //if we dont write this ,when we press enter after entering the marks, name will take that enter as input
         System.out.println("enter the name of the student");
         String name=sc.nextLine();
         float sum=a+b+c+d+e;
         float percentage=sum/500; 
          //if all variables(a to e) are int , and we take percent as float,still it won't work.
         //to make it work without changes datatype of all the inputs(a to e), we can write percent=sum/500.0f;
        
         System.out.println("hello "+name+" your percentage is "+percentage*100+"%");

         sc.close();//to close the scanner to remove warning
    }
    
}

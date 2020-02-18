import java.util.Scanner;

public class IFElse {
  static   public void agecheck()

    {
        System.out.println( "enter thee agae ");

        Scanner ob=new Scanner(System.in);
        int a= ob.nextInt();
        if(a>=18)
        {
            System.out.println("adult ......");
            return;
        }
        if(a<18)
        {
            System.out.println( " not adult ......");

        }

        System.out.println( " yiur nprogram is success...........");
    }

    public static void main(String[] args) {
       // IFElse obj= new IFElse();
IFElse.agecheck();

    }
}

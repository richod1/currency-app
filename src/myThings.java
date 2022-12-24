import java.util.Scanner;

public class myThings extends myHouse{
    public void myHouseColor(){
        String location="lagos town";
        System.out.println("My house is painted blue in color " +location);

    }
    static  void Money(){
        Scanner input=new Scanner(System.in);
        System.out.print("Pls input your country to get your country currency code ");

        String country=input.next();

        switch (country){
            case "Ghana":System.out.println("Your country currency code is Gh/cedis");
            break;
            case "Nigeria":System.out.println("Your country currency code is NGN");
                break;
            case "USA":System.out.println("Your country currency code is $/dollor");
                break;
            case "Mexico":System.out.println("Your country currency code is Pesso");
                break;
            case "United Kindom":System.out.println("Your country currency code is Pounds/#");
                break;
            case "Togo":System.out.println("Your country currency code is Cefa");
                break;
            default:
                System.out.println("Pls input a country Name");
        }

    }
}

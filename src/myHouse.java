import java.util.Currency;

public class myHouse {
    String streetName="Keta Street";
    public static void main(String[] args){
        myThings myobj=new myThings();
        myobj.myHouseColor();
        Name();
        myThings.Money();

        myHouse obj=new myHouse();
        System.out.println(obj.streetName);



    }
    static  void Name(){
        String fname="Degraft";
        String lname="Frimpong";
        String FullName=fname+lname;
        System.out.println("My name is " + FullName + " my first name is " +fname + " and my last name is " +lname);
    }
}

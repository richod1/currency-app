public class Scool {
    public double Grade=3.5;
    public void study(){
        System.out.println("i study all day");
    }
    public static void main(String[] args){
        Scool myobj=new Scool();
        System.out.println("my grade is "+myobj.Grade);

        myobj.study();

    }
}

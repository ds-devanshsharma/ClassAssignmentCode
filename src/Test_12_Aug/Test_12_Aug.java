package Test_12_Aug;
class Shape{

}
class Circle extends  Shape{

}
class Case1{
    public  static void case1(){
        String string = null;
        try{
            System.out.println("now inside Nested try  ");
            try{
                System.out.println(string.length());
            }finally{
                System.out.println("Enter valid String ");

            }
            Circle circle = (Circle) new Shape();


        }catch(NullPointerException e){
            System.out.println("Exception Handled !!" );
        }
    }
}
class Case2{
    public  static void case2(){
        String string = null;
        try{
            System.out.println("now inside Nested try  ");
            try{
                System.out.println(string.length());
            }
            catch (NullPointerException e){
                System.out.println("Exception Handled !!" );
            }
            finally{
                System.out.println("Enter valid String ");
            }
           Circle circle = (Circle) new Shape();


        }catch(NullPointerException e){
            System.out.println("Exception Handled !!" );
        }catch (ClassCastException e){
            System.out.println("CCE handled !!");
        }
    }
}
public class Test_12_Aug {

    public static void main(String[] args) {
        Case2.case2();
        System.out.println("************************");
        Case1.case1();

    }
}

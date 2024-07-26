import java.util.ArrayList;
import java.util.List;

public class Square extends Shape{
    double side;
    double area(){
        return side*side;
    }

    char decision='Y';
    //Yes
    char  d[]=new char[] {'Y', 'E', 'S'};
    String arryStrings[]= {"Rama", "Krishna", "Rakesh"};
     String s="Yes"; //-> memory location 2567852


    public  void testLogic(){
        System.out.println("Concatenated String "+ s);
        for(int i=0; i<arryStrings.length; i++){
            if(arryStrings[i].startsWith("R")){
            System.out.println("Name starts with R "+ arryStrings[i]);
            }
        }
        System.out.println(s.toUpperCase());
    }

   /* List -> interface
   * Implementations -> ArrayList, LinkedList
   * */
    List<String> stringList= new ArrayList<>();
    List<Integer> intList=new ArrayList<>();

    public void listMethodEx(){
        stringList.add("one");
        stringList.add("two");

    }





}

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        AdvanceCal adCal= new AdvanceCal();
        ConstructorEx con= new ConstructorEx(6,2);
        System.out.println(con.add());
        System.out.println(con.multiple());
        System.out.println(adCal.powerInt(10,2));
        System.out.println(adCal.squareRoot(9));
        System.out.println(adCal.division(5,5));
        System.out.println(adCal.addition(89,89));
        System.out.println(adCal.subtraction(45,89));
        int result= cal.calculator(1,2);
        System.out.println("Hello world!" + result);
        int resultupdated = cal.calculator(56,90,-87);
        System.out.println("Hello world!"+resultupdated);
        int marksupdated = cal.calculator(89,9,100,90);
        System.out.println(+marksupdated);

        StaticEx ex=new StaticEx();
        StaticEx.print();

        int[] arrayInt= new int[10];
        for(int i=0;i<10;i++){
            //logic
            arrayInt[i]=i;
            System.out.println("Array value" + arrayInt[i]);
        }

        Square s=new Square();
        s.testLogic();

    }
}
public class ConstructorEx {
    int num1;
    int num2;

    ConstructorEx(int x, int y){
        num1=x;
        num2=y;
    }

    public int add(){
        return num1+num2;
    }
    public int multiple(){
        return num1*num2;
    }
    public int calculator(int x, int y, int z, int i){
        return x*y+z+i;
    }
}

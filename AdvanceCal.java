public class AdvanceCal extends Calculator{

    public double powerInt(double x, double y){
        return Math.pow(x,y);

    }
    public double squareRoot(double x){
        return Math.sqrt(x);
    }
    public double division(long x , long y){
        return Math.divideExact(x,y);
    }
    public double addition (int x, int y){
        return Math.addExact(x,y);
    }
    public double subtraction(int x, int y){
        return Math.subtractExact(x,y);
    }

    public int calculator(int x, int y, int z, int i){
        return x+y+z-i;
    }
    public double subtraction(int x, int y, int z){
        return Math.subtractExact(x,y);
    }



}

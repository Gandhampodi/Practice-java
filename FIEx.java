public interface FIEx {

    public void print();

    //java8 default method
    default void print1(){
        System.out.println("Printing default"); // only one abstract method  will be the declare
    }
}

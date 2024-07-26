public class Array {
    public static void main(String agr[]) {
        String car_Names[] = {"BMW", "HONDA", "NISSAN"};
        int unsortedArray[] = {20, 10, 5, 23};
        int temp=0;

        for (int i = 0; i<unsortedArray.length-1 ; i++) {
            for(int j=i+1; j<unsortedArray.length-1; j++){
                if(unsortedArray[i] > unsortedArray[j]){
                    temp=unsortedArray[i];
                    unsortedArray[i]=unsortedArray[j];
                    unsortedArray[j]=temp;
                }

            }

        }

        for(int i=0; i<unsortedArray.length; i++){
            System.out.println("sorted array " + unsortedArray[i]);
        }
    }

}

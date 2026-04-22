public class BubbleStringSort {
    public static void main(String[] args) {
        String[] array = {"Rehan","Shashank","Om","Alok"};
        System.out.println("Original String Array");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        String temp;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array.length-1; j++){
                if (array[j].compareTo(array[j+1])> 0){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted String Array");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}

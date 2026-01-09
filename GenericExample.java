public class GenericExample {
    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        String[] strArray = {"Java","Kotlin","Spring"};
        printArray(intArray);//works with integer type
        printArray(strArray);//works with String type
    }
}

public class GenericDeclar {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(100);
        Box<String> strBox = new Box<>("Hello Java");

        System.out.println("Integer Box: " + intBox.value);
        System.out.println("String Box: " + strBox.value);

    }
}

class Box<T>{
    T value;
    Box(T value){
        this.value = value;
    }
}

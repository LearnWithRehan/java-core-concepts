class Box<T>{
    private T value;
    void set(T value){
        this.value = value;
    }
    T get(){
        return value;
    }
}

public class GenericDeclar {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());
        Box<String > strBox = new Box<>();
        strBox.set("LearnWithRehan");
        System.out.println(strBox.get());
    }
}

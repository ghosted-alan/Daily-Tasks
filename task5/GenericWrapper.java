package task5;

class Box<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericWrapper {
    public static void main(String[] args) {
        
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(45.67);

        int intValue = intBox.getValue();
        double doubleValue = doubleBox.getValue();

        System.out.println("Integer value in box: " + intValue);
        System.out.println("Double value in box: " + doubleValue);
    }
}


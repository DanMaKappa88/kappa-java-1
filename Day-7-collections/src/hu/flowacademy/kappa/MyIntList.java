package hu.flowacademy.kappa;

public class MyIntList {

    private int[] arr;
    private int pos;

    public MyIntList (int... numbers) {  // A paraméterek tömbbe kerülnek
        arr = new int[numbers.length];
        pos = 0;
        for(int i = 0; i < numbers.length; i++) {
            arr[pos++] = numbers[i];
        }
    }

    public void add (int num) {
        if(pos >= arr.length - 1) {
            int[] arr2 = new int[arr.length + 1];
            for(int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[pos++] = num;
    }

    /**
     * This method filters the elements of list
     * @param f lambda
     * @return List of correct elements
     */
    public MyIntList filter (Feltetel f) {
        MyIntList out = new MyIntList();
        for (int num : arr) {
            if (f.vizsgal(num)) {
                out.add(num);
            }
        }
        return out;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Lista elemei: ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        return sb.toString();
    }
}

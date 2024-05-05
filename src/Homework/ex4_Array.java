package Homework;

public class ex4_Array {
    //Arrays
    //We need to find the pattern according to which this or that numerical sequence is formed.
    //Write a function that forms the first 10 elements of a given sequence as an integer array and displays the array elements on the screen.
    //
    //Sequence:
    //1, -2,  3,  -4,   5,  -6...
    public static void main(String[] args) {
        int[] sequence = generateSequence();
        displaySequence(sequence);
    }

    public static int[] generateSequence() {
        int[] sequence = new int[10];
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 == 0) {
                sequence[i] = -(i + 1);
            } else {
                sequence[i] = i + 1;
            }
        }
        return sequence;
    }

    public static void displaySequence(int[] sequence) {
        System.out.print("Sequence: ");
        for (int i = 0; i < sequence.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(sequence[i]);
        }
    }
}

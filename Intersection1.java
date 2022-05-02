public class Intersection1 {

    public static void main(String[] args) {


        // creating two arrays
        int A1[] = {1, 2, 3, 4, 5, 6};
        int A2[] = {5, 6, 7, 8, 9, 10};
        //using two loops for comparing both arrays
        for (int i = 0; i < A1.length; i++) {
            for (int j = 0; j < A2.length; j++) {
                if (A1[i] == A2[j]) {
                    System.out.print("intersection of two arrays: ");
                    System.out.println(A2[j]);

                }
            }
        }
    }
}
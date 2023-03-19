public class App {

    public static int findLargestElement(int[] arr) {
        // System.out.println(arr[0]);
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findindexofLargestElement(int[] arr) {
        // System.out.println(arr[0]);
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    public static int findsecondLargestElement(int[] arr) {
        // System.out.println(arr[0]);
        int max = 0;
        int sl = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sl = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > sl) {
                sl = arr[i];
            }
        }

        return sl;
    }

    public static boolean checkarrayissorted(int[] arr) {
        // System.out.println(arr[0]);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] intArray = new int[] { 100, 20, 200 };

        System.out.println(findLargestElement(intArray));
        System.out.println(findindexofLargestElement(intArray));
        System.out.println(findsecondLargestElement(intArray));
        System.out.println(checkarrayissorted(intArray));

    }
}

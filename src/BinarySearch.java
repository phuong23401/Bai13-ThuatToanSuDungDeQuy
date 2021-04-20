public class BinarySearch {
    public static int binarySearch(int []arr, int low, int high, int x) {
        int mid = (low + high) / 2;

        if (x == mid) {
            return mid;
        } else if (x < mid) {
            binarySearch(arr, low, mid - 1, x);
        } else if ((x > mid)) {
            binarySearch(arr, mid + 1, high, x);
        } else {
            System.out.println("Not found");
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {2, 3, 4, 10, 40};
        int x = 10;
        int low = 0;
        int high = arr.length;
        int result = binarySearch(arr, low, high, x);
        System.out.println(result);
    }
}

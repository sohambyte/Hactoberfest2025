public class SecondLargestFinder {
    public int findSecondLargest(int[] array) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
}

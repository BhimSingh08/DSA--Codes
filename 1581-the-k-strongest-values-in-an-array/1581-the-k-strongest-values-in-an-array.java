class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int m = arr[(arr.length - 1) / 2];
        int[] ans = new int[k];
        int left = 0, right = arr.length - 1;
        int index = 0;

        while (index < k) {
            if (m - arr[left] > arr[right] - m) {
                ans[index++] = arr[left++];
            } else {
                ans[index++] = arr[right--];
            }
        }

        return ans;
    }
}


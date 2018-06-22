class Solution {
    public int hIndex(int[] citations) {
        int length = citations.length;
        int left = 0, right = length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] == length - mid) {
                return length - mid;
            } else if (citations[mid] < length - mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return length - left;
    }
}

/*
binary search 
*/

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<Integer>(), k, 1, n);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> comb, int k, int start, int n) {
        if (comb.size() == k && n == 0) {
            List<Integer> list = new ArrayList<Integer>(comb);
            ans.add(list);
            return;
        }

        for (int i = start; i <= 9; i++) {
            comb.add(i);
            backtrack(ans, comb, k, i + 1, n - i);
            comb.remove(comb.size() - 1);
        }
    }
}

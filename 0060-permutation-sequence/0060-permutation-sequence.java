class Solution {
    public String getPermutation(int n, int k) {
        
        List<Integer> numbers = new ArrayList<>();
        int[] fact = new int[n];
        
       
        int f = 1;
        fact[0] = 1;
        for (int i = 1; i < n; i++) {
            f *= i;
            fact[i] = f;
            numbers.add(i);
        }
        numbers.add(n);
       
        k = k - 1;

        StringBuilder result = new StringBuilder();

       
        for (int i = n; i >= 1; i--) {
           
            int index = k / fact[i - 1];

           
            result.append(numbers.get(index));
            numbers.remove(index);


            k = k % fact[i - 1];
        }

        return result.toString();
        
    }
}
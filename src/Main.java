import MaximumNumberOfStringPairs.Solution;

public class Main {
    public static void main(String[] args) {
        String [] words = {"cd","ac","dc","ca","zz"};
        Solution solution = new Solution();
        int result = solution.maximumNumberOfStringPairs(words);
        System.out.println(result);
    }

}
public class IntegerToEnglishWords {
    String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] belowHundred = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num).trim();
    }

    private String helper(int num) {
        if (num < 10) return belowTen[num];
        else if (num < 20) return belowTwenty[num - 10];
        else if (num < 100)
            return belowHundred[num / 10] + (num % 10 != 0 ? " " + helper(num % 10) : "");
        else if (num < 1000)
            return helper(num / 100) + " Hundred" + (num % 100 != 0 ? " " + helper(num % 100) : "");
        else if (num < 1_000_000)
            return helper(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + helper(num % 1000) : "");
        else if (num < 1_000_000_000)
            return helper(num / 1_000_000) + " Million" + (num % 1_000_000 != 0 ? " " + helper(num % 1_000_000) : "");
        else
            return helper(num / 1_000_000_000) + " Billion" + (num % 1_000_000_000 != 0 ? " " + helper(num % 1_000_000_000) : "");
    }
}

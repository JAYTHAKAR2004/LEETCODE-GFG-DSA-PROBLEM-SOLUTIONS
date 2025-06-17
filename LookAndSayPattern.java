public class LookAndSayPattern {
    public String countAndSay(int n) {
        // code here

        if (n <= 0) return "";

        String result = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder current = new StringBuilder();
            int count = 1;
            char prevChar = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                char currentChar = result.charAt(j);
                if (currentChar == prevChar) {
                    count++;
                } else {
                    current.append(count).append(prevChar);
                    count = 1;
                    prevChar = currentChar;
                }
            }

            current.append(count).append(prevChar);
            result = current.toString();
        }

        return result;
    }
    public static void main(String[] args) {

    }
}

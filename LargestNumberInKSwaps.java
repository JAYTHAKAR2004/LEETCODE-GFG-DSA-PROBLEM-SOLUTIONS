public class LargestNumberInKSwaps {
    String max="";
    public String findMaximumNum(String s, int k) {
        max=s;
        findmax(s.toCharArray(),k,0);
        return max;


    }
    private void findmax(char ch[],int k,int index){
        if (k == 0) {

            return;
        }
        int n= ch.length;
        int maxchar=ch[index];
        for (int i = index + 1; i < n; i++) {
            if (ch[i] > maxchar) {
                maxchar = ch[i];
            }
        }

        // If max digit is not the current digit, we will swap
        if (maxchar != ch[index]) k--;

        for (int i = n - 1; i >= index; i--) {
            if (ch[i] == maxchar) {
                swap(ch, index, i);
                String newStr = new String(ch);
                if (newStr.compareTo(max) > 0) {
                    max = newStr;
                }

                findmax(ch, k, index + 1);

                // backtrack
                swap(ch, index, i);
            }
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    }


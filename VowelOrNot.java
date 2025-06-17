public class VowelOrNot {
    public static String isVowel(char c){
       c=Character.toLowerCase(c);
       if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
           return c+ " is vowel";
       }
       return c+ " is consonant";

    }
    public static void main(String[] args) {
        System.out.println(isVowel('a'));
    }
}

//1 .  
public static String reverseWords(String s) {
    String[] words = s.split(" ");
    int left = 0, right = words.length - 1;
    while (left < right) {
        String temp = words[left];
        words[left] = words[right];
        words[right] = temp;
        left++;
        right--;
    }
    return String.join(" ", words);
}
//2. return the nuber of times a target character appears in a string.
public static int countChar(String s, char target) {
    int count = 0;
    for ( char c : s.toCharArray()) {
        if (c == target) {
            count++;
        }
    }
    return count;
}
//access modifier, return type, method name, parameters and method body. method signature is static- no other object needed to call it- takes a string and returns it. int count is initialized at 0 . toCharArray breaks the strings into an array of characters. the for each loop visits each character and each time it matches the target, the counter goes up by 1. loop is done, string and target is passed by the user.

//3. write a method that determines if the passed string is a palindrome or not

public boolean isPalindrome(String s) { // access modifier, return type, method name and passed parameter. 
    int left = 0;
    int right= s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
        }
        return true;
    }



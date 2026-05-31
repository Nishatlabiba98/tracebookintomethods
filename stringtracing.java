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
    int left = 0;//pointer  starts at the first character index
    int right= s.length() - 1;//pointer at last character, minus cuz indexes are 0 based- a 7 character string's last index is 6 get it?
    while (left < right) {// it keeps looing as long as the left pointer is not crossing the right one, once they meet in the middle, it is done. every pair matched. 

        if (s.charAt(left) != s.charAt(right)) { //charAt grabs the character at that index. this checks do the characters do not match -
            return false; //returns false and does not go further
        }
        left++;
        right--; // if it matches the pointer moves inward
        }
        return true; //every pair matched is a palindrome so it will return true. 
    }
//4. given two strings, how would yu figure ou t if they are anagrams of each other?

public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false; // if the len is different then the function will stop here
    }
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();
    Arrays.sort(sArray);// sorts the array alphabetically 
    Arrays.sort(tArray);// sorts the array alphabetically
    return Arrays.equals(sArray, tArray);
}


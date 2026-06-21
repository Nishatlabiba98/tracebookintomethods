#1 write a method that determines of a string i spalindrome or not in python 
def is_palindrome(s :str) -> bool:
    left = 0
    right = len(s) - 1
    while left < right :
        if s[left] != s[right] :
            return False
        left += 1
        right -= 1
        return True
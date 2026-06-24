class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: sirf letters aur numbers rakho, sab lowercase karo
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Step 2: do pointers - ek aage, ek peeche
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;  // match nahi hua
            }
            left++;
            right--;
        }
        
        return true;  // palindrome hai!
    }
}
        
    
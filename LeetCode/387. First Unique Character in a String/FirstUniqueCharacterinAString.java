/**********
 * Solution of 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * @author: Chong Wang
 * Date: 2/12/17, 23:28
 */
 
 
 class Solution {
    public int firstUniqChar(String s) {
        int[] letters = new int[26];
        for(int i=0; i<s.length(); i++){
            letters[s.charAt(i)-'a'] ++;
        }
        for(int i=0; i<s.length(); i++){
            if(letters[s.charAt(i)-'a'] == 1) return i;
        }
        return -1;
    }
}
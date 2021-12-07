// 1859. Sorting the Sentence -Leetcode
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res_string = new String[words.length];
        for(String word: words){
            int length = word.length()-1;
            res_string[word.charAt(length)-'1'] = word.substring(0,length);
        }
         return String.join(" ", res_string);
    }
}
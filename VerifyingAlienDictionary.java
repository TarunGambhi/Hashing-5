//https://leetcode.com/problems/verifying-an-alien-dictionary
//TC : O(n)
//SC : O(n)
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++){
            char c = order.charAt(i);
            map.put(c,i);
        }
        //System.out.println(map);
        boolean flag = false;
        for(int i=0;i<words.length-1;i++){
            flag = false;
            String word1 = words[i];
            String word2 = words[i+1];
            for(int j=0; j<word1.length() && j<word2.length(); j++){
                char char1 = word1.charAt(j);
                char char2 = word2.charAt(j);
                if(char1!=char2){
                    if(map.get(char1) > map.get(char2)){
                        return false;
                    }
                    else{
                        flag = true;
                        break;
                    } 
                }
            }
            System.out.println(flag);
            if(!flag){
                if(word1.length() > word2.length())
                    return false;
                else
                    flag = true;
            }
            
        }
        return flag;
    }
}

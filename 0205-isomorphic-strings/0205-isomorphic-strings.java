class Solution {
    public boolean isIsomorphic(String s, String t) {
     if(s.length() != t.length()) return false;
        
        //2 hashMap Solution
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            //sMap
            if(sMap.containsKey(sChar)){
                // if present
                if(sMap.get(sChar) != tChar)
                    return false;
            } else {
                // not present , insert 
                sMap.put(sChar, tChar);
            }
            
            //tMap
            if(tMap.containsKey(tChar)){
                // if present
                if(tMap.get(tChar) != sChar)
                    return false;
            } else {
                // not present , insert 
                tMap.put(tChar, sChar);
            }
            
        }
        return true;
    }
}
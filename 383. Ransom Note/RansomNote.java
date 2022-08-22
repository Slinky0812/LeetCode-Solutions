class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mLetters = new HashMap<>();
        
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            
            int currentCount = mLetters.getOrDefault(m, 0);
            
            mLetters.put(m, currentCount + 1);
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            
            int currentCount = mLetters.getOrDefault(r, 0);
            
            if (currentCount == 0) {
                return false;
            } else {
                mLetters.put(r, currentCount - 1);
            }
        }
        
        return true;
    }
}
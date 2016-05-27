public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] value = str.split(" ");
		char[] key = new char[pattern.length()];
		for(int i = 0;i < pattern.length();i++){
			key[i] = pattern.charAt(i);
		}
		if (key.length != value.length) {
			return false;
		}
		
		Set<Character> s1 = new HashSet<Character>();
		Set<String> s2 = new HashSet<String>();
		
		for(int i = 0;i < key.length;i++){
			s1.add(key[i]);
			s2.add(value[i]);
			if(s1.size() != s2.size()){
				return false;
			}
		}
		return true;
    }
}
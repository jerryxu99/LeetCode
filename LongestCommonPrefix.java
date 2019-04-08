public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < Math.min(strs[i].length(), prefix.length()); j++) {
                if (strs[i].charAt(j) != prefix.charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
            if (prefix.length() > Math.min(strs[i].length(), prefix.length()))
                prefix = prefix.substring(0, Math.min(strs[i].length(), prefix.length()));
        }
        return prefix;
    }
}

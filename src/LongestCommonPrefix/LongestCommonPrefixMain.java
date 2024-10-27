package LongestCommonPrefix;

public class LongestCommonPrefixMain {
    public static void main(String[] args) {
        System.out.println("-" + longestCommonPrefix(new String[]{"flower","flow","flight"}) + "-");
        System.out.println("------------------");
        System.out.println("-" + longestCommonPrefix(new String[]{"cir", "car"}) + "-");
        System.out.println("------------------");
        System.out.println("-" + longestCommonPrefix(new String[]{"dogg", "doggo", "dog"}) + "-");
        System.out.println("------------------");
        System.out.println("-" + longestCommonPrefix(new String[]{"ab", "a"}) + "-");
        System.out.println("------------------");
        System.out.println("-" + longestCommonPrefix(new String[]{"a", "ab"}) + "-");
        System.out.println("------------------");
        System.out.println("-" + longestCommonPrefix(new String[]{"reflower","flow","flight"}) + "-");
        System.out.println("------------------");
    }

    public static String longestCommonPrefix (String[]strs){
        String prefix = "";
        int shortestIndex = 0;

        if(strs.length == 1) {
            prefix = strs[shortestIndex];
            return prefix;
        }

        for (int i = 0; i < strs.length - 1; i++) {
            if(strs[shortestIndex].length() > strs[i + 1].length()) {
                shortestIndex = i + 1;
            }
        }

        for (int i = strs[shortestIndex].length(); i >= 0; i--) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].startsWith(strs[shortestIndex]) && j != shortestIndex) {
                    prefix = strs[shortestIndex];
                } else if (strs[j].startsWith(strs[shortestIndex]) && j == shortestIndex) {
                    continue;
                } else {
                    prefix = "";
                    break;
                }
            }

            if (!prefix.isEmpty()){ //if prefix is not empty + counter checks if all Stings have the same beginning
                return prefix;
            }

            strs[shortestIndex] = strs[shortestIndex].substring(0,i);
            System.out.println(strs[shortestIndex]);
        }

        System.out.println(shortestIndex);
        System.out.println(prefix);
        return prefix;
    }
}

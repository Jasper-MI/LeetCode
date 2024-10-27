package IndexOfTheFirstOccurrence;

//Problem: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class IndexOfTheFirstOccurenceMain {
    public static void main(String[] args) {

        System.out.println(solution("sadbutsad", "sad"));
        System.out.println("----------------");
        System.out.println(solution("leetcode", "leeto"));
        System.out.println("----------------");
        System.out.println(solution("wowleetcode", "leet"));
        System.out.println("----------------");
    }

    public static int solution(String haystack, String needle) {

        if(!haystack.contains(needle)) {
            return -1;
        }

        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();

        for (int i = 0; i < haystackArray.length; i++) {

            if(haystackArray[i] == needleArray[0]) {
                for (int j = 0; j < needleArray.length; j++ ) {
                    if (haystackArray[i + j] != needleArray[j] ) {
                        break;
                    }

                    if(j == needleArray.length - 1) {
                        return i;
                    }
                }
            }

        }

        return 0;

    }


}

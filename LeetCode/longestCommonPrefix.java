package LeetCode;

public class longestCommonPrefix {

    public static String LongestCommonPrefix(String[] stars) {
        if (stars == null || stars.length == 0)
            return "";
        String prefix = stars[0];
        for (int i = 0; i < stars.length; i++) {
            while (stars[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String args[]) {
        String[] stars1 = { "flower", "fly", "flow" };
        System.out.println("the longest common prefix is :" + LongestCommonPrefix(stars1));
    }
}
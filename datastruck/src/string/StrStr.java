package string;

/*
给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。



示例 1：

输入：haystack = "sadbutsad", needle = "sad"
输出：0
解释："sad" 在下标 0 和 6 处匹配。
第一个匹配项的下标是 0 ，所以返回 0 。
示例 2：

输入：haystack = "leetcode", needle = "leeto"
输出：-1
解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
 */

public class StrStr {

    public static void main(String[] args) {
//        System.out.println(strStr("mississippi", "issipi"));
    }

//    public static int strStr(String haystack, String needle) {
//
//        if (haystack == null || needle == null) {
//            return -1;
//        }
//
//        for (int i = 0; i + needle.length() < haystack.length(); i++) {
//            int f = i;
//            for (int j = 0; j < needle.length(); j++) {
//
//                if (haystack.charAt(f) == needle.charAt(j)) {
//                    f++;
//                } else {
//                    break;
//                }
//            }
//            if (f - i == needle.length()) {
//                return i;
//            }
//        }
//        return -1;
//    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int[] next = new int[needle.length()];
        getNext(next, needle);

        int j = 0; // 匹配的字符串个数
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) j = next[j - 1];
            if (needle.charAt(j) == haystack.charAt(i)) j++;
            if (j == needle.length()) return i - needle.length() + 1;
        }
        return -1;

    }

    //生成前缀表/next数组 决定匹配不上时保留前几个能用的字符串
    private void getNext(int[] next, String s) {
        int j = 0; // 最长相等的前后缀长度
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(j) != s.charAt(i)) j = next[j - 1]; // 前后缀不相同了 向前回退
            if (s.charAt(j) == s.charAt(i)) j++; // 找到相同的前后缀
            next[i] = j;
        }
    }

}

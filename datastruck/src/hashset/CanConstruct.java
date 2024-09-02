package hashset;

import java.util.HashMap;
import java.util.Map;

/*
给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

如果可以，返回 true ；否则返回 false 。

magazine 中的每个字符只能在 ransomNote 中使用一次。



示例 1：

输入：ransomNote = "a", magazine = "b"
输出：false
示例 2：

输入：ransomNote = "aa", magazine = "ab"
输出：false
示例 3：

输入：ransomNote = "aa", magazine = "aab"
输出：true
 */

public class CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        // shortcut
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        // 定义一个哈希映射数组
        int[] record = new int[26];

        // 遍历
        for(char c : magazine.toCharArray()){
            record[c - 'a'] += 1;
        }

        for(char c : ransomNote.toCharArray()){
            record[c - 'a'] -= 1;
        }

        // 如果数组中存在负数，说明ransomNote字符串中存在magazine中没有的字符
        for(int i : record){
            if(i < 0){
                return false;
            }
        }

        return true;
    }

//    public boolean canConstruct(String ransomNote, String magazine) {
//        HashMap<String, Integer> map = new HashMap<>();
//        for (char c : magazine.toCharArray()) {
//            map.put(c + "", map.getOrDefault(c + "", 0) + 1);
//        }
//        for (char c : ransomNote.toCharArray()) {
//            if (!map.containsKey(c + "")) {
//                return false;
//            } else {
//                map.put(c + "", map.get(c + "") - 1);
//            }
//        }
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (entry.getValue() < 0){
//                System.out.println(entry.getKey() + " " + entry.getValue());
//                return false;
//            }
//        }
//        return true;
//    }

}

package FirstUniqueCharacterinaString387;

/**
 * 思路：
 * 1. 遍历字符串，使用长度为26的数组count，统计每个字母出现的次数
 * 2. 再次遍历字符串，找到第一个出现次数为1的字符，然后返回索引，如果找不到返回-1
 */
public class Brute_optimization {
    public int firstUniqChar(String s) {
        int[] count = new int[26];//计数

        //将字符串转化为数组再遍历，也可使用charAt遍历
        //使用c-'a'将字母转化为0~25
        char[] array = s.toCharArray();
        for (char c : array)
            count[c - 'a']++;

        //再次遍历array，只要找到出现次数为1的字符，立即返回索引
        for (int i = 0; i < s.length(); i++)
            if (count[array[i] - 'a'] == 1)
                return i;

        //如果找不到返回-1
        return -1;
    }

}

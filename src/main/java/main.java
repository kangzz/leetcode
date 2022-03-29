import leetcode.*;
import util.PrintUtil;

public class main {
    public static void main(String[] args) {
        PrintUtil.printResult("两数相加", AddTwoNumbers.start());
        PrintUtil.printResult("旋转字符串", RotateString.rotateString("asdfg","sdfga"));
        PrintUtil.printResult("电话号码的字母组合", LetterCombinations.letterCombinations("23"));
        PrintUtil.printResult("比较APP版本号", CompareVersion.compareVersion("1.0.1","1"));
        PrintUtil.printResult("无重复字符的最长子串", LengthOfLongestSubstring.lengthOfLongestSubstring("134535"));
    }
}

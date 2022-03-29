package leetcode;

/**
 * 旋转字符串
 * https://leetcode-cn.com/problems/rotate-string/
 */
public class RotateString {

    public static boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        if(s.length() != goal.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(sb.indexOf(goal) > -1){
                return true;
            }
        }
        return false;
    }
}

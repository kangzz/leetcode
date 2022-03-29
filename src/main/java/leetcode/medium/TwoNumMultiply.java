package leetcode.medium;

/**
 * 字符串相乘
 * https://leetcode-cn.com/problems/multiply-strings/
 */

public class TwoNumMultiply {
    public static String multiply1(String n1, String n2) {
        int m = n1.length(),n = n2.length();
        int[] res = new int[m+n];
        for (int i = m-1; i>=0; i--) {
            for (int j = n-1; j >=0; j--) {
                int a = n1.charAt(i) - '0';
                int b = n2.charAt(j) - '0';
                int r = a * b;
                r = r + res[i+j+1];
                res[i+j+1] = r % 10;
                res[i+j] = res[i+j] + r /10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            //sb.length() == 0 关键在处理前置都是0的场景，不能缺失是因为 50012这类的0不能忽略
            if(sb.length() == 0 && res[i] == 0){
                continue;
            }
            sb.append(res[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static String multiply(String n1, String n2) {
        int n = n1.length(), m = n2.length();
        int[] res = new int[n + m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int a = n1.charAt(i) - '0';
                int b = n2.charAt(j) - '0';
                int r = a * b;
                r += res[i + j + 1];
                res[i + j + 1] = r % 10;
                res[i + j] += r / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n + m; i++) {
            if (sb.length() == 0 && res[i] == 0) continue;
            sb.append(res[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}

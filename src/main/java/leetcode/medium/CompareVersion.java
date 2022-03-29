package leetcode.medium;

/**
 * 比较版本号
 * https://leetcode-cn.com/problems/compare-version-numbers/
 */
public class CompareVersion {
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int v1l = v1.length;
        int v2l = v2.length;
        int v1i = 0;
        int v2i = 0;
        int result = 0;
        while (v1i < v1l || v2i < v2l ){
            int v1v = v1i < v1l ? Integer.valueOf(v1[v1i++]) : 0;
            int v2v = v2i < v2l ? Integer.valueOf(v2[v2i++]) : 0;
            if(v1v == v2v){
                result = 0;
            }else{
                result = v1v > v2v ? 1 : -1;
            }
            if(result != 0){
                return result;
            }
        }
        return result;
    }
}

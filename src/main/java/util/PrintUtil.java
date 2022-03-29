package util;

public class PrintUtil {
    public static void printResult(Object... objects){
        StringBuilder stringBuilder = new StringBuilder();
        if (objects != null && objects.length > 0) {
            for (int i = 0; i < objects.length; i++) {
                stringBuilder.append(objects[i].toString());
                if(i < objects.length - 1){
                    stringBuilder.append("-->");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}

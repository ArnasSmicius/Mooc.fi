
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        int i = 0;
        while(true){
            builder.append(" ");
            for(int j = 0 ; j < 4 ; j++, i++){
                if(i == t.length){
                    break;
                }
                builder.append(t[i] + ", ");
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.append("\n");
            if(i == t.length){
                builder.deleteCharAt(builder.length() - 1);
                builder.deleteCharAt(builder.length() - 1);
                break;
            }
        }
        builder.append("\n");
        builder.append("}");
        return builder.toString();
    }
}

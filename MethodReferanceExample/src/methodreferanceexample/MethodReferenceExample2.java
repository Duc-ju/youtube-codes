package methodreferanceexample;

@FunctionalInterface
interface ExecuteFunction {
    int execute(String a, String b);
}

class StringUtils2 {
    public int compare(String a, String b) {
        if(a == null && b == null) return 0;
        if(a == null) return -1;
        if(b == null) return 1;
        return a.compareTo(b);
    }
    
    public int indexOf(String source, String searchValue) {
        if(source == null) return -1;
        return source.indexOf(searchValue);
    }
}

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        String s1 = "Hello! Good morning!";
        String s2 = "Good morning";
        StringUtils2 stringUtils2 = new StringUtils2();
        int compareResult = doAction(s1, s2, stringUtils2::compare);
        System.out.println(compareResult);
        int searchIndexResult = doAction(s1, s2, stringUtils2::indexOf);
        System.out.println(searchIndexResult);
    }
    
    private static int doAction(String s1, String s2, ExecuteFunction func) {
        return func.execute(s1, s2);
    }
}

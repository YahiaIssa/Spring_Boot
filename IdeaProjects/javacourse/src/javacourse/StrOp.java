package javacourse;

public class StrOp {
    public String value;

    public StrOp(String a) {
        this.value = a;
    }

    public char[] strToArray() {
        char[] ch = new char[value.length()];
        for (int i = 0; i < ch.length; i++)
            ch[i] = value.charAt(i);
            return ch;


    }
}

package com;

public class hguk {

    public static void main(String[] args) {
        String str = "jairaj";
        String sty = toLowercase(str);
        System.out.println(sty);
    }

    static String toLowercase(String st) {
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char) (ch[i] + 32);
        }
        st = new String(ch);
        return st;
    }
}

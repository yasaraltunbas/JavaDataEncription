package encriptiontools;

import java.util.HashMap;

public class Decoder {
    HashMap<Character, Character> codValues = new HashMap<Character, Character>();
    int[] keys = {1,0,2,3,4};

    public Decoder() {
        prepareCodValues();
    }

    public String decode(String content) {
        String decodedContent = "";
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            int keyIndex = i % keys.length;
            int key = keys[keyIndex];

            for (int j = 0; j < key; j++) {
                if (codValues.containsKey(c)) {
                    c = codValues.get(c);
                }
            }
            decodedContent += c;
        }
        return decodedContent;
    }

    private void prepareCodValues() {
        codValues.put('1',' ');
        codValues.put('g','!');
        codValues.put('T','#');
        codValues.put('h','$');
        codValues.put('b','%');
        codValues.put('I','&');
        codValues.put('M','(');
        codValues.put('y',')');
        codValues.put('W','*');
        codValues.put(']','+');
        codValues.put('O',',');
        codValues.put(')','-');
        codValues.put('%','.');
        codValues.put('-','0');
        codValues.put('c','1');
        codValues.put('P','2');
        codValues.put('n','3');
        codValues.put('H','4');
        codValues.put('(','5');
        codValues.put('!','6');
        codValues.put('j','7');
        codValues.put('V','9');
        codValues.put('z',':');
        codValues.put('t',';');
        codValues.put('k','<');
        codValues.put(' ','=');
        codValues.put('*','>');
        codValues.put('S','?');
        codValues.put('5','@');
        codValues.put('0','A');
        codValues.put('Y','B');
        codValues.put('r','C');
        codValues.put('@','D');
        codValues.put('.','E');
        codValues.put('x','G');
        codValues.put('s','H');
        codValues.put('6','I');
        codValues.put('a','J');
        codValues.put('7','K');
        codValues.put('"','L');
        codValues.put('i','M');
        codValues.put('v','N');
        codValues.put('4','O');
        codValues.put('^','P');
        codValues.put(',','Q');
        codValues.put('m','R');
        codValues.put('>','S');
        codValues.put('N','T');
        codValues.put('[','U');
        codValues.put('Z','V');
        codValues.put('L','W');
        codValues.put('2','X');
        codValues.put('?','Y');
        codValues.put('C','Z');
        codValues.put(';','[');
        codValues.put('3',']');
        codValues.put('E','^');
        codValues.put('f','_');
        codValues.put('+','a');
        codValues.put('d','b');
        codValues.put('#','c');
        codValues.put('e','d');
        codValues.put('D','e');
        codValues.put('/','f');
        codValues.put('$','/');
        codValues.put('R','g');
        codValues.put('&','h');
        codValues.put('9','i');
        codValues.put('A','j');
        codValues.put('X','l');
        codValues.put('G','m');
        codValues.put('U','n');
        codValues.put('w','o');
        codValues.put('u','P');
        codValues.put(':','q');
        codValues.put('8','r');
        codValues.put('K','s');
        codValues.put('_','t');
        codValues.put('o','u');
        codValues.put('=','v');
        codValues.put('l','w');
        codValues.put('J','x');
        codValues.put('B','y');
        codValues.put('<','z');
        codValues.put('F','\'');
        codValues.put('Q','\\');
        codValues.put('\'','F');
        codValues.put('\\','8');
        codValues.put('q','\"');
    }
}

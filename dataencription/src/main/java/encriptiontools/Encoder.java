package encriptiontools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Encoder {

    HashMap<Character, Character> codValues = new HashMap<Character, Character>();
    int[] keys = {1,0,2,3,4};

    public Encoder() {
        prepareCodValues();
    }

    public String encode(String content) {
        String encodedContent = "";
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            char encodedCharacter = c;
            int keyIndex = i % keys.length;
            int key = keys[keyIndex];

            for (int j = 0; j < key; j++) {
                if (codValues.containsKey(c)){
                    c = codValues.get(c);
                }

            }
            encodedContent +=   c;
        }
        return encodedContent;
    }

    private void prepareCodValues() {
        codValues.put(' ', '1');
        codValues.put('!', 'g');
        codValues.put('"', 'q');
        codValues.put('#', 'T');
        codValues.put('$', 'h');
        codValues.put('%', 'b');
        codValues.put('&', 'I');
        codValues.put('(', 'M');
        codValues.put(')', 'y');
        codValues.put('*', 'W');
        codValues.put('+', ']');
        codValues.put(',', 'O');
        codValues.put('-', ')');
        codValues.put('.', '%');
        codValues.put('/', '$');
        codValues.put('0', '-');
        codValues.put('1', 'c');
        codValues.put('2', 'P');
        codValues.put('3', 'n');
        codValues.put('4', 'H');
        codValues.put('5', '(');
        codValues.put('6', '!');
        codValues.put('7', 'j');
        codValues.put('9', 'V');
        codValues.put(':', 'z');
        codValues.put(';', 't');
        codValues.put('<', 'k');
        codValues.put('=', ' ');
        codValues.put('>', '*');
        codValues.put('?', 'S');
        codValues.put('@', '5');
        codValues.put('A', '0');
        codValues.put('B', 'Y');
        codValues.put('C', 'r');
        codValues.put('D', '@');
        codValues.put('E', '.');
        codValues.put('G', 'x');
        codValues.put('H', 's');
        codValues.put('I', '6');
        codValues.put('J', 'a');
        codValues.put('K', '7');
        codValues.put('L', '"');
        codValues.put('M', 'i');
        codValues.put('N', 'v');
        codValues.put('O', '4');
        codValues.put('P', '^');
        codValues.put('Q', ',');
        codValues.put('R', 'm');
        codValues.put('S', '>');
        codValues.put('T', 'N');
        codValues.put('U', '[');
        codValues.put('V', 'Z');
        codValues.put('W', 'L');
        codValues.put('X', '2');
        codValues.put('Y', '?');
        codValues.put('Z', 'C');
        codValues.put('[', ';');
        codValues.put(']', '3');
        codValues.put('^', 'E');
        codValues.put('_', 'f');
        codValues.put('a', '+');
        codValues.put('b', 'd');
        codValues.put('c', '#');
        codValues.put('d', 'e');
        codValues.put('e', 'D');
        codValues.put('f', '/');
        codValues.put('g', 'R');
        codValues.put('h', '&');
        codValues.put('i', '9');
        codValues.put('j', 'A');
        codValues.put('k', 'P');
        codValues.put('l', 'X');
        codValues.put('m', 'G');
        codValues.put('n', 'U');
        codValues.put('o', 'w');
        codValues.put('q', ':');
        codValues.put('r', '8');
        codValues.put('s', 'K');
        codValues.put('t', '_');
        codValues.put('u', 'o');
        codValues.put('v', '=');
        codValues.put('w', 'l');
        codValues.put('x', 'J');
        codValues.put('y', 'B');
        codValues.put('z', '<');
        codValues.put('\'', 'F');
        codValues.put('\\', 'Q');
        codValues.put('F', '\'');
        codValues.put('8', '\\');
    }
}

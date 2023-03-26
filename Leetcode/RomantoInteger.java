// leetcode question :- 13

import java.util.Dictionary;
import java.util.Hashtable;
public class RomantoInteger {

    public int romanToInt(String s) {
        Dictionary<Character,Integer> dick = new Hashtable<>();
        dick.put('I',1);
        dick.put('V',5);
        dick.put('X',10);
        dick.put('L',50);
        dick.put('C',100);
        dick.put('D',500);
        dick.put('M',1000);
        int f = 0;
        int sec = f + 1;
        int result = 0;
        char[] ch = s.toCharArray();
        if(ch.length < 2){
            return  dick.get(ch[f]);
        }
        while(sec < ch.length){
            if ( dick.get(ch[f]) < dick.get(ch[sec])){
                result = result + (dick.get(ch[sec])-dick.get(ch[f]));
                f = sec + 1;
                sec = f + 1;

            }
            else {
                result = result + dick.get(ch[f]);
                f = sec;
                sec++;
            }
        }
        if(f < ch.length)
            result = result + dick.get(ch[f]);
        return result;
    }
}

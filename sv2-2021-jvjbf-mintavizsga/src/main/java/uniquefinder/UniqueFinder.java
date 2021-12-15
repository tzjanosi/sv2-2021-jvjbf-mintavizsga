package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> getUniqueChars(String input){
        if(input == null){
            throw new IllegalArgumentException("Text is null.");
        }
        List<Character> temp=new ArrayList<>();
        for (char c: input.toCharArray()) {
            if(!temp.contains(c)) {
                temp.add(c);
            }
        }
        return temp;
    }
}

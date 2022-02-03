package taskOne.withoutStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReorganizerOfList {

    public void reorganizer(Collection<String> list) {
        List<String> result = new ArrayList<>();
        int index = 1;
        for (String l : list) {
            if (index % 2 != 0) {
                result.add(index + ". " + l);
            }
            index++;
        }
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            if (i < result.size() - 1) {
                resultString.append(result.get(i) + ", ");
            } else {
                resultString.append(result.get(i) + ". ");
            }

        }
        System.out.println(resultString);
    }

}


class ReorganizerTester{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("Jane");
        list.add("Luca");
        list.add("Ivan");
        list.add("Max");
        list.add("Steve");
        System.out.println(list);
        ReorganizerOfList reor = new ReorganizerOfList();
        reor.reorganizer(list);

    }
}
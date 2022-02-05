package taskThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class Sorter {
    private List<String> list = new ArrayList<>();

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

  public String sorter(){
        String result =  getList().stream()
                .map(element ->  (List<String>) new ArrayList<String>(Arrays.asList(element
                        .replaceAll("\\D+", " ").split(" "))))
                .flatMap(Collection::stream)
                .mapToInt(it-> Integer.parseInt(it))
                .sorted()
                .mapToObj(x-> x + "")
                .collect(Collectors.joining(", ", "\"", "\""));
        return result;
    }

}

class SorterTester{
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        List<String> inputList = Arrays.asList("1, 2, 0", "4, 5");
        sorter.setList(inputList);
        System.out.println("Before changes: \n" +  sorter.getList());
        System.out.println("After changes: \n" + sorter.sorter());
    }

}

package taskTwo;

public class Person {
    private String name;
    private String secondName;
    private int sequenceNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public Person(int sequenceNumber, String name, String secondName){
        this.sequenceNumber = sequenceNumber;
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return sequenceNumber+ ". " + name + " " + secondName;
    }
}

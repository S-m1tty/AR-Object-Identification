package Test.com;

public class NNOutput {

    public String name;
    public double value;

    public NNOutput(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }


    @Override
    public String toString() {
        return name+":"+getValue();
    }
}

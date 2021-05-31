public class Multiply implements Command {
    @Override
    public Float apply(Float first, Float second) {
        return first * second;
    }
}

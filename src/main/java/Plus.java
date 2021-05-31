public class Plus implements Command{
   @Override
   public Float apply(Float first, Float second) {
       return first + second;
   }
}

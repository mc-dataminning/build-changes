import java.util.function.UnaryOperator;

@FunctionalInterface
public interface gsn extends UnaryOperator<gsm> {
   gsn.a<i> a = gsm::a;
   gsn.a<i> b = gsm::b;
   gsn.a<alg> c = gsm::a;
   gsn.a<Boolean> d = gsm::a;
   gsn.a<Integer> e = gsm::a;

   default gsn then(gsn $$0) {
      return $$1 -> $$0.apply(this.apply($$1));
   }

   @FunctionalInterface
   public interface a<T> {
      gsm apply(gsm var1, T var2);

      default gsn withValue(T $$0) {
         return $$1 -> this.apply($$1, $$0);
      }
   }
}

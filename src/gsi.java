import java.util.function.UnaryOperator;

@FunctionalInterface
public interface gsi extends UnaryOperator<gsh> {
   gsi.a<i> a = gsh::a;
   gsi.a<i> b = gsh::b;
   gsi.a<alg> c = gsh::a;
   gsi.a<Boolean> d = gsh::a;
   gsi.a<Integer> e = gsh::a;

   default gsi then(gsi $$0) {
      return $$1 -> $$0.apply(this.apply($$1));
   }

   @FunctionalInterface
   public interface a<T> {
      gsh apply(gsh var1, T var2);

      default gsi withValue(T $$0) {
         return $$1 -> this.apply($$1, $$0);
      }
   }
}

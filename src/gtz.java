import java.util.function.UnaryOperator;

@FunctionalInterface
public interface gtz extends UnaryOperator<gty> {
   gtz.a<i> a = gty::a;
   gtz.a<i> b = gty::b;
   gtz.a<alk> c = gty::a;
   gtz.a<Boolean> d = gty::a;

   default gtz then(gtz $$0) {
      return $$1 -> $$0.apply(this.apply($$1));
   }

   @FunctionalInterface
   public interface a<T> {
      gty apply(gty var1, T var2);

      default gtz withValue(T $$0) {
         return $$1 -> this.apply($$1, $$0);
      }
   }
}

import java.util.function.UnaryOperator;

@FunctionalInterface
public interface gtx extends UnaryOperator<gtw> {
   gtx.a<i> a = gtw::a;
   gtx.a<i> b = gtw::b;
   gtx.a<ali> c = gtw::a;
   gtx.a<Boolean> d = gtw::a;

   default gtx then(gtx $$0) {
      return $$1 -> $$0.apply(this.apply($$1));
   }

   @FunctionalInterface
   public interface a<T> {
      gtw apply(gtw var1, T var2);

      default gtx withValue(T $$0) {
         return $$1 -> this.apply($$1, $$0);
      }
   }
}

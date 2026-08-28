import java.util.function.UnaryOperator;

@FunctionalInterface
public interface gtk extends UnaryOperator<gtj> {
   gtk.a<i> a = gtj::a;
   gtk.a<i> b = gtj::b;
   gtk.a<alr> c = gtj::a;
   gtk.a<Boolean> d = gtj::a;

   default gtk then(gtk $$0) {
      return $$1 -> $$0.apply(this.apply($$1));
   }

   @FunctionalInterface
   public interface a<T> {
      gtj apply(gtj var1, T var2);

      default gtk withValue(T $$0) {
         return $$1 -> this.apply($$1, $$0);
      }
   }
}

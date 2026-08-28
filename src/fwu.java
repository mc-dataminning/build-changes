import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class fwu<T> {
   private final T b;
   private final BiConsumer<Consumer<String>, T> c;
   public static final fwu<?> a = new fwu<>(bau.a, ($$0, $$1) -> {
   });

   private fwu(T $$0, BiConsumer<Consumer<String>, T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static fwu<?> a(String $$0) {
      return new fwu<>($$0, Consumer::accept);
   }

   public static fwu<?> a(wy $$0) {
      return new fwu<>($$0, ($$0x, $$1) -> $$0x.accept($$1.getString()));
   }

   public static fwu<?> a(List<wy> $$0) {
      return new fwu<>($$0, ($$1, $$2) -> $$0.stream().map(wy::getString).forEach($$1));
   }

   public void a(Consumer<String> $$0) {
      this.c.accept($$0, this.b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fwu<?> $$1) ? false : $$1.c == this.c && $$1.b.equals(this.b);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class fwi<T> {
   private final T b;
   private final BiConsumer<Consumer<String>, T> c;
   public static final fwi<?> a = new fwi<>(bau.a, ($$0, $$1) -> {
   });

   private fwi(T $$0, BiConsumer<Consumer<String>, T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static fwi<?> a(String $$0) {
      return new fwi<>($$0, Consumer::accept);
   }

   public static fwi<?> a(wy $$0) {
      return new fwi<>($$0, ($$0x, $$1) -> $$0x.accept($$1.getString()));
   }

   public static fwi<?> a(List<wy> $$0) {
      return new fwi<>($$0, ($$1, $$2) -> $$0.stream().map(wy::getString).forEach($$1));
   }

   public void a(Consumer<String> $$0) {
      this.c.accept($$0, this.b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fwi<?> $$1) ? false : $$1.c == this.c && $$1.b.equals(this.b);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class fvp<T> {
   private final T b;
   private final BiConsumer<Consumer<String>, T> c;
   public static final fvp<?> a = new fvp<>(bas.a, ($$0, $$1) -> {
   });

   private fvp(T $$0, BiConsumer<Consumer<String>, T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static fvp<?> a(String $$0) {
      return new fvp<>($$0, Consumer::accept);
   }

   public static fvp<?> a(ww $$0) {
      return new fvp<>($$0, ($$0x, $$1) -> $$0x.accept($$1.getString()));
   }

   public static fvp<?> a(List<ww> $$0) {
      return new fvp<>($$0, ($$1, $$2) -> $$0.stream().map(ww::getString).forEach($$1));
   }

   public void a(Consumer<String> $$0) {
      this.c.accept($$0, this.b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fvp<?> $$1) ? false : $$1.c == this.c && $$1.b.equals(this.b);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}

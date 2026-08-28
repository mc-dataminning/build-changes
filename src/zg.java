import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zg {
   int a = 4096;

   static <T extends wg, P extends zf<? super T>> zg a(final zj<P> $$0, final Function<Iterable<zh<? super T>>, P> $$1, final ze<? super T> $$2) {
      return new zg() {
         @Override
         public void a(zh<?> $$0x, Consumer<zh<?>> $$1x) {
            if ($$0.a() == $$0) {
               P $$2 = (P)$$0;
               $$1.accept($$2);
               $$2.b().forEach($$1);
               $$1.accept($$2);
            } else {
               $$1.accept($$0);
            }
         }

         @Nullable
         @Override
         public zg.a a(zh<?> $$0x) {
            return $$0 == $$2 ? new zg.a() {
               private final List<zh<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zh<?> a(zh<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zh<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zh<?> var1, Consumer<zh<?>> var2);

   @Nullable
   zg.a a(zh<?> var1);

   public interface a {
      @Nullable
      zh<?> a(zh<?> var1);
   }
}

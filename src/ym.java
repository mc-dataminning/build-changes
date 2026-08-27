import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface ym {
   int a = 4096;

   static <T extends vm, P extends yl<? super T>> ym a(final yp<P> $$0, final Function<Iterable<yn<? super T>>, P> $$1, final yk<? super T> $$2) {
      return new ym() {
         @Override
         public void a(yn<?> $$0x, Consumer<yn<?>> $$1x) {
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
         public ym.a a(yn<?> $$0x) {
            return $$0 == $$2 ? new ym.a() {
               private final List<yn<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public yn<?> a(yn<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((yn<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(yn<?> var1, Consumer<yn<?>> var2);

   @Nullable
   ym.a a(yn<?> var1);

   public interface a {
      @Nullable
      yn<?> a(yn<?> var1);
   }
}

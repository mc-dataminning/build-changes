import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface yo {
   int a = 4096;

   static <T extends vo, P extends yn<? super T>> yo a(final yr<P> $$0, final Function<Iterable<yp<? super T>>, P> $$1, final ym<? super T> $$2) {
      return new yo() {
         @Override
         public void a(yp<?> $$0x, Consumer<yp<?>> $$1x) {
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
         public yo.a a(yp<?> $$0x) {
            return $$0 == $$2 ? new yo.a() {
               private final List<yp<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public yp<?> a(yp<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((yp<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(yp<?> var1, Consumer<yp<?>> var2);

   @Nullable
   yo.a a(yp<?> var1);

   public interface a {
      @Nullable
      yp<?> a(yp<?> var1);
   }
}

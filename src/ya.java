import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface ya {
   int a = 4096;

   static <T extends va, P extends xz<? super T>> ya a(final yd<P> $$0, final Function<Iterable<yb<? super T>>, P> $$1, final xy<? super T> $$2) {
      return new ya() {
         @Override
         public void a(yb<?> $$0x, Consumer<yb<?>> $$1x) {
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
         public ya.a a(yb<?> $$0x) {
            return $$0 == $$2 ? new ya.a() {
               private final List<yb<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public yb<?> a(yb<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((yb<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(yb<?> var1, Consumer<yb<?>> var2);

   @Nullable
   ya.a a(yb<?> var1);

   public interface a {
      @Nullable
      yb<?> a(yb<?> var1);
   }
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface yy {
   int a = 4096;

   static <T extends vy, P extends yx<? super T>> yy a(final zb<P> $$0, final Function<Iterable<yz<? super T>>, P> $$1, final yw<? super T> $$2) {
      return new yy() {
         @Override
         public void a(yz<?> $$0x, Consumer<yz<?>> $$1x) {
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
         public yy.a a(yz<?> $$0x) {
            return $$0 == $$2 ? new yy.a() {
               private final List<yz<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public yz<?> a(yz<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((yz<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(yz<?> var1, Consumer<yz<?>> var2);

   @Nullable
   yy.a a(yz<?> var1);

   public interface a {
      @Nullable
      yz<?> a(yz<?> var1);
   }
}

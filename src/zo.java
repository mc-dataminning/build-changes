import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zo {
   int a = 4096;

   static <T extends wo, P extends zn<? super T>> zo a(final zr<P> $$0, final Function<Iterable<zp<? super T>>, P> $$1, final zm<? super T> $$2) {
      return new zo() {
         @Override
         public void a(zp<?> $$0x, Consumer<zp<?>> $$1x) {
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
         public zo.a a(zp<?> $$0x) {
            return $$0 == $$2 ? new zo.a() {
               private final List<zp<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zp<?> a(zp<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zp<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zp<?> var1, Consumer<zp<?>> var2);

   @Nullable
   zo.a a(zp<?> var1);

   public interface a {
      @Nullable
      zp<?> a(zp<?> var1);
   }
}

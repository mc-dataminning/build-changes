import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zp {
   int a = 4096;

   static <T extends wp, P extends zo<? super T>> zp a(final zs<P> $$0, final Function<Iterable<zq<? super T>>, P> $$1, final zn<? super T> $$2) {
      return new zp() {
         @Override
         public void a(zq<?> $$0x, Consumer<zq<?>> $$1x) {
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
         public zp.a a(zq<?> $$0x) {
            return $$0 == $$2 ? new zp.a() {
               private final List<zq<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zq<?> a(zq<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zq<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zq<?> var1, Consumer<zq<?>> var2);

   @Nullable
   zp.a a(zq<?> var1);

   public interface a {
      @Nullable
      zq<?> a(zq<?> var1);
   }
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zb {
   int a = 4096;

   static <T extends wb, P extends za<? super T>> zb a(final ze<P> $$0, final Function<Iterable<zc<? super T>>, P> $$1, final yz<? super T> $$2) {
      return new zb() {
         @Override
         public void a(zc<?> $$0x, Consumer<zc<?>> $$1x) {
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
         public zb.a a(zc<?> $$0x) {
            return $$0 == $$2 ? new zb.a() {
               private final List<zc<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zc<?> a(zc<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zc<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zc<?> var1, Consumer<zc<?>> var2);

   @Nullable
   zb.a a(zc<?> var1);

   public interface a {
      @Nullable
      zc<?> a(zc<?> var1);
   }
}

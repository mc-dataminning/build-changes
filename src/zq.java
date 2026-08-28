import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zq {
   int a = 4096;

   static <T extends wq, P extends zp<? super T>> zq a(final zt<P> $$0, final Function<Iterable<zr<? super T>>, P> $$1, final zo<? super T> $$2) {
      return new zq() {
         @Override
         public void a(zr<?> $$0x, Consumer<zr<?>> $$1x) {
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
         public zq.a a(zr<?> $$0x) {
            return $$0 == $$2 ? new zq.a() {
               private final List<zr<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zr<?> a(zr<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zr<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zr<?> var1, Consumer<zr<?>> var2);

   @Nullable
   zq.a a(zr<?> var1);

   public interface a {
      @Nullable
      zr<?> a(zr<?> var1);
   }
}

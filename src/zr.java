import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zr {
   int a = 4096;

   static <T extends wr, P extends zq<? super T>> zr a(final zu<P> $$0, final Function<Iterable<zs<? super T>>, P> $$1, final zp<? super T> $$2) {
      return new zr() {
         @Override
         public void a(zs<?> $$0x, Consumer<zs<?>> $$1x) {
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
         public zr.a a(zs<?> $$0x) {
            return $$0 == $$2 ? new zr.a() {
               private final List<zs<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zs<?> a(zs<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zs<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zs<?> var1, Consumer<zs<?>> var2);

   @Nullable
   zr.a a(zs<?> var1);

   public interface a {
      @Nullable
      zs<?> a(zs<?> var1);
   }
}

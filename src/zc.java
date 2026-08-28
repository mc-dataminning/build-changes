import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zc {
   int a = 4096;

   static <T extends wc, P extends zb<? super T>> zc a(final zf<P> $$0, final Function<Iterable<zd<? super T>>, P> $$1, final za<? super T> $$2) {
      return new zc() {
         @Override
         public void a(zd<?> $$0x, Consumer<zd<?>> $$1x) {
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
         public zc.a a(zd<?> $$0x) {
            return $$0 == $$2 ? new zc.a() {
               private final List<zd<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zd<?> a(zd<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zd<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zd<?> var1, Consumer<zd<?>> var2);

   @Nullable
   zc.a a(zd<?> var1);

   public interface a {
      @Nullable
      zd<?> a(zd<?> var1);
   }
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zv {
   int a = 4096;

   static <T extends wv, P extends zu<? super T>> zv a(final zy<P> $$0, final Function<Iterable<zw<? super T>>, P> $$1, final zt<? super T> $$2) {
      return new zv() {
         @Override
         public void a(zw<?> $$0x, Consumer<zw<?>> $$1x) {
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
         public zv.a a(zw<?> $$0x) {
            return $$0 == $$2 ? new zv.a() {
               private final List<zw<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zw<?> a(zw<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zw<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zw<?> var1, Consumer<zw<?>> var2);

   @Nullable
   zv.a a(zw<?> var1);

   public interface a {
      @Nullable
      zw<?> a(zw<?> var1);
   }
}

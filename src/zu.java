import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zu {
   int a = 4096;

   static <T extends wu, P extends zt<? super T>> zu a(final zx<P> $$0, final Function<Iterable<zv<? super T>>, P> $$1, final zs<? super T> $$2) {
      return new zu() {
         @Override
         public void a(zv<?> $$0x, Consumer<zv<?>> $$1x) {
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
         public zu.a a(zv<?> $$0x) {
            return $$0 == $$2 ? new zu.a() {
               private final List<zv<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zv<?> a(zv<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zv<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zv<?> var1, Consumer<zv<?>> var2);

   @Nullable
   zu.a a(zv<?> var1);

   public interface a {
      @Nullable
      zv<?> a(zv<?> var1);
   }
}

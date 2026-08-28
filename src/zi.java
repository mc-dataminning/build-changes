import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zi {
   int a = 4096;

   static <T extends wi, P extends zh<? super T>> zi a(final zl<P> $$0, final Function<Iterable<zj<? super T>>, P> $$1, final zg<? super T> $$2) {
      return new zi() {
         @Override
         public void a(zj<?> $$0x, Consumer<zj<?>> $$1x) {
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
         public zi.a a(zj<?> $$0x) {
            return $$0 == $$2 ? new zi.a() {
               private final List<zj<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zj<?> a(zj<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zj<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zj<?> var1, Consumer<zj<?>> var2);

   @Nullable
   zi.a a(zj<?> var1);

   public interface a {
      @Nullable
      zj<?> a(zj<?> var1);
   }
}

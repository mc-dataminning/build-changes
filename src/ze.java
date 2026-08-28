import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface ze {
   int a = 4096;

   static <T extends we, P extends zd<? super T>> ze a(final zh<P> $$0, final Function<Iterable<zf<? super T>>, P> $$1, final zc<? super T> $$2) {
      return new ze() {
         @Override
         public void a(zf<?> $$0x, Consumer<zf<?>> $$1x) {
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
         public ze.a a(zf<?> $$0x) {
            return $$0 == $$2 ? new ze.a() {
               private final List<zf<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zf<?> a(zf<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zf<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zf<?> var1, Consumer<zf<?>> var2);

   @Nullable
   ze.a a(zf<?> var1);

   public interface a {
      @Nullable
      zf<?> a(zf<?> var1);
   }
}

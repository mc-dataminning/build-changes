import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zd {
   int a = 4096;

   static <T extends wd, P extends zc<? super T>> zd a(final zg<P> $$0, final Function<Iterable<ze<? super T>>, P> $$1, final zb<? super T> $$2) {
      return new zd() {
         @Override
         public void a(ze<?> $$0x, Consumer<ze<?>> $$1x) {
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
         public zd.a a(ze<?> $$0x) {
            return $$0 == $$2 ? new zd.a() {
               private final List<ze<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public ze<?> a(ze<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((ze<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(ze<?> var1, Consumer<ze<?>> var2);

   @Nullable
   zd.a a(ze<?> var1);

   public interface a {
      @Nullable
      ze<?> a(ze<?> var1);
   }
}

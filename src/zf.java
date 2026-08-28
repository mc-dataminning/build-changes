import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zf {
   int a = 4096;

   static <T extends wf, P extends ze<? super T>> zf a(final zi<P> $$0, final Function<Iterable<zg<? super T>>, P> $$1, final zd<? super T> $$2) {
      return new zf() {
         @Override
         public void a(zg<?> $$0x, Consumer<zg<?>> $$1x) {
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
         public zf.a a(zg<?> $$0x) {
            return $$0 == $$2 ? new zf.a() {
               private final List<zg<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zg<?> a(zg<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zg<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zg<?> var1, Consumer<zg<?>> var2);

   @Nullable
   zf.a a(zg<?> var1);

   public interface a {
      @Nullable
      zg<?> a(zg<?> var1);
   }
}

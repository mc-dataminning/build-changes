import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zk {
   int a = 4096;

   static <T extends wk, P extends zj<? super T>> zk a(final zn<P> $$0, final Function<Iterable<zl<? super T>>, P> $$1, final zi<? super T> $$2) {
      return new zk() {
         @Override
         public void a(zl<?> $$0x, Consumer<zl<?>> $$1x) {
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
         public zk.a a(zl<?> $$0x) {
            return $$0 == $$2 ? new zk.a() {
               private final List<zl<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zl<?> a(zl<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zl<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zl<?> var1, Consumer<zl<?>> var2);

   @Nullable
   zk.a a(zl<?> var1);

   public interface a {
      @Nullable
      zl<?> a(zl<?> var1);
   }
}

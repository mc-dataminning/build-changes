import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zj {
   int a = 4096;

   static <T extends wj, P extends zi<? super T>> zj a(final zm<P> $$0, final Function<Iterable<zk<? super T>>, P> $$1, final zh<? super T> $$2) {
      return new zj() {
         @Override
         public void a(zk<?> $$0x, Consumer<zk<?>> $$1x) {
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
         public zj.a a(zk<?> $$0x) {
            return $$0 == $$2 ? new zj.a() {
               private final List<zk<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zk<?> a(zk<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zk<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zk<?> var1, Consumer<zk<?>> var2);

   @Nullable
   zj.a a(zk<?> var1);

   public interface a {
      @Nullable
      zk<?> a(zk<?> var1);
   }
}

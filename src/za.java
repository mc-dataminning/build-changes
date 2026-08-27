import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface za {
   int a = 4096;

   static <T extends wa, P extends yz<? super T>> za a(final zd<P> $$0, final Function<Iterable<zb<? super T>>, P> $$1, final yy<? super T> $$2) {
      return new za() {
         @Override
         public void a(zb<?> $$0x, Consumer<zb<?>> $$1x) {
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
         public za.a a(zb<?> $$0x) {
            return $$0 == $$2 ? new za.a() {
               private final List<zb<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zb<?> a(zb<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zb<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zb<?> var1, Consumer<zb<?>> var2);

   @Nullable
   za.a a(zb<?> var1);

   public interface a {
      @Nullable
      zb<?> a(zb<?> var1);
   }
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zn {
   int a = 4096;

   static <T extends wn, P extends zm<? super T>> zn a(final zq<P> $$0, final Function<Iterable<zo<? super T>>, P> $$1, final zl<? super T> $$2) {
      return new zn() {
         @Override
         public void a(zo<?> $$0x, Consumer<zo<?>> $$1x) {
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
         public zn.a a(zo<?> $$0x) {
            return $$0 == $$2 ? new zn.a() {
               private final List<zo<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zo<?> a(zo<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zo<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zo<?> var1, Consumer<zo<?>> var2);

   @Nullable
   zn.a a(zo<?> var1);

   public interface a {
      @Nullable
      zo<?> a(zo<?> var1);
   }
}

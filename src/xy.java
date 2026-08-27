import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface xy {
   int a = 4096;

   static <T extends uy, P extends xx<? super T>> xy a(final yb<P> $$0, final Function<Iterable<xz<? super T>>, P> $$1, final xw<? super T> $$2) {
      return new xy() {
         @Override
         public void a(xz<?> $$0x, Consumer<xz<?>> $$1x) {
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
         public xy.a a(xz<?> $$0x) {
            return $$0 == $$2 ? new xy.a() {
               private final List<xz<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public xz<?> a(xz<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((xz<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(xz<?> var1, Consumer<xz<?>> var2);

   @Nullable
   xy.a a(xz<?> var1);

   public interface a {
      @Nullable
      xz<?> a(xz<?> var1);
   }
}

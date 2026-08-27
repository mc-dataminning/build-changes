import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wt {
   int a = 4096;
   wt b = new wt() {
      @Override
      public void a(wu<?> $$0, Consumer<wu<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public wt.a a(wu<?> $$0) {
         return null;
      }
   };

   static <T extends uk, P extends ws<T>> wt a(final Class<P> $$0, final Function<Iterable<wu<T>>, P> $$1, final wr<T> $$2) {
      return new wt() {
         @Override
         public void a(wu<?> $$0x, Consumer<wu<?>> $$1x) {
            if ($$0.getClass() == $$0) {
               P $$2 = (P)$$0;
               $$1.accept($$2);
               $$2.a().forEach($$1);
               $$1.accept($$2);
            } else {
               $$1.accept($$0);
            }
         }

         @Nullable
         @Override
         public wt.a a(wu<?> $$0x) {
            return $$0 == $$2 ? new wt.a() {
               private final List<wu<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public wu<?> a(wu<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((wu<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(wu<?> var1, Consumer<wu<?>> var2);

   @Nullable
   wt.a a(wu<?> var1);

   public interface a {
      @Nullable
      wu<?> a(wu<?> var1);
   }

   public interface b {
      wt c();
   }
}

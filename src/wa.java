import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wa {
   int a = 4096;
   wa b = new wa() {
      @Override
      public void a(wb<?> $$0, Consumer<wb<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public wa.a a(wb<?> $$0) {
         return null;
      }
   };

   static <T extends tr, P extends vz<T>> wa a(final Class<P> $$0, final Function<Iterable<wb<T>>, P> $$1, final vy<T> $$2) {
      return new wa() {
         @Override
         public void a(wb<?> $$0x, Consumer<wb<?>> $$1x) {
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
         public wa.a a(wb<?> $$0x) {
            return $$0 == $$2 ? new wa.a() {
               private final List<wb<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public wb<?> a(wb<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((wb<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(wb<?> var1, Consumer<wb<?>> var2);

   @Nullable
   wa.a a(wb<?> var1);

   public interface a {
      @Nullable
      wb<?> a(wb<?> var1);
   }

   public interface b {
      wa c();
   }
}

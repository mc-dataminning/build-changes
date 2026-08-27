import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface uw {
   int a = 4096;
   uw b = new uw() {
      @Override
      public void a(ux<?> $$0, Consumer<ux<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public uw.a a(ux<?> $$0) {
         return null;
      }
   };

   static <T extends so, P extends uv<T>> uw a(final Class<P> $$0, final Function<Iterable<ux<T>>, P> $$1, final uu<T> $$2) {
      return new uw() {
         @Override
         public void a(ux<?> $$0x, Consumer<ux<?>> $$1x) {
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
         public uw.a a(ux<?> $$0x) {
            return $$0 == $$2 ? new uw.a() {
               private final List<ux<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public ux<?> a(ux<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((ux<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(ux<?> var1, Consumer<ux<?>> var2);

   @Nullable
   uw.a a(ux<?> var1);

   public interface a {
      @Nullable
      ux<?> a(ux<?> var1);
   }

   public interface b {
      uw c();
   }
}

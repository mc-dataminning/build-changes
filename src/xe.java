import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface xe {
   int a = 4096;
   xe b = new xe() {
      @Override
      public void a(xf<?> $$0, Consumer<xf<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public xe.a a(xf<?> $$0) {
         return null;
      }
   };

   static <T extends uo, P extends xd<T>> xe a(final Class<P> $$0, final Function<Iterable<xf<T>>, P> $$1, final xc<T> $$2) {
      return new xe() {
         @Override
         public void a(xf<?> $$0x, Consumer<xf<?>> $$1x) {
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
         public xe.a a(xf<?> $$0x) {
            return $$0 == $$2 ? new xe.a() {
               private final List<xf<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public xf<?> a(xf<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((xf<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(xf<?> var1, Consumer<xf<?>> var2);

   @Nullable
   xe.a a(xf<?> var1);

   public interface a {
      @Nullable
      xf<?> a(xf<?> var1);
   }

   public interface b {
      xe c();
   }
}

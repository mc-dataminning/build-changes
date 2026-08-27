import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface xf {
   int a = 4096;
   xf b = new xf() {
      @Override
      public void a(xg<?> $$0, Consumer<xg<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public xf.a a(xg<?> $$0) {
         return null;
      }
   };

   static <T extends up, P extends xe<T>> xf a(final Class<P> $$0, final Function<Iterable<xg<T>>, P> $$1, final xd<T> $$2) {
      return new xf() {
         @Override
         public void a(xg<?> $$0x, Consumer<xg<?>> $$1x) {
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
         public xf.a a(xg<?> $$0x) {
            return $$0 == $$2 ? new xf.a() {
               private final List<xg<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public xg<?> a(xg<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((xg<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(xg<?> var1, Consumer<xg<?>> var2);

   @Nullable
   xf.a a(xg<?> var1);

   public interface a {
      @Nullable
      xg<?> a(xg<?> var1);
   }

   public interface b {
      xf c();
   }
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wj {
   int a = 4096;
   wj b = new wj() {
      @Override
      public void a(wk<?> $$0, Consumer<wk<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public wj.a a(wk<?> $$0) {
         return null;
      }
   };

   static <T extends ua, P extends wi<T>> wj a(final Class<P> $$0, final Function<Iterable<wk<T>>, P> $$1, final wh<T> $$2) {
      return new wj() {
         @Override
         public void a(wk<?> $$0x, Consumer<wk<?>> $$1x) {
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
         public wj.a a(wk<?> $$0x) {
            return $$0 == $$2 ? new wj.a() {
               private final List<wk<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public wk<?> a(wk<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((wk<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(wk<?> var1, Consumer<wk<?>> var2);

   @Nullable
   wj.a a(wk<?> var1);

   public interface a {
      @Nullable
      wk<?> a(wk<?> var1);
   }

   public interface b {
      wj c();
   }
}

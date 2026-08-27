import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wn {
   int a = 4096;
   wn b = new wn() {
      @Override
      public void a(wo<?> $$0, Consumer<wo<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public wn.a a(wo<?> $$0) {
         return null;
      }
   };

   static <T extends ue, P extends wm<T>> wn a(final Class<P> $$0, final Function<Iterable<wo<T>>, P> $$1, final wl<T> $$2) {
      return new wn() {
         @Override
         public void a(wo<?> $$0x, Consumer<wo<?>> $$1x) {
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
         public wn.a a(wo<?> $$0x) {
            return $$0 == $$2 ? new wn.a() {
               private final List<wo<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public wo<?> a(wo<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((wo<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(wo<?> var1, Consumer<wo<?>> var2);

   @Nullable
   wn.a a(wo<?> var1);

   public interface a {
      @Nullable
      wo<?> a(wo<?> var1);
   }

   public interface b {
      wn c();
   }
}

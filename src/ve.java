import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface ve {
   int a = 4096;
   ve b = new ve() {
      @Override
      public void a(vf<?> $$0, Consumer<vf<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public ve.a a(vf<?> $$0) {
         return null;
      }
   };

   static <T extends sw, P extends vd<T>> ve a(final Class<P> $$0, final Function<Iterable<vf<T>>, P> $$1, final vc<T> $$2) {
      return new ve() {
         @Override
         public void a(vf<?> $$0x, Consumer<vf<?>> $$1x) {
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
         public ve.a a(vf<?> $$0x) {
            return $$0 == $$2 ? new ve.a() {
               private final List<vf<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public vf<?> a(vf<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((vf<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(vf<?> var1, Consumer<vf<?>> var2);

   @Nullable
   ve.a a(vf<?> var1);

   public interface a {
      @Nullable
      vf<?> a(vf<?> var1);
   }

   public interface b {
      ve c();
   }
}

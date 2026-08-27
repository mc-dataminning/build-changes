import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface vc {
   int a = 4096;
   vc b = new vc() {
      @Override
      public void a(vd<?> $$0, Consumer<vd<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public vc.a a(vd<?> $$0) {
         return null;
      }
   };

   static <T extends su, P extends vb<T>> vc a(final Class<P> $$0, final Function<Iterable<vd<T>>, P> $$1, final va<T> $$2) {
      return new vc() {
         @Override
         public void a(vd<?> $$0x, Consumer<vd<?>> $$1x) {
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
         public vc.a a(vd<?> $$0x) {
            return $$0 == $$2 ? new vc.a() {
               private final List<vd<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public vd<?> a(vd<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((vd<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(vd<?> var1, Consumer<vd<?>> var2);

   @Nullable
   vc.a a(vd<?> var1);

   public interface a {
      @Nullable
      vd<?> a(vd<?> var1);
   }

   public interface b {
      vc c();
   }
}

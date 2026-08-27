import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface vd {
   int a = 4096;
   vd b = new vd() {
      @Override
      public void a(ve<?> $$0, Consumer<ve<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public vd.a a(ve<?> $$0) {
         return null;
      }
   };

   static <T extends sv, P extends vc<T>> vd a(final Class<P> $$0, final Function<Iterable<ve<T>>, P> $$1, final vb<T> $$2) {
      return new vd() {
         @Override
         public void a(ve<?> $$0x, Consumer<ve<?>> $$1x) {
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
         public vd.a a(ve<?> $$0x) {
            return $$0 == $$2 ? new vd.a() {
               private final List<ve<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public ve<?> a(ve<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((ve<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(ve<?> var1, Consumer<ve<?>> var2);

   @Nullable
   vd.a a(ve<?> var1);

   public interface a {
      @Nullable
      ve<?> a(ve<?> var1);
   }

   public interface b {
      vd c();
   }
}

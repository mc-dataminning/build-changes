import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface xc {
   int a = 4096;
   xc b = new xc() {
      @Override
      public void a(xd<?> $$0, Consumer<xd<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public xc.a a(xd<?> $$0) {
         return null;
      }
   };

   static <T extends um, P extends xb<T>> xc a(final Class<P> $$0, final Function<Iterable<xd<T>>, P> $$1, final xa<T> $$2) {
      return new xc() {
         @Override
         public void a(xd<?> $$0x, Consumer<xd<?>> $$1x) {
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
         public xc.a a(xd<?> $$0x) {
            return $$0 == $$2 ? new xc.a() {
               private final List<xd<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public xd<?> a(xd<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((xd<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(xd<?> var1, Consumer<xd<?>> var2);

   @Nullable
   xc.a a(xd<?> var1);

   public interface a {
      @Nullable
      xd<?> a(xd<?> var1);
   }

   public interface b {
      xc c();
   }
}

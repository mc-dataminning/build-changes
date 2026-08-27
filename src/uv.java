import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface uv {
   int a = 4096;
   uv b = new uv() {
      @Override
      public void a(uw<?> $$0, Consumer<uw<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public uv.a a(uw<?> $$0) {
         return null;
      }
   };

   static <T extends sn, P extends uu<T>> uv a(final Class<P> $$0, final Function<Iterable<uw<T>>, P> $$1, final ut<T> $$2) {
      return new uv() {
         @Override
         public void a(uw<?> $$0x, Consumer<uw<?>> $$1x) {
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
         public uv.a a(uw<?> $$0x) {
            return $$0 == $$2 ? new uv.a() {
               private final List<uw<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public uw<?> a(uw<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((uw<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(uw<?> var1, Consumer<uw<?>> var2);

   @Nullable
   uv.a a(uw<?> var1);

   public interface a {
      @Nullable
      uw<?> a(uw<?> var1);
   }

   public interface b {
      uv c();
   }
}

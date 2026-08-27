import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface uz {
   int a = 4096;
   uz b = new uz() {
      @Override
      public void a(va<?> $$0, Consumer<va<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public uz.a a(va<?> $$0) {
         return null;
      }
   };

   static <T extends sr, P extends uy<T>> uz a(final Class<P> $$0, final Function<Iterable<va<T>>, P> $$1, final ux<T> $$2) {
      return new uz() {
         @Override
         public void a(va<?> $$0x, Consumer<va<?>> $$1x) {
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
         public uz.a a(va<?> $$0x) {
            return $$0 == $$2 ? new uz.a() {
               private final List<va<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public va<?> a(va<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((va<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(va<?> var1, Consumer<va<?>> var2);

   @Nullable
   uz.a a(va<?> var1);

   public interface a {
      @Nullable
      va<?> a(va<?> var1);
   }

   public interface b {
      uz c();
   }
}

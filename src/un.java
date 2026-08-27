import io.netty.util.AttributeKey;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface un {
   AttributeKey<un.b> a = AttributeKey.valueOf("bundler");
   int b = 4096;
   un c = new un() {
      @Override
      public void a(uo<?> $$0, Consumer<uo<?>> $$1) {
         $$1.accept($$0);
      }

      @Nullable
      @Override
      public un.a a(uo<?> $$0) {
         return null;
      }
   };

   static <T extends sk, P extends um<T>> un a(final Class<P> $$0, final Function<Iterable<uo<T>>, P> $$1, final ul<T> $$2) {
      return new un() {
         @Override
         public void a(uo<?> $$0x, Consumer<uo<?>> $$1x) {
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
         public un.a a(uo<?> $$0x) {
            return $$0 == $$2 ? new un.a() {
               private final List<uo<T>> b = new ArrayList<>();

               @Nullable
               @Override
               public uo<?> a(uo<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((uo<T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(uo<?> var1, Consumer<uo<?>> var2);

   @Nullable
   un.a a(uo<?> var1);

   public interface a {
      @Nullable
      uo<?> a(uo<?> var1);
   }

   public interface b {
      un a(up var1);
   }
}

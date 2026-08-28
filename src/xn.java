import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xn {
   Optional<bap> a = Optional.of(bap.a);
   xn b = new xn() {
      @Override
      public <T> Optional<T> a(xn.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xn.b<T> $$0, yf $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xn.a<T> var1);

   <T> Optional<T> a(xn.b<T> var1, yf var2);

   static xn e(final String $$0) {
      return new xn() {
         @Override
         public <T> Optional<T> a(xn.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xn.b<T> $$0x, yf $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xn a(final String $$0, final yf $$1) {
      return new xn() {
         @Override
         public <T> Optional<T> a(xn.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xn.b<T> $$0x, yf $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xn a(xn... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xn a(final List<? extends xn> $$0) {
      return new xn() {
         @Override
         public <T> Optional<T> a(xn.a<T> $$0x) {
            for (xn $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xn.b<T> $$0x, yf $$1) {
            for (xn $$2 : $$0) {
               Optional<T> $$3 = $$2.a($$0, $$1);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            return Optional.empty();
         }
      };
   }

   default String getString() {
      StringBuilder $$0 = new StringBuilder();
      this.a($$1 -> {
         $$0.append($$1);
         return Optional.empty();
      });
      return $$0.toString();
   }

   public interface a<T> {
      Optional<T> accept(String var1);
   }

   public interface b<T> {
      Optional<T> accept(yf var1, String var2);
   }
}

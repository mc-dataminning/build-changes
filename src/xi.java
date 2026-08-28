import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xi {
   Optional<bah> a = Optional.of(bah.a);
   xi b = new xi() {
      @Override
      public <T> Optional<T> a(xi.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xi.b<T> $$0, ya $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xi.a<T> var1);

   <T> Optional<T> a(xi.b<T> var1, ya var2);

   static xi e(final String $$0) {
      return new xi() {
         @Override
         public <T> Optional<T> a(xi.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xi.b<T> $$0x, ya $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xi a(final String $$0, final ya $$1) {
      return new xi() {
         @Override
         public <T> Optional<T> a(xi.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xi.b<T> $$0x, ya $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xi a(xi... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xi a(final List<? extends xi> $$0) {
      return new xi() {
         @Override
         public <T> Optional<T> a(xi.a<T> $$0x) {
            for (xi $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xi.b<T> $$0x, ya $$1) {
            for (xi $$2 : $$0) {
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
      Optional<T> accept(ya var1, String var2);
   }
}

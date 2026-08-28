import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface ya {
   Optional<bbk> a = Optional.of(bbk.a);
   ya b = new ya() {
      @Override
      public <T> Optional<T> a(ya.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(ya.b<T> $$0, ys $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(ya.a<T> var1);

   <T> Optional<T> a(ya.b<T> var1, ys var2);

   static ya e(final String $$0) {
      return new ya() {
         @Override
         public <T> Optional<T> a(ya.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(ya.b<T> $$0x, ys $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static ya a(final String $$0, final ys $$1) {
      return new ya() {
         @Override
         public <T> Optional<T> a(ya.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(ya.b<T> $$0x, ys $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static ya a(ya... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static ya a(final List<? extends ya> $$0) {
      return new ya() {
         @Override
         public <T> Optional<T> a(ya.a<T> $$0x) {
            for (ya $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(ya.b<T> $$0x, ys $$1) {
            for (ya $$2 : $$0) {
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
      Optional<T> accept(ys var1, String var2);
   }
}

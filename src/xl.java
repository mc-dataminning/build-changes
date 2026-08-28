import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xl {
   Optional<bbh> a = Optional.of(bbh.a);
   xl b = new xl() {
      @Override
      public <T> Optional<T> a(xl.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xl.b<T> $$0, yd $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xl.a<T> var1);

   <T> Optional<T> a(xl.b<T> var1, yd var2);

   static xl e(final String $$0) {
      return new xl() {
         @Override
         public <T> Optional<T> a(xl.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xl.b<T> $$0x, yd $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xl a(final String $$0, final yd $$1) {
      return new xl() {
         @Override
         public <T> Optional<T> a(xl.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xl.b<T> $$0x, yd $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xl a(xl... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xl a(final List<? extends xl> $$0) {
      return new xl() {
         @Override
         public <T> Optional<T> a(xl.a<T> $$0x) {
            for (xl $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xl.b<T> $$0x, yd $$1) {
            for (xl $$2 : $$0) {
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
      Optional<T> accept(yd var1, String var2);
   }
}

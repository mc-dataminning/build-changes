import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xb {
   Optional<bas> a = Optional.of(bas.a);
   xb b = new xb() {
      @Override
      public <T> Optional<T> a(xb.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xb.b<T> $$0, xt $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xb.a<T> var1);

   <T> Optional<T> a(xb.b<T> var1, xt var2);

   static xb e(final String $$0) {
      return new xb() {
         @Override
         public <T> Optional<T> a(xb.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xb.b<T> $$0x, xt $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xb a(final String $$0, final xt $$1) {
      return new xb() {
         @Override
         public <T> Optional<T> a(xb.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xb.b<T> $$0x, xt $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xb a(xb... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xb a(final List<? extends xb> $$0) {
      return new xb() {
         @Override
         public <T> Optional<T> a(xb.a<T> $$0x) {
            for (xb $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xb.b<T> $$0x, xt $$1) {
            for (xb $$2 : $$0) {
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
      Optional<T> accept(xt var1, String var2);
   }
}

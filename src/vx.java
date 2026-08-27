import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface vx {
   Optional<axo> a = Optional.of(axo.a);
   vx b = new vx() {
      @Override
      public <T> Optional<T> a(vx.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(vx.b<T> $$0, wp $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(vx.a<T> var1);

   <T> Optional<T> a(vx.b<T> var1, wp var2);

   static vx e(final String $$0) {
      return new vx() {
         @Override
         public <T> Optional<T> a(vx.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vx.b<T> $$0x, wp $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static vx a(final String $$0, final wp $$1) {
      return new vx() {
         @Override
         public <T> Optional<T> a(vx.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vx.b<T> $$0x, wp $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static vx a(vx... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static vx a(final List<? extends vx> $$0) {
      return new vx() {
         @Override
         public <T> Optional<T> a(vx.a<T> $$0x) {
            for (vx $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(vx.b<T> $$0x, wp $$1) {
            for (vx $$2 : $$0) {
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
      Optional<T> accept(wp var1, String var2);
   }
}

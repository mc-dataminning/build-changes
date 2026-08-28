import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xh {
   Optional<bay> a = Optional.of(bay.a);
   xh b = new xh() {
      @Override
      public <T> Optional<T> a(xh.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xh.b<T> $$0, xz $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xh.a<T> var1);

   <T> Optional<T> a(xh.b<T> var1, xz var2);

   static xh e(final String $$0) {
      return new xh() {
         @Override
         public <T> Optional<T> a(xh.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xh.b<T> $$0x, xz $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xh a(final String $$0, final xz $$1) {
      return new xh() {
         @Override
         public <T> Optional<T> a(xh.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xh.b<T> $$0x, xz $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xh a(xh... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xh a(final List<? extends xh> $$0) {
      return new xh() {
         @Override
         public <T> Optional<T> a(xh.a<T> $$0x) {
            for (xh $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xh.b<T> $$0x, xz $$1) {
            for (xh $$2 : $$0) {
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
      Optional<T> accept(xz var1, String var2);
   }
}

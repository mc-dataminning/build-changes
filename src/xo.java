import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xo {
   Optional<bas> a = Optional.of(bas.a);
   xo b = new xo() {
      @Override
      public <T> Optional<T> a(xo.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xo.b<T> $$0, yg $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xo.a<T> var1);

   <T> Optional<T> a(xo.b<T> var1, yg var2);

   static xo e(final String $$0) {
      return new xo() {
         @Override
         public <T> Optional<T> a(xo.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xo.b<T> $$0x, yg $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xo a(final String $$0, final yg $$1) {
      return new xo() {
         @Override
         public <T> Optional<T> a(xo.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xo.b<T> $$0x, yg $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xo a(xo... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xo a(final List<? extends xo> $$0) {
      return new xo() {
         @Override
         public <T> Optional<T> a(xo.a<T> $$0x) {
            for (xo $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xo.b<T> $$0x, yg $$1) {
            for (xo $$2 : $$0) {
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
      Optional<T> accept(yg var1, String var2);
   }
}

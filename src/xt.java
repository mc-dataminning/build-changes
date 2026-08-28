import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xt {
   Optional<baa> a = Optional.of(baa.a);
   xt b = new xt() {
      @Override
      public <T> Optional<T> a(xt.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xt.b<T> $$0, yl $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xt.a<T> var1);

   <T> Optional<T> a(xt.b<T> var1, yl var2);

   static xt e(final String $$0) {
      return new xt() {
         @Override
         public <T> Optional<T> a(xt.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xt.b<T> $$0x, yl $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xt a(final String $$0, final yl $$1) {
      return new xt() {
         @Override
         public <T> Optional<T> a(xt.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xt.b<T> $$0x, yl $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xt a(xt... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xt a(final List<? extends xt> $$0) {
      return new xt() {
         @Override
         public <T> Optional<T> a(xt.a<T> $$0x) {
            for (xt $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xt.b<T> $$0x, yl $$1) {
            for (xt $$2 : $$0) {
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
      Optional<T> accept(yl var1, String var2);
   }
}

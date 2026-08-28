import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xq {
   Optional<azx> a = Optional.of(azx.a);
   xq b = new xq() {
      @Override
      public <T> Optional<T> a(xq.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xq.b<T> $$0, yi $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xq.a<T> var1);

   <T> Optional<T> a(xq.b<T> var1, yi var2);

   static xq e(final String $$0) {
      return new xq() {
         @Override
         public <T> Optional<T> a(xq.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xq.b<T> $$0x, yi $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xq a(final String $$0, final yi $$1) {
      return new xq() {
         @Override
         public <T> Optional<T> a(xq.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xq.b<T> $$0x, yi $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xq a(xq... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xq a(final List<? extends xq> $$0) {
      return new xq() {
         @Override
         public <T> Optional<T> a(xq.a<T> $$0x) {
            for (xq $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xq.b<T> $$0x, yi $$1) {
            for (xq $$2 : $$0) {
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
      Optional<T> accept(yi var1, String var2);
   }
}

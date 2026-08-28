import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xm {
   Optional<bao> a = Optional.of(bao.a);
   xm b = new xm() {
      @Override
      public <T> Optional<T> a(xm.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xm.b<T> $$0, ye $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xm.a<T> var1);

   <T> Optional<T> a(xm.b<T> var1, ye var2);

   static xm e(final String $$0) {
      return new xm() {
         @Override
         public <T> Optional<T> a(xm.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xm.b<T> $$0x, ye $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xm a(final String $$0, final ye $$1) {
      return new xm() {
         @Override
         public <T> Optional<T> a(xm.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xm.b<T> $$0x, ye $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xm a(xm... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xm a(final List<? extends xm> $$0) {
      return new xm() {
         @Override
         public <T> Optional<T> a(xm.a<T> $$0x) {
            for (xm $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xm.b<T> $$0x, ye $$1) {
            for (xm $$2 : $$0) {
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
      Optional<T> accept(ye var1, String var2);
   }
}

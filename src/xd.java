import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xd {
   Optional<azr> a = Optional.of(azr.a);
   xd b = new xd() {
      @Override
      public <T> Optional<T> a(xd.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xd.b<T> $$0, xv $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xd.a<T> var1);

   <T> Optional<T> a(xd.b<T> var1, xv var2);

   static xd e(final String $$0) {
      return new xd() {
         @Override
         public <T> Optional<T> a(xd.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xd.b<T> $$0x, xv $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xd a(final String $$0, final xv $$1) {
      return new xd() {
         @Override
         public <T> Optional<T> a(xd.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xd.b<T> $$0x, xv $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xd a(xd... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xd a(final List<? extends xd> $$0) {
      return new xd() {
         @Override
         public <T> Optional<T> a(xd.a<T> $$0x) {
            for (xd $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xd.b<T> $$0x, xv $$1) {
            for (xd $$2 : $$0) {
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
      Optional<T> accept(xv var1, String var2);
   }
}

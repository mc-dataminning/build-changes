import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface vz {
   Optional<axy> a = Optional.of(axy.a);
   vz b = new vz() {
      @Override
      public <T> Optional<T> a(vz.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(vz.b<T> $$0, wr $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(vz.a<T> var1);

   <T> Optional<T> a(vz.b<T> var1, wr var2);

   static vz e(final String $$0) {
      return new vz() {
         @Override
         public <T> Optional<T> a(vz.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vz.b<T> $$0x, wr $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static vz a(final String $$0, final wr $$1) {
      return new vz() {
         @Override
         public <T> Optional<T> a(vz.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vz.b<T> $$0x, wr $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static vz a(vz... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static vz a(final List<? extends vz> $$0) {
      return new vz() {
         @Override
         public <T> Optional<T> a(vz.a<T> $$0x) {
            for (vz $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(vz.b<T> $$0x, wr $$1) {
            for (vz $$2 : $$0) {
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
      Optional<T> accept(wr var1, String var2);
   }
}

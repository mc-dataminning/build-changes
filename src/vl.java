import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface vl {
   Optional<avt> a = Optional.of(avt.a);
   vl b = new vl() {
      @Override
      public <T> Optional<T> a(vl.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(vl.b<T> $$0, wd $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(vl.a<T> var1);

   <T> Optional<T> a(vl.b<T> var1, wd var2);

   static vl e(final String $$0) {
      return new vl() {
         @Override
         public <T> Optional<T> a(vl.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vl.b<T> $$0x, wd $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static vl a(final String $$0, final wd $$1) {
      return new vl() {
         @Override
         public <T> Optional<T> a(vl.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vl.b<T> $$0x, wd $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static vl a(vl... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static vl a(final List<? extends vl> $$0) {
      return new vl() {
         @Override
         public <T> Optional<T> a(vl.a<T> $$0x) {
            for (vl $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(vl.b<T> $$0x, wd $$1) {
            for (vl $$2 : $$0) {
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
      Optional<T> accept(wd var1, String var2);
   }
}

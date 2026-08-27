import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface vg {
   Optional<avc> a = Optional.of(avc.a);
   vg b = new vg() {
      @Override
      public <T> Optional<T> a(vg.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(vg.b<T> $$0, vy $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(vg.a<T> var1);

   <T> Optional<T> a(vg.b<T> var1, vy var2);

   static vg e(final String $$0) {
      return new vg() {
         @Override
         public <T> Optional<T> a(vg.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vg.b<T> $$0x, vy $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static vg a(final String $$0, final vy $$1) {
      return new vg() {
         @Override
         public <T> Optional<T> a(vg.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vg.b<T> $$0x, vy $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static vg a(vg... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static vg a(final List<? extends vg> $$0) {
      return new vg() {
         @Override
         public <T> Optional<T> a(vg.a<T> $$0x) {
            for (vg $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(vg.b<T> $$0x, vy $$1) {
            for (vg $$2 : $$0) {
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
      Optional<T> accept(vy var1, String var2);
   }
}

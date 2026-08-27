import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface vi {
   Optional<avm> a = Optional.of(avm.a);
   vi b = new vi() {
      @Override
      public <T> Optional<T> a(vi.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(vi.b<T> $$0, wa $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(vi.a<T> var1);

   <T> Optional<T> a(vi.b<T> var1, wa var2);

   static vi e(final String $$0) {
      return new vi() {
         @Override
         public <T> Optional<T> a(vi.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vi.b<T> $$0x, wa $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static vi a(final String $$0, final wa $$1) {
      return new vi() {
         @Override
         public <T> Optional<T> a(vi.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vi.b<T> $$0x, wa $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static vi a(vi... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static vi a(final List<? extends vi> $$0) {
      return new vi() {
         @Override
         public <T> Optional<T> a(vi.a<T> $$0x) {
            for (vi $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(vi.b<T> $$0x, wa $$1) {
            for (vi $$2 : $$0) {
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
      Optional<T> accept(wa var1, String var2);
   }
}

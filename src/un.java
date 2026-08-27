import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface un {
   Optional<atz> a = Optional.of(atz.a);
   un b = new un() {
      @Override
      public <T> Optional<T> a(un.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(un.b<T> $$0, vf $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(un.a<T> var1);

   <T> Optional<T> a(un.b<T> var1, vf var2);

   static un e(final String $$0) {
      return new un() {
         @Override
         public <T> Optional<T> a(un.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(un.b<T> $$0x, vf $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static un a(final String $$0, final vf $$1) {
      return new un() {
         @Override
         public <T> Optional<T> a(un.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(un.b<T> $$0x, vf $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static un a(un... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static un a(final List<? extends un> $$0) {
      return new un() {
         @Override
         public <T> Optional<T> a(un.a<T> $$0x) {
            for (un $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(un.b<T> $$0x, vf $$1) {
            for (un $$2 : $$0) {
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
      Optional<T> accept(vf var1, String var2);
   }
}

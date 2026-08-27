import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface va {
   Optional<aus> a = Optional.of(aus.a);
   va b = new va() {
      @Override
      public <T> Optional<T> a(va.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(va.b<T> $$0, vs $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(va.a<T> var1);

   <T> Optional<T> a(va.b<T> var1, vs var2);

   static va e(final String $$0) {
      return new va() {
         @Override
         public <T> Optional<T> a(va.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(va.b<T> $$0x, vs $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static va a(final String $$0, final vs $$1) {
      return new va() {
         @Override
         public <T> Optional<T> a(va.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(va.b<T> $$0x, vs $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static va a(va... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static va a(final List<? extends va> $$0) {
      return new va() {
         @Override
         public <T> Optional<T> a(va.a<T> $$0x) {
            for (va $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(va.b<T> $$0x, vs $$1) {
            for (va $$2 : $$0) {
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
      Optional<T> accept(vs var1, String var2);
   }
}

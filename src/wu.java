import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface wu {
   Optional<baf> a = Optional.of(baf.a);
   wu b = new wu() {
      @Override
      public <T> Optional<T> a(wu.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(wu.b<T> $$0, xm $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(wu.a<T> var1);

   <T> Optional<T> a(wu.b<T> var1, xm var2);

   static wu e(final String $$0) {
      return new wu() {
         @Override
         public <T> Optional<T> a(wu.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(wu.b<T> $$0x, xm $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static wu a(final String $$0, final xm $$1) {
      return new wu() {
         @Override
         public <T> Optional<T> a(wu.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(wu.b<T> $$0x, xm $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static wu a(wu... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static wu a(final List<? extends wu> $$0) {
      return new wu() {
         @Override
         public <T> Optional<T> a(wu.a<T> $$0x) {
            for (wu $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(wu.b<T> $$0x, xm $$1) {
            for (wu $$2 : $$0) {
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
      Optional<T> accept(xm var1, String var2);
   }
}

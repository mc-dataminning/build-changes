import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface tp {
   Optional<asx> a = Optional.of(asx.a);
   tp b = new tp() {
      @Override
      public <T> Optional<T> a(tp.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(tp.b<T> $$0, uh $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(tp.a<T> var1);

   <T> Optional<T> a(tp.b<T> var1, uh var2);

   static tp e(final String $$0) {
      return new tp() {
         @Override
         public <T> Optional<T> a(tp.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(tp.b<T> $$0x, uh $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static tp a(final String $$0, final uh $$1) {
      return new tp() {
         @Override
         public <T> Optional<T> a(tp.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(tp.b<T> $$0x, uh $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static tp a(tp... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static tp a(final List<? extends tp> $$0) {
      return new tp() {
         @Override
         public <T> Optional<T> a(tp.a<T> $$0x) {
            for (tp $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(tp.b<T> $$0x, uh $$1) {
            for (tp $$2 : $$0) {
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
      Optional<T> accept(uh var1, String var2);
   }
}

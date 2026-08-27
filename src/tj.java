import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface tj {
   Optional<asp> a = Optional.of(asp.a);
   tj b = new tj() {
      @Override
      public <T> Optional<T> a(tj.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(tj.b<T> $$0, ub $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(tj.a<T> var1);

   <T> Optional<T> a(tj.b<T> var1, ub var2);

   static tj e(final String $$0) {
      return new tj() {
         @Override
         public <T> Optional<T> a(tj.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(tj.b<T> $$0x, ub $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static tj a(final String $$0, final ub $$1) {
      return new tj() {
         @Override
         public <T> Optional<T> a(tj.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(tj.b<T> $$0x, ub $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static tj a(tj... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static tj a(final List<? extends tj> $$0) {
      return new tj() {
         @Override
         public <T> Optional<T> a(tj.a<T> $$0x) {
            for (tj $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(tj.b<T> $$0x, ub $$1) {
            for (tj $$2 : $$0) {
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
      Optional<T> accept(ub var1, String var2);
   }
}

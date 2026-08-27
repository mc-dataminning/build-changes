import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface uw {
   Optional<auo> a = Optional.of(auo.a);
   uw b = new uw() {
      @Override
      public <T> Optional<T> a(uw.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(uw.b<T> $$0, vo $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(uw.a<T> var1);

   <T> Optional<T> a(uw.b<T> var1, vo var2);

   static uw e(final String $$0) {
      return new uw() {
         @Override
         public <T> Optional<T> a(uw.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(uw.b<T> $$0x, vo $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static uw a(final String $$0, final vo $$1) {
      return new uw() {
         @Override
         public <T> Optional<T> a(uw.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(uw.b<T> $$0x, vo $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static uw a(uw... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static uw a(final List<? extends uw> $$0) {
      return new uw() {
         @Override
         public <T> Optional<T> a(uw.a<T> $$0x) {
            for (uw $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(uw.b<T> $$0x, vo $$1) {
            for (uw $$2 : $$0) {
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
      Optional<T> accept(vo var1, String var2);
   }
}

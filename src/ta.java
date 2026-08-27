import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface ta {
   Optional<apz> a = Optional.of(apz.a);
   ta b = new ta() {
      @Override
      public <T> Optional<T> a(ta.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(ta.a<T> var1);

   <T> Optional<T> a(ta.b<T> var1, ts var2);

   static ta e(final String $$0) {
      return new ta() {
         @Override
         public <T> Optional<T> a(ta.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(ta.b<T> $$0x, ts $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static ta a(final String $$0, final ts $$1) {
      return new ta() {
         @Override
         public <T> Optional<T> a(ta.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(ta.b<T> $$0x, ts $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static ta a(ta... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static ta a(final List<? extends ta> $$0) {
      return new ta() {
         @Override
         public <T> Optional<T> a(ta.a<T> $$0x) {
            for (ta $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(ta.b<T> $$0x, ts $$1) {
            for (ta $$2 : $$0) {
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
      Optional<T> accept(ts var1, String var2);
   }
}

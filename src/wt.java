import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface wt {
   Optional<baf> a = Optional.of(baf.a);
   wt b = new wt() {
      @Override
      public <T> Optional<T> a(wt.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(wt.b<T> $$0, xl $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(wt.a<T> var1);

   <T> Optional<T> a(wt.b<T> var1, xl var2);

   static wt e(final String $$0) {
      return new wt() {
         @Override
         public <T> Optional<T> a(wt.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(wt.b<T> $$0x, xl $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static wt a(final String $$0, final xl $$1) {
      return new wt() {
         @Override
         public <T> Optional<T> a(wt.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(wt.b<T> $$0x, xl $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static wt a(wt... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static wt a(final List<? extends wt> $$0) {
      return new wt() {
         @Override
         public <T> Optional<T> a(wt.a<T> $$0x) {
            for (wt $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(wt.b<T> $$0x, xl $$1) {
            for (wt $$2 : $$0) {
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
      Optional<T> accept(xl var1, String var2);
   }
}

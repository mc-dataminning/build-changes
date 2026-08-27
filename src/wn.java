import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface wn {
   Optional<ayo> a = Optional.of(ayo.a);
   wn b = new wn() {
      @Override
      public <T> Optional<T> a(wn.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(wn.b<T> $$0, xf $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(wn.a<T> var1);

   <T> Optional<T> a(wn.b<T> var1, xf var2);

   static wn e(final String $$0) {
      return new wn() {
         @Override
         public <T> Optional<T> a(wn.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(wn.b<T> $$0x, xf $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static wn a(final String $$0, final xf $$1) {
      return new wn() {
         @Override
         public <T> Optional<T> a(wn.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(wn.b<T> $$0x, xf $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static wn a(wn... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static wn a(final List<? extends wn> $$0) {
      return new wn() {
         @Override
         public <T> Optional<T> a(wn.a<T> $$0x) {
            for (wn $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(wn.b<T> $$0x, xf $$1) {
            for (wn $$2 : $$0) {
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
      Optional<T> accept(xf var1, String var2);
   }
}

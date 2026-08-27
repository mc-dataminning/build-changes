import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface wl {
   Optional<aym> a = Optional.of(aym.a);
   wl b = new wl() {
      @Override
      public <T> Optional<T> a(wl.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(wl.b<T> $$0, xd $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(wl.a<T> var1);

   <T> Optional<T> a(wl.b<T> var1, xd var2);

   static wl e(final String $$0) {
      return new wl() {
         @Override
         public <T> Optional<T> a(wl.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(wl.b<T> $$0x, xd $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static wl a(final String $$0, final xd $$1) {
      return new wl() {
         @Override
         public <T> Optional<T> a(wl.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(wl.b<T> $$0x, xd $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static wl a(wl... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static wl a(final List<? extends wl> $$0) {
      return new wl() {
         @Override
         public <T> Optional<T> a(wl.a<T> $$0x) {
            for (wl $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(wl.b<T> $$0x, xd $$1) {
            for (wl $$2 : $$0) {
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
      Optional<T> accept(xd var1, String var2);
   }
}

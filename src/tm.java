import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface tm {
   Optional<ass> a = Optional.of(ass.a);
   tm b = new tm() {
      @Override
      public <T> Optional<T> a(tm.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(tm.b<T> $$0, ue $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(tm.a<T> var1);

   <T> Optional<T> a(tm.b<T> var1, ue var2);

   static tm e(final String $$0) {
      return new tm() {
         @Override
         public <T> Optional<T> a(tm.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(tm.b<T> $$0x, ue $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static tm a(final String $$0, final ue $$1) {
      return new tm() {
         @Override
         public <T> Optional<T> a(tm.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(tm.b<T> $$0x, ue $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static tm a(tm... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static tm a(final List<? extends tm> $$0) {
      return new tm() {
         @Override
         public <T> Optional<T> a(tm.a<T> $$0x) {
            for (tm $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(tm.b<T> $$0x, ue $$1) {
            for (tm $$2 : $$0) {
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
      Optional<T> accept(ue var1, String var2);
   }
}

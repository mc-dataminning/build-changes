import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface ti {
   Optional<asn> a = Optional.of(asn.a);
   ti b = new ti() {
      @Override
      public <T> Optional<T> a(ti.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(ti.b<T> $$0, ua $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(ti.a<T> var1);

   <T> Optional<T> a(ti.b<T> var1, ua var2);

   static ti e(final String $$0) {
      return new ti() {
         @Override
         public <T> Optional<T> a(ti.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(ti.b<T> $$0x, ua $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static ti a(final String $$0, final ua $$1) {
      return new ti() {
         @Override
         public <T> Optional<T> a(ti.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(ti.b<T> $$0x, ua $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static ti a(ti... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static ti a(final List<? extends ti> $$0) {
      return new ti() {
         @Override
         public <T> Optional<T> a(ti.a<T> $$0x) {
            for (ti $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(ti.b<T> $$0x, ua $$1) {
            for (ti $$2 : $$0) {
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
      Optional<T> accept(ua var1, String var2);
   }
}

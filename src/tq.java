import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface tq {
   Optional<asx> a = Optional.of(asx.a);
   tq b = new tq() {
      @Override
      public <T> Optional<T> a(tq.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(tq.b<T> $$0, ui $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(tq.a<T> var1);

   <T> Optional<T> a(tq.b<T> var1, ui var2);

   static tq e(final String $$0) {
      return new tq() {
         @Override
         public <T> Optional<T> a(tq.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(tq.b<T> $$0x, ui $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static tq a(final String $$0, final ui $$1) {
      return new tq() {
         @Override
         public <T> Optional<T> a(tq.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(tq.b<T> $$0x, ui $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static tq a(tq... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static tq a(final List<? extends tq> $$0) {
      return new tq() {
         @Override
         public <T> Optional<T> a(tq.a<T> $$0x) {
            for (tq $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(tq.b<T> $$0x, ui $$1) {
            for (tq $$2 : $$0) {
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
      Optional<T> accept(ui var1, String var2);
   }
}

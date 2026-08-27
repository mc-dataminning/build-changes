import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface vk {
   Optional<avr> a = Optional.of(avr.a);
   vk b = new vk() {
      @Override
      public <T> Optional<T> a(vk.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(vk.b<T> $$0, wc $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(vk.a<T> var1);

   <T> Optional<T> a(vk.b<T> var1, wc var2);

   static vk e(final String $$0) {
      return new vk() {
         @Override
         public <T> Optional<T> a(vk.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vk.b<T> $$0x, wc $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static vk a(final String $$0, final wc $$1) {
      return new vk() {
         @Override
         public <T> Optional<T> a(vk.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(vk.b<T> $$0x, wc $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static vk a(vk... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static vk a(final List<? extends vk> $$0) {
      return new vk() {
         @Override
         public <T> Optional<T> a(vk.a<T> $$0x) {
            for (vk $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(vk.b<T> $$0x, wc $$1) {
            for (vk $$2 : $$0) {
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
      Optional<T> accept(wc var1, String var2);
   }
}

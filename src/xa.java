import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface xa {
   Optional<baq> a = Optional.of(baq.a);
   xa b = new xa() {
      @Override
      public <T> Optional<T> a(xa.a<T> $$0) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(xa.b<T> $$0, xs $$1) {
         return Optional.empty();
      }
   };

   <T> Optional<T> a(xa.a<T> var1);

   <T> Optional<T> a(xa.b<T> var1, xs var2);

   static xa e(final String $$0) {
      return new xa() {
         @Override
         public <T> Optional<T> a(xa.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xa.b<T> $$0x, xs $$1) {
            return $$0.accept($$1, $$0);
         }
      };
   }

   static xa a(final String $$0, final xs $$1) {
      return new xa() {
         @Override
         public <T> Optional<T> a(xa.a<T> $$0x) {
            return $$0.accept($$0);
         }

         @Override
         public <T> Optional<T> a(xa.b<T> $$0x, xs $$1x) {
            return $$0.accept($$1.a($$1), $$0);
         }
      };
   }

   static xa a(xa... $$0) {
      return a(ImmutableList.copyOf($$0));
   }

   static xa a(final List<? extends xa> $$0) {
      return new xa() {
         @Override
         public <T> Optional<T> a(xa.a<T> $$0x) {
            for (xa $$1 : $$0) {
               Optional<T> $$2 = $$1.a($$0);
               if ($$2.isPresent()) {
                  return $$2;
               }
            }

            return Optional.empty();
         }

         @Override
         public <T> Optional<T> a(xa.b<T> $$0x, xs $$1) {
            for (xa $$2 : $$0) {
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
      Optional<T> accept(xs var1, String var2);
   }
}

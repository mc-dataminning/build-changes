import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public interface gfs<T> {
   static <T> gfs<T> a() {
      return new gfs<T>() {
         @Override
         public List<T> a(String $$0) {
            return List.of();
         }

         @Override
         public List<T> b(String $$0) {
            return List.of();
         }
      };
   }

   static <T> gfs<T> a(List<T> $$0, Function<T, Stream<agm>> $$1) {
      if ($$0.isEmpty()) {
         return a();
      } else {
         final gfv<T> $$2 = new gfv<>();
         final gfv<T> $$3 = new gfv<>();

         for (T $$4 : $$0) {
            $$1.apply($$4).forEach($$3x -> {
               $$2.a($$4, $$3x.b().toLowerCase(Locale.ROOT));
               $$3.a($$4, $$3x.a().toLowerCase(Locale.ROOT));
            });
         }

         $$2.a();
         $$3.a();
         return new gfs<T>() {
            @Override
            public List<T> a(String $$0) {
               return $$2.a($$0);
            }

            @Override
            public List<T> b(String $$0) {
               return $$3.a($$0);
            }
         };
      }
   }

   List<T> a(String var1);

   List<T> b(String var1);
}

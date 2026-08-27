import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public interface gru<T> {
   static <T> gru<T> a() {
      return new gru<T>() {
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

   static <T> gru<T> a(List<T> $$0, Function<T, Stream<akm>> $$1) {
      if ($$0.isEmpty()) {
         return a();
      } else {
         final grx<T> $$2 = new grx<>();
         final grx<T> $$3 = new grx<>();

         for (T $$4 : $$0) {
            $$1.apply($$4).forEach($$3x -> {
               $$2.a($$4, $$3x.b().toLowerCase(Locale.ROOT));
               $$3.a($$4, $$3x.a().toLowerCase(Locale.ROOT));
            });
         }

         $$2.a();
         $$3.a();
         return new gru<T>() {
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

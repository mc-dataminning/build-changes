import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface lt extends Supplier<JsonElement> {
   void a(dgc<?, ?> var1);

   static lt.c a() {
      return new lt.c();
   }

   static lt a(lt... $$0) {
      return new lt.a(lt.b.a, Arrays.asList($$0));
   }

   static lt b(lt... $$0) {
      return new lt.a(lt.b.b, Arrays.asList($$0));
   }

   public static class a implements lt {
      private final lt.b a;
      private final List<lt> b;

      a(lt.b $$0, List<lt> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(dgc<?, ?> $$0) {
         this.b.forEach($$1 -> $$1.a($$0));
      }

      public JsonElement b() {
         JsonArray $$0 = new JsonArray();
         this.b.stream().map(Supplier::get).forEach($$0::add);
         JsonObject $$1 = new JsonObject();
         $$1.add(this.a.c, $$0);
         return $$1;
      }
   }

   public static enum b {
      a("AND"),
      b("OR");

      final String c;

      private b(String $$0) {
         this.c = $$0;
      }
   }

   public static class c implements lt {
      private final Map<dhe<?>, String> a = Maps.newHashMap();

      private static <T extends Comparable<T>> String a(dhe<T> $$0, Stream<T> $$1) {
         return $$1.<CharSequence>map($$0::a).collect(Collectors.joining("|"));
      }

      private static <T extends Comparable<T>> String c(dhe<T> $$0, T $$1, T[] $$2) {
         return a($$0, Stream.concat(Stream.of($$1), Stream.of($$2)));
      }

      private <T extends Comparable<T>> void a(dhe<T> $$0, String $$1) {
         String $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Tried to replace " + $$0 + " value from " + $$2 + " to " + $$1);
         }
      }

      public final <T extends Comparable<T>> lt.c a(dhe<T> $$0, T $$1) {
         this.a($$0, $$0.a($$1));
         return this;
      }

      @SafeVarargs
      public final <T extends Comparable<T>> lt.c a(dhe<T> $$0, T $$1, T... $$2) {
         this.a($$0, c($$0, $$1, $$2));
         return this;
      }

      public final <T extends Comparable<T>> lt.c b(dhe<T> $$0, T $$1) {
         this.a($$0, "!" + $$0.a($$1));
         return this;
      }

      @SafeVarargs
      public final <T extends Comparable<T>> lt.c b(dhe<T> $$0, T $$1, T... $$2) {
         this.a($$0, "!" + c($$0, $$1, $$2));
         return this;
      }

      public JsonElement b() {
         JsonObject $$0 = new JsonObject();
         this.a.forEach(($$1, $$2) -> $$0.addProperty($$1.f(), $$2));
         return $$0;
      }

      @Override
      public void a(dgc<?, ?> $$0) {
         List<dhe<?>> $$1 = this.a.keySet().stream().filter($$1x -> $$0.a($$1x.f()) != $$1x).collect(Collectors.toList());
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Properties " + $$1 + " are missing from " + $$0);
         }
      }
   }
}

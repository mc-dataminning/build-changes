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

public interface oc extends Supplier<JsonElement> {
   void a(dxp<?, ?> var1);

   static oc.c a() {
      return new oc.c();
   }

   static oc a(oc... $$0) {
      return new oc.a(oc.b.a, Arrays.asList($$0));
   }

   static oc b(oc... $$0) {
      return new oc.a(oc.b.b, Arrays.asList($$0));
   }

   public static class a implements oc {
      private final oc.b a;
      private final List<oc> b;

      a(oc.b $$0, List<oc> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(dxp<?, ?> $$0) {
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

      private b(final String $$0) {
         this.c = $$0;
      }
   }

   public static class c implements oc {
      private final Map<dyq<?>, String> a = Maps.newHashMap();

      private static <T extends Comparable<T>> String a(dyq<T> $$0, Stream<T> $$1) {
         return $$1.<CharSequence>map($$0::b).collect(Collectors.joining("|"));
      }

      private static <T extends Comparable<T>> String c(dyq<T> $$0, T $$1, T[] $$2) {
         return a($$0, Stream.concat(Stream.of($$1), Stream.of($$2)));
      }

      private <T extends Comparable<T>> void a(dyq<T> $$0, String $$1) {
         String $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Tried to replace " + $$0 + " value from " + $$2 + " to " + $$1);
         }
      }

      public final <T extends Comparable<T>> oc.c a(dyq<T> $$0, T $$1) {
         this.a($$0, $$0.b($$1));
         return this;
      }

      @SafeVarargs
      public final <T extends Comparable<T>> oc.c a(dyq<T> $$0, T $$1, T... $$2) {
         this.a($$0, c($$0, $$1, $$2));
         return this;
      }

      public final <T extends Comparable<T>> oc.c b(dyq<T> $$0, T $$1) {
         this.a($$0, "!" + $$0.b($$1));
         return this;
      }

      @SafeVarargs
      public final <T extends Comparable<T>> oc.c b(dyq<T> $$0, T $$1, T... $$2) {
         this.a($$0, "!" + c($$0, $$1, $$2));
         return this;
      }

      public JsonElement b() {
         JsonObject $$0 = new JsonObject();
         this.a.forEach(($$1, $$2) -> $$0.addProperty($$1.f(), $$2));
         return $$0;
      }

      @Override
      public void a(dxp<?, ?> $$0) {
         List<dyq<?>> $$1 = this.a.keySet().stream().filter($$1x -> $$0.a($$1x.f()) != $$1x).collect(Collectors.toList());
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Properties " + $$1 + " are missing from " + $$0);
         }
      }
   }
}

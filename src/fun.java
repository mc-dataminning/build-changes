import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class fun {
   private final ahg a;
   private final List<fun.b> b;

   public fun(ahg $$0, List<fun.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public ahg a() {
      return this.a;
   }

   public Stream<fun.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fun> {
      public fun a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ahg $$4 = new ahg(aue.i($$3, "model"));
         List<fun.b> $$5 = this.a($$3);
         return new fun($$4, $$5);
      }

      protected List<fun.b> a(JsonObject $$0) {
         Map<ahg, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = aue.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new ahg($$3.getKey()), aue.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fun.b((ahg)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final ahg a;
      private final float b;

      public b(ahg $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ahg a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

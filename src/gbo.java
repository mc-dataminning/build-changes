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

public class gbo {
   private final ajv a;
   private final List<gbo.b> b;

   public gbo(ajv $$0, List<gbo.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public ajv a() {
      return this.a;
   }

   public Stream<gbo.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<gbo> {
      public gbo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ajv $$4 = new ajv(axc.i($$3, "model"));
         List<gbo.b> $$5 = this.a($$3);
         return new gbo($$4, $$5);
      }

      protected List<gbo.b> a(JsonObject $$0) {
         Map<ajv, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = axc.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new ajv($$3.getKey()), axc.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gbo.b((ajv)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final ajv a;
      private final float b;

      public b(ajv $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ajv a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

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

public class gck {
   private final akf a;
   private final List<gck.b> b;

   public gck(akf $$0, List<gck.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public akf a() {
      return this.a;
   }

   public Stream<gck.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<gck> {
      public gck a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akf $$4 = new akf(axm.i($$3, "model"));
         List<gck.b> $$5 = this.a($$3);
         return new gck($$4, $$5);
      }

      protected List<gck.b> a(JsonObject $$0) {
         Map<akf, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = axm.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new akf($$3.getKey()), axm.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gck.b((akf)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final akf a;
      private final float b;

      public b(akf $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akf a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

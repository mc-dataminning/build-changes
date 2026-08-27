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

public class gdq {
   private final akm a;
   private final List<gdq.b> b;

   public gdq(akm $$0, List<gdq.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public akm a() {
      return this.a;
   }

   public Stream<gdq.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<gdq> {
      public gdq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akm $$4 = new akm(axu.i($$3, "model"));
         List<gdq.b> $$5 = this.a($$3);
         return new gdq($$4, $$5);
      }

      protected List<gdq.b> a(JsonObject $$0) {
         Map<akm, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = axu.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new akm($$3.getKey()), axu.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gdq.b((akm)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final akm a;
      private final float b;

      public b(akm $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akm a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

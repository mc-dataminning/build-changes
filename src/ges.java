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

public class ges {
   private final ale a;
   private final List<ges.b> b;

   public ges(ale $$0, List<ges.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public ale a() {
      return this.a;
   }

   public Stream<ges.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<ges> {
      public ges a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ale $$4 = new ale(ayn.i($$3, "model"));
         List<ges.b> $$5 = this.a($$3);
         return new ges($$4, $$5);
      }

      protected List<ges.b> a(JsonObject $$0) {
         Map<ale, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ayn.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new ale($$3.getKey()), ayn.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new ges.b((ale)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final ale a;
      private final float b;

      public b(ale $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ale a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

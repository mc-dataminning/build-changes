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

public class ggm {
   private final akt a;
   private final List<ggm.b> b;

   public ggm(akt $$0, List<ggm.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public akt a() {
      return this.a;
   }

   public Stream<ggm.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<ggm> {
      public ggm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akt $$4 = new akt(ayc.i($$3, "model"));
         List<ggm.b> $$5 = this.a($$3);
         return new ggm($$4, $$5);
      }

      protected List<ggm.b> a(JsonObject $$0) {
         Map<akt, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ayc.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new akt($$3.getKey()), ayc.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new ggm.b((akt)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final akt a;
      private final float b;

      public b(akt $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akt a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

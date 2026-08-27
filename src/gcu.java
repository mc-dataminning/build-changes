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

public class gcu {
   private final akh a;
   private final List<gcu.b> b;

   public gcu(akh $$0, List<gcu.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public akh a() {
      return this.a;
   }

   public Stream<gcu.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<gcu> {
      public gcu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akh $$4 = new akh(axp.i($$3, "model"));
         List<gcu.b> $$5 = this.a($$3);
         return new gcu($$4, $$5);
      }

      protected List<gcu.b> a(JsonObject $$0) {
         Map<akh, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = axp.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new akh($$3.getKey()), axp.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gcu.b((akh)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final akh a;
      private final float b;

      public b(akh $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akh a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

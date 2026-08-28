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

public class geu {
   private final alf a;
   private final List<geu.b> b;

   public geu(alf $$0, List<geu.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public alf a() {
      return this.a;
   }

   public Stream<geu.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<geu> {
      public geu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         alf $$4 = new alf(ayp.i($$3, "model"));
         List<geu.b> $$5 = this.a($$3);
         return new geu($$4, $$5);
      }

      protected List<geu.b> a(JsonObject $$0) {
         Map<alf, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ayp.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new alf($$3.getKey()), ayp.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new geu.b((alf)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final alf a;
      private final float b;

      public b(alf $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alf a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

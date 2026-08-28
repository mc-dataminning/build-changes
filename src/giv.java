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

public class giv {
   private final alc a;
   private final List<giv.b> b;

   public giv(alc $$0, List<giv.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public alc a() {
      return this.a;
   }

   public Stream<giv.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<giv> {
      public giv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         alc $$4 = alc.a(ayt.i($$3, "model"));
         List<giv.b> $$5 = this.a($$3);
         return new giv($$4, $$5);
      }

      protected List<giv.b> a(JsonObject $$0) {
         Map<alc, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ayt.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(alc.a($$3.getKey()), ayt.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new giv.b((alc)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final alc a;
      private final float b;

      public b(alc $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alc a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

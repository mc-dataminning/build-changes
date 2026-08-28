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

public class gfz {
   private final akq a;
   private final List<gfz.b> b;

   public gfz(akq $$0, List<gfz.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public akq a() {
      return this.a;
   }

   public Stream<gfz.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<gfz> {
      public gfz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akq $$4 = akq.a(ayd.i($$3, "model"));
         List<gfz.b> $$5 = this.a($$3);
         return new gfz($$4, $$5);
      }

      protected List<gfz.b> a(JsonObject $$0) {
         Map<akq, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ayd.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(akq.a($$3.getKey()), ayd.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gfz.b((akq)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final akq a;
      private final float b;

      public b(akq $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akq a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

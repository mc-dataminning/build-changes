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

public class gep {
   private final alb a;
   private final List<gep.b> b;

   public gep(alb $$0, List<gep.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public alb a() {
      return this.a;
   }

   public Stream<gep.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<gep> {
      public gep a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         alb $$4 = new alb(ayk.i($$3, "model"));
         List<gep.b> $$5 = this.a($$3);
         return new gep($$4, $$5);
      }

      protected List<gep.b> a(JsonObject $$0) {
         Map<alb, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ayk.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new alb($$3.getKey()), ayk.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gep.b((alb)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final alb a;
      private final float b;

      public b(alb $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alb a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

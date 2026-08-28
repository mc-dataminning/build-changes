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

public class gig {
   private final alb a;
   private final List<gig.b> b;

   public gig(alb $$0, List<gig.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public alb a() {
      return this.a;
   }

   public Stream<gig.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<gig> {
      public gig a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         alb $$4 = alb.a(ays.i($$3, "model"));
         List<gig.b> $$5 = this.a($$3);
         return new gig($$4, $$5);
      }

      protected List<gig.b> a(JsonObject $$0) {
         Map<alb, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ays.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(alb.a($$3.getKey()), ays.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gig.b((alb)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
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

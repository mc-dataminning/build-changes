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

public class gfl {
   private final akk a;
   private final List<gfl.b> b;

   public gfl(akk $$0, List<gfl.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public akk a() {
      return this.a;
   }

   public Stream<gfl.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<gfl> {
      public gfl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akk $$4 = new akk(axw.i($$3, "model"));
         List<gfl.b> $$5 = this.a($$3);
         return new gfl($$4, $$5);
      }

      protected List<gfl.b> a(JsonObject $$0) {
         Map<akk, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = axw.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new akk($$3.getKey()), axw.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new gfl.b((akk)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final akk a;
      private final float b;

      public b(akk $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akk a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

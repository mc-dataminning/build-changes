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

public class fws {
   private final aiy a;
   private final List<fws.b> b;

   public fws(aiy $$0, List<fws.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public aiy a() {
      return this.a;
   }

   public Stream<fws.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fws> {
      public fws a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         aiy $$4 = new aiy(avx.i($$3, "model"));
         List<fws.b> $$5 = this.a($$3);
         return new fws($$4, $$5);
      }

      protected List<fws.b> a(JsonObject $$0) {
         Map<aiy, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = avx.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new aiy($$3.getKey()), avx.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fws.b((aiy)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final aiy a;
      private final float b;

      public b(aiy $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aiy a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

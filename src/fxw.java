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

public class fxw {
   private final ajc a;
   private final List<fxw.b> b;

   public fxw(ajc $$0, List<fxw.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public ajc a() {
      return this.a;
   }

   public Stream<fxw.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fxw> {
      public fxw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ajc $$4 = new ajc(awc.i($$3, "model"));
         List<fxw.b> $$5 = this.a($$3);
         return new fxw($$4, $$5);
      }

      protected List<fxw.b> a(JsonObject $$0) {
         Map<ajc, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = awc.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new ajc($$3.getKey()), awc.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fxw.b((ajc)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final ajc a;
      private final float b;

      public b(ajc $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ajc a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

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

public class fyy {
   private final ajh a;
   private final List<fyy.b> b;

   public fyy(ajh $$0, List<fyy.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public ajh a() {
      return this.a;
   }

   public Stream<fyy.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fyy> {
      public fyy a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ajh $$4 = new ajh(awm.i($$3, "model"));
         List<fyy.b> $$5 = this.a($$3);
         return new fyy($$4, $$5);
      }

      protected List<fyy.b> a(JsonObject $$0) {
         Map<ajh, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = awm.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new ajh($$3.getKey()), awm.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fyy.b((ajh)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final ajh a;
      private final float b;

      public b(ajh $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ajh a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

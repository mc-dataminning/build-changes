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

public class ggd {
   private final akr a;
   private final List<ggd.b> b;

   public ggd(akr $$0, List<ggd.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public akr a() {
      return this.a;
   }

   public Stream<ggd.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<ggd> {
      public ggd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akr $$4 = akr.a(aye.i($$3, "model"));
         List<ggd.b> $$5 = this.a($$3);
         return new ggd($$4, $$5);
      }

      protected List<ggd.b> a(JsonObject $$0) {
         Map<akr, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = aye.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(akr.a($$3.getKey()), aye.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new ggd.b((akr)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final akr a;
      private final float b;

      public b(akr $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akr a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}

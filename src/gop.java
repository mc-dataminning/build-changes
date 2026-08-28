import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record gop(List<gos> a) implements gor {
   public gop(List<gos> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dxq $$0) {
      return this;
   }

   @Override
   public void a(hij.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public hhr a(hia $$0) {
      if (this.a.size() == 1) {
         gos $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         brj.a<hhr> $$2 = brj.b();

         for (gos $$3 : this.a) {
            hhr $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hin($$2.a());
      }
   }

   public static class a implements JsonDeserializer<gop> {
      public gop a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gos> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gos)$$2.deserialize($$5, gos.class));
            }
         } else {
            $$3.add((gos)$$2.deserialize($$0, gos.class));
         }

         return new gop($$3);
      }
   }
}

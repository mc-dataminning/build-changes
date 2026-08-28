import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record gnp(List<gns> a) implements gnr {
   public gnp(List<gns> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dww $$0) {
      return this;
   }

   @Override
   public void a(hhj.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public hgr a(hha $$0) {
      if (this.a.size() == 1) {
         gns $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         bqr.a<hgr> $$2 = bqr.a();

         for (gns $$3 : this.a) {
            hgr $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hhn($$2.a());
      }
   }

   public static class a implements JsonDeserializer<gnp> {
      public gnp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gns> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gns)$$2.deserialize($$5, gns.class));
            }
         } else {
            $$3.add((gns)$$2.deserialize($$0, gns.class));
         }

         return new gnp($$3);
      }
   }
}

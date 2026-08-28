import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record grk(List<grn> a) implements grm {
   public grk(List<grn> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dzz $$0) {
      return this;
   }

   @Override
   public void a(hlh.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public hkp a(hky $$0) {
      if (this.a.size() == 1) {
         grn $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         bsm.a<hkp> $$2 = bsm.b();

         for (grn $$3 : this.a) {
            hkp $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hll($$2.a());
      }
   }

   public static class a implements JsonDeserializer<grk> {
      public grk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<grn> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((grn)$$2.deserialize($$5, grn.class));
            }
         } else {
            $$3.add((grn)$$2.deserialize($$0, grn.class));
         }

         return new grk($$3);
      }
   }
}

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record grs(List<grv> a) implements gru {
   public grs(List<grv> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(eah $$0) {
      return this;
   }

   @Override
   public void a(hlp.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public hkx a(hlg $$0) {
      if (this.a.size() == 1) {
         grv $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         bso.a<hkx> $$2 = bso.b();

         for (grv $$3 : this.a) {
            hkx $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hlt($$2.a());
      }
   }

   public static class a implements JsonDeserializer<grs> {
      public grs a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<grv> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((grv)$$2.deserialize($$5, grv.class));
            }
         } else {
            $$3.add((grv)$$2.deserialize($$0, grv.class));
         }

         return new grs($$3);
      }
   }
}

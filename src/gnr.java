import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record gnr(List<gnu> a) implements gnt {
   public gnr(List<gnu> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dwy $$0) {
      return this;
   }

   @Override
   public void a(hhl.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public hgt a(hhc $$0) {
      if (this.a.size() == 1) {
         gnu $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         bqt.a<hgt> $$2 = bqt.a();

         for (gnu $$3 : this.a) {
            hgt $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hhp($$2.a());
      }
   }

   public static class a implements JsonDeserializer<gnr> {
      public gnr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gnu> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gnu)$$2.deserialize($$5, gnu.class));
            }
         } else {
            $$3.add((gnu)$$2.deserialize($$0, gnu.class));
         }

         return new gnr($$3);
      }
   }
}

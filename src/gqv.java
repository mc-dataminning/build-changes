import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record gqv(List<gqy> a) implements gqx {
   public gqv(List<gqy> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dzo $$0) {
      return this;
   }

   @Override
   public void a(hkr.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public hjz a(hki $$0) {
      if (this.a.size() == 1) {
         gqy $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         bsj.a<hjz> $$2 = bsj.b();

         for (gqy $$3 : this.a) {
            hjz $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hkv($$2.a());
      }
   }

   public static class a implements JsonDeserializer<gqv> {
      public gqv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gqy> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gqy)$$2.deserialize($$5, gqy.class));
            }
         } else {
            $$3.add((gqy)$$2.deserialize($$0, gqy.class));
         }

         return new gqv($$3);
      }
   }
}

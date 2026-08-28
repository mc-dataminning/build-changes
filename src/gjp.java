import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

public record gjp(List<gjr> a) implements gjq {
   public gjp(List<gjr> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dvd $$0) {
      return this;
   }

   @Override
   public void a(han.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.a()));
   }

   @Override
   public gzu a(had $$0, Function<hab, gxs> $$1, haj $$2) {
      if (this.a.size() == 1) {
         gjr $$3 = this.a.getFirst();
         return $$0.a($$3.a(), $$3);
      } else {
         bqg.a<gzu> $$4 = bqg.a();

         for (gjr $$5 : this.a) {
            gzu $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return new hao($$4.a());
      }
   }

   public static class a implements JsonDeserializer<gjp> {
      public gjp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gjr> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gjr)$$2.deserialize($$5, gjr.class));
            }
         } else {
            $$3.add((gjr)$$2.deserialize($$0, gjr.class));
         }

         return new gjp($$3);
      }
   }
}

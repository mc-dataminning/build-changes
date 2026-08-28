import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

public record gka(List<gkc> a) implements gkb {
   public gka(List<gkc> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dvj $$0) {
      return this;
   }

   @Override
   public void a(hay.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.a()));
   }

   @Override
   public haf a(hao $$0, Function<ham, gyd> $$1, hau $$2) {
      if (this.a.size() == 1) {
         gkc $$3 = this.a.getFirst();
         return $$0.a($$3.a(), $$3);
      } else {
         bql.a<haf> $$4 = bql.a();

         for (gkc $$5 : this.a) {
            haf $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return new haz($$4.a());
      }
   }

   public static class a implements JsonDeserializer<gka> {
      public gka a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gkc> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gkc)$$2.deserialize($$5, gkc.class));
            }
         } else {
            $$3.add((gkc)$$2.deserialize($$0, gkc.class));
         }

         return new gka($$3);
      }
   }
}

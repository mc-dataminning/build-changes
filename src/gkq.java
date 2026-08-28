import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

public record gkq(List<gks> a) implements gkr {
   public gkq(List<gks> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dvo $$0) {
      return this;
   }

   @Override
   public void a(hbo.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.a()));
   }

   @Override
   public hav a(hbe $$0, Function<hbc, gyt> $$1, hbk $$2) {
      if (this.a.size() == 1) {
         gks $$3 = this.a.getFirst();
         return $$0.a($$3.a(), $$3);
      } else {
         bqp.a<hav> $$4 = bqp.a();

         for (gks $$5 : this.a) {
            hav $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return new hbp($$4.a());
      }
   }

   public static class a implements JsonDeserializer<gkq> {
      public gkq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gks> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gks)$$2.deserialize($$5, gks.class));
            }
         } else {
            $$3.add((gks)$$2.deserialize($$0, gks.class));
         }

         return new gkq($$3);
      }
   }
}

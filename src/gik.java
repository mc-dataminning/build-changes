import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public record gik(List<gim> a) implements gil {
   @Override
   public Object a(dua $$0) {
      return this;
   }

   @Override
   public void a(gzc.b $$0, gzc.a $$1) {
      this.a.forEach($$1x -> $$0.a($$1x.a()));
   }

   @Nullable
   @Override
   public gym a(gys $$0, Function<gyq, gwk> $$1, gyy $$2) {
      if (this.a.isEmpty()) {
         return null;
      } else {
         gzd.a $$3 = new gzd.a();

         for (gim $$4 : this.a) {
            gym $$5 = $$0.a($$4.a(), $$4);
            $$3.a($$5, $$4.d());
         }

         return $$3.a();
      }
   }

   public static class a implements JsonDeserializer<gik> {
      public gik a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gim> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gim)$$2.deserialize($$5, gim.class));
            }
         } else {
            $$3.add((gim)$$2.deserialize($$0, gim.class));
         }

         return new gik($$3);
      }
   }
}

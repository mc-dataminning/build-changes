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

public record giz(List<gjb> a) implements gja {
   @Override
   public Object a(duo $$0) {
      return this;
   }

   @Override
   public void a(gzt.b $$0, gzt.a $$1) {
      this.a.forEach($$1x -> $$0.a($$1x.a()));
   }

   @Nullable
   @Override
   public gzd a(gzj $$0, Function<gzh, gxb> $$1, gzp $$2) {
      if (this.a.isEmpty()) {
         return null;
      } else {
         gzu.a $$3 = new gzu.a();

         for (gjb $$4 : this.a) {
            gzd $$5 = $$0.a($$4.a(), $$4);
            $$3.a($$5, $$4.d());
         }

         return $$3.a();
      }
   }

   public static class a implements JsonDeserializer<giz> {
      public giz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gjb> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gjb)$$2.deserialize($$5, gjb.class));
            }
         } else {
            $$3.add((gjb)$$2.deserialize($$0, gjb.class));
         }

         return new giz($$3);
      }
   }
}

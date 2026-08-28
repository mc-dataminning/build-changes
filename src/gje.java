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

public record gje(List<gjg> a) implements gjf {
   @Override
   public Object a(dus $$0) {
      return this;
   }

   @Override
   public void a(gzy.b $$0, gzy.a $$1) {
      this.a.forEach($$1x -> $$0.a($$1x.a()));
   }

   @Nullable
   @Override
   public gzi a(gzo $$0, Function<gzm, gxg> $$1, gzu $$2) {
      if (this.a.isEmpty()) {
         return null;
      } else {
         gzz.a $$3 = new gzz.a();

         for (gjg $$4 : this.a) {
            gzi $$5 = $$0.a($$4.a(), $$4);
            $$3.a($$5, $$4.d());
         }

         return $$3.a();
      }
   }

   public static class a implements JsonDeserializer<gje> {
      public gje a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gjg> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gjg)$$2.deserialize($$5, gjg.class));
            }
         } else {
            $$3.add((gjg)$$2.deserialize($$0, gjg.class));
         }

         return new gje($$3);
      }
   }
}

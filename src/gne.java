import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

public record gne(List<gng> a) implements gnf {
   public gne(List<gng> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dxv $$0) {
      return this;
   }

   @Override
   public void a(heg.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.a()));
   }

   @Override
   public hdn a(hdw $$0, Function<hdu, hbl> $$1, hec $$2) {
      if (this.a.size() == 1) {
         gng $$3 = this.a.getFirst();
         return $$0.a($$3.a(), $$3);
      } else {
         brr.a<hdn> $$4 = brr.a();

         for (gng $$5 : this.a) {
            hdn $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return new heh($$4.a());
      }
   }

   public static class a implements JsonDeserializer<gne> {
      public gne a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gng> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gng)$$2.deserialize($$5, gng.class));
            }
         } else {
            $$3.add((gng)$$2.deserialize($$0, gng.class));
         }

         return new gne($$3);
      }
   }
}

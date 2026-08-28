import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

public record gmx(List<gmz> a) implements gmy {
   public gmx(List<gmz> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dxn $$0) {
      return this;
   }

   @Override
   public void a(hdz.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.a()));
   }

   @Override
   public hdg a(hdp $$0, Function<hdn, hbe> $$1, hdv $$2) {
      if (this.a.size() == 1) {
         gmz $$3 = this.a.getFirst();
         return $$0.a($$3.a(), $$3);
      } else {
         brm.a<hdg> $$4 = brm.a();

         for (gmz $$5 : this.a) {
            hdg $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return new hea($$4.a());
      }
   }

   public static class a implements JsonDeserializer<gmx> {
      public gmx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gmz> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gmz)$$2.deserialize($$5, gmz.class));
            }
         } else {
            $$3.add((gmz)$$2.deserialize($$0, gmz.class));
         }

         return new gmx($$3);
      }
   }
}

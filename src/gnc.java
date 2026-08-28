import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

public record gnc(List<gne> a) implements gnd {
   public gnc(List<gne> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dxu $$0) {
      return this;
   }

   @Override
   public void a(hee.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.a()));
   }

   @Override
   public hdl a(hdu $$0, Function<hds, hbj> $$1, hea $$2) {
      if (this.a.size() == 1) {
         gne $$3 = this.a.getFirst();
         return $$0.a($$3.a(), $$3);
      } else {
         brq.a<hdl> $$4 = brq.a();

         for (gne $$5 : this.a) {
            hdl $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return new hef($$4.a());
      }
   }

   public static class a implements JsonDeserializer<gnc> {
      public gnc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gne> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gne)$$2.deserialize($$5, gne.class));
            }
         } else {
            $$3.add((gne)$$2.deserialize($$0, gne.class));
         }

         return new gnc($$3);
      }
   }
}

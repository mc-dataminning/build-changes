import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

public record gnd(List<gnf> a) implements gne {
   public gnd(List<gnf> a) {
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
   public void a(hef.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.a()));
   }

   @Override
   public hdm a(hdv $$0, Function<hdt, hbk> $$1, heb $$2) {
      if (this.a.size() == 1) {
         gnf $$3 = this.a.getFirst();
         return $$0.a($$3.a(), $$3);
      } else {
         brq.a<hdm> $$4 = brq.a();

         for (gnf $$5 : this.a) {
            hdm $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return new heg($$4.a());
      }
   }

   public static class a implements JsonDeserializer<gnd> {
      public gnd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gnf> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gnf)$$2.deserialize($$5, gnf.class));
            }
         } else {
            $$3.add((gnf)$$2.deserialize($$0, gnf.class));
         }

         return new gnd($$3);
      }
   }
}

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

public record gmz(List<gnb> a) implements gna {
   public gmz(List<gnb> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dxo $$0) {
      return this;
   }

   @Override
   public void a(heb.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.a()));
   }

   @Override
   public hdi a(hdr $$0, Function<hdp, hbg> $$1, hdx $$2) {
      if (this.a.size() == 1) {
         gnb $$3 = this.a.getFirst();
         return $$0.a($$3.a(), $$3);
      } else {
         bri.a<hdi> $$4 = bri.a();

         for (gnb $$5 : this.a) {
            hdi $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return new hec($$4.a());
      }
   }

   public static class a implements JsonDeserializer<gmz> {
      public gmz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gnb> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gnb)$$2.deserialize($$5, gnb.class));
            }
         } else {
            $$3.add((gnb)$$2.deserialize($$0, gnb.class));
         }

         return new gmz($$3);
      }
   }
}

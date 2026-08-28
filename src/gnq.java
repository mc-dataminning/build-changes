import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record gnq(List<gnt> a) implements gns {
   public gnq(List<gnt> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dwx $$0) {
      return this;
   }

   @Override
   public void a(hhk.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public hgs a(hhb $$0) {
      if (this.a.size() == 1) {
         gnt $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         bqs.a<hgs> $$2 = bqs.a();

         for (gnt $$3 : this.a) {
            hgs $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hho($$2.a());
      }
   }

   public static class a implements JsonDeserializer<gnq> {
      public gnq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gnt> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gnt)$$2.deserialize($$5, gnt.class));
            }
         } else {
            $$3.add((gnt)$$2.deserialize($$0, gnt.class));
         }

         return new gnq($$3);
      }
   }
}

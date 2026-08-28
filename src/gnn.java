import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record gnn(List<gnq> a) implements gnp {
   public gnn(List<gnq> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dwv $$0) {
      return this;
   }

   @Override
   public void a(hhe.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public hgm a(hgv $$0) {
      if (this.a.size() == 1) {
         gnq $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         bqq.a<hgm> $$2 = bqq.a();

         for (gnq $$3 : this.a) {
            hgm $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hhi($$2.a());
      }
   }

   public static class a implements JsonDeserializer<gnn> {
      public gnn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gnq> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gnq)$$2.deserialize($$5, gnq.class));
            }
         } else {
            $$3.add((gnq)$$2.deserialize($$0, gnq.class));
         }

         return new gnn($$3);
      }
   }
}

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public record gpq(List<gpt> a) implements gps {
   public gpq(List<gpt> a) {
      if (a.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   @Override
   public Object a(dym $$0) {
      return this;
   }

   @Override
   public void a(hjk.a $$0) {
      this.a.forEach($$1 -> $$0.a($$1.c()));
   }

   @Override
   public his a(hjb $$0) {
      if (this.a.size() == 1) {
         gpt $$1 = this.a.getFirst();
         return $$0.a($$1.c(), $$1);
      } else {
         bsb.a<his> $$2 = bsb.b();

         for (gpt $$3 : this.a) {
            his $$4 = $$0.a($$3.c(), $$3);
            $$2.a($$4, $$3.f());
         }

         return new hjo($$2.a());
      }
   }

   public static class a implements JsonDeserializer<gpq> {
      public gpq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gpt> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.isEmpty()) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gpt)$$2.deserialize($$5, gpt.class));
            }
         } else {
            $$3.add((gpt)$$2.deserialize($$0, gpt.class));
         }

         return new gpq($$3);
      }
   }
}

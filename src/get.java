import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class get implements grg {
   private final List<geu> a;

   public get(List<geu> $$0) {
      this.a = $$0;
   }

   public List<geu> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof get $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<alb> f() {
      return this.a().stream().map(geu::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<alb, grg> $$0) {
      this.a().stream().map(geu::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gqv a(gqz $$0, Function<gqy, gou> $$1, grd $$2, alb $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         grh.a $$4 = new grh.a();

         for (geu $$5 : this.a()) {
            gqv $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<get> {
      public get a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<geu> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((geu)$$2.deserialize($$5, geu.class));
            }
         } else {
            $$3.add((geu)$$2.deserialize($$0, geu.class));
         }

         return new get($$3);
      }
   }
}

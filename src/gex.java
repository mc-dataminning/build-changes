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

public class gex implements grk {
   private final List<gey> a;

   public gex(List<gey> $$0) {
      this.a = $$0;
   }

   public List<gey> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gex $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ale> f() {
      return this.a().stream().map(gey::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ale, grk> $$0) {
      this.a().stream().map(gey::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gqz a(grd $$0, Function<grc, goy> $$1, grh $$2, ale $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         grl.a $$4 = new grl.a();

         for (gey $$5 : this.a()) {
            gqz $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gex> {
      public gex a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gey> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gey)$$2.deserialize($$5, gey.class));
            }
         } else {
            $$3.add((gey)$$2.deserialize($$0, gey.class));
         }

         return new gex($$3);
      }
   }
}

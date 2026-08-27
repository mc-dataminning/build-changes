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

public class gcy implements gpk {
   private final List<gcz> a;

   public gcy(List<gcz> $$0) {
      this.a = $$0;
   }

   public List<gcz> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gcy $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<akh> f() {
      return this.a().stream().map(gcz::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akh, gpk> $$0) {
      this.a().stream().map(gcz::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public goz a(gpd $$0, Function<gpc, gmy> $$1, gph $$2, akh $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gpl.a $$4 = new gpl.a();

         for (gcz $$5 : this.a()) {
            goz $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gcy> {
      public gcy a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gcz> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gcz)$$2.deserialize($$5, gcz.class));
            }
         } else {
            $$3.add((gcz)$$2.deserialize($$0, gcz.class));
         }

         return new gcy($$3);
      }
   }
}

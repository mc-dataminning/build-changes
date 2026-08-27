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

public class fvd implements ghm {
   private final List<fve> a;

   public fvd(List<fve> $$0) {
      this.a = $$0;
   }

   public List<fve> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fvd $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ahh> f() {
      return this.a().stream().map(fve::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ahh, ghm> $$0) {
      this.a().stream().map(fve::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public ghb a(ghf $$0, Function<ghe, gfb> $$1, ghj $$2, ahh $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         ghn.a $$4 = new ghn.a();

         for (fve $$5 : this.a()) {
            ghb $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fvd> {
      public fvd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fve> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fve)$$2.deserialize($$5, fve.class));
            }
         } else {
            $$3.add((fve)$$2.deserialize($$0, fve.class));
         }

         return new fvd($$3);
      }
   }
}

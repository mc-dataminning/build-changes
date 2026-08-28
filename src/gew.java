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

public class gew implements grj {
   private final List<gex> a;

   public gew(List<gex> $$0) {
      this.a = $$0;
   }

   public List<gex> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gew $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ale> f() {
      return this.a().stream().map(gex::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ale, grj> $$0) {
      this.a().stream().map(gex::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gqy a(grc $$0, Function<grb, gox> $$1, grg $$2, ale $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         grk.a $$4 = new grk.a();

         for (gex $$5 : this.a()) {
            gqy $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gew> {
      public gew a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gex> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gex)$$2.deserialize($$5, gex.class));
            }
         } else {
            $$3.add((gex)$$2.deserialize($$0, gex.class));
         }

         return new gew($$3);
      }
   }
}

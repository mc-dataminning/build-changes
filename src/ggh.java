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

public class ggh implements gsw {
   private final List<ggi> a;

   public ggh(List<ggi> $$0) {
      this.a = $$0;
   }

   public List<ggi> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof ggh $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<akr> f() {
      return this.a().stream().map(ggi::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akr, gsw> $$0) {
      this.a().stream().map(ggi::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gsk a(gsp $$0, Function<gso, gqj> $$1, gst $$2) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gsx.a $$3 = new gsx.a();

         for (ggi $$4 : this.a()) {
            gsk $$5 = $$0.a($$4.a(), $$4);
            $$3.a($$5, $$4.d());
         }

         return $$3.a();
      }
   }

   public static class a implements JsonDeserializer<ggh> {
      public ggh a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<ggi> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((ggi)$$2.deserialize($$5, ggi.class));
            }
         } else {
            $$3.add((ggi)$$2.deserialize($$0, ggi.class));
         }

         return new ggh($$3);
      }
   }
}

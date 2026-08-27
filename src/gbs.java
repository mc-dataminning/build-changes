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

public class gbs implements god {
   private final List<gbt> a;

   public gbs(List<gbt> $$0) {
      this.a = $$0;
   }

   public List<gbt> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gbs $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ajv> f() {
      return this.a().stream().map(gbt::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajv, god> $$0) {
      this.a().stream().map(gbt::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gns a(gnw $$0, Function<gnv, gls> $$1, goa $$2, ajv $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         goe.a $$4 = new goe.a();

         for (gbt $$5 : this.a()) {
            gns $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gbs> {
      public gbs a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gbt> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gbt)$$2.deserialize($$5, gbt.class));
            }
         } else {
            $$3.add((gbt)$$2.deserialize($$0, gbt.class));
         }

         return new gbs($$3);
      }
   }
}

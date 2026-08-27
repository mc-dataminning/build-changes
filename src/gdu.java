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

public class gdu implements gqh {
   private final List<gdv> a;

   public gdu(List<gdv> $$0) {
      this.a = $$0;
   }

   public List<gdv> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gdu $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<akm> f() {
      return this.a().stream().map(gdv::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akm, gqh> $$0) {
      this.a().stream().map(gdv::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gpw a(gqa $$0, Function<gpz, gnv> $$1, gqe $$2, akm $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gqi.a $$4 = new gqi.a();

         for (gdv $$5 : this.a()) {
            gpw $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gdu> {
      public gdu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gdv> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gdv)$$2.deserialize($$5, gdv.class));
            }
         } else {
            $$3.add((gdv)$$2.deserialize($$0, gdv.class));
         }

         return new gdu($$3);
      }
   }
}

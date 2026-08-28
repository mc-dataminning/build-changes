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

public class gfn implements gsa {
   private final List<gfo> a;

   public gfn(List<gfo> $$0) {
      this.a = $$0;
   }

   public List<gfo> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gfn $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<akk> f() {
      return this.a().stream().map(gfo::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akk, gsa> $$0) {
      this.a().stream().map(gfo::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public grp a(grt $$0, Function<grs, gpo> $$1, grx $$2, akk $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gsb.a $$4 = new gsb.a();

         for (gfo $$5 : this.a()) {
            grp $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gfn> {
      public gfn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gfo> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gfo)$$2.deserialize($$5, gfo.class));
            }
         } else {
            $$3.add((gfo)$$2.deserialize($$0, gfo.class));
         }

         return new gfn($$3);
      }
   }
}

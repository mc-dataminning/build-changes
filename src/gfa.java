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

public class gfa implements grn {
   private final List<gfb> a;

   public gfa(List<gfb> $$0) {
      this.a = $$0;
   }

   public List<gfb> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gfa $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<alf> f() {
      return this.a().stream().map(gfb::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<alf, grn> $$0) {
      this.a().stream().map(gfb::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public grc a(grg $$0, Function<grf, gpb> $$1, grk $$2, alf $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gro.a $$4 = new gro.a();

         for (gfb $$5 : this.a()) {
            grc $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gfa> {
      public gfa a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gfb> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gfb)$$2.deserialize($$5, gfb.class));
            }
         } else {
            $$3.add((gfb)$$2.deserialize($$0, gfb.class));
         }

         return new gfa($$3);
      }
   }
}

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

public class gez implements grm {
   private final List<gfa> a;

   public gez(List<gfa> $$0) {
      this.a = $$0;
   }

   public List<gfa> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gez $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<alf> f() {
      return this.a().stream().map(gfa::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<alf, grm> $$0) {
      this.a().stream().map(gfa::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public grb a(grf $$0, Function<gre, gpa> $$1, grj $$2, alf $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         grn.a $$4 = new grn.a();

         for (gfa $$5 : this.a()) {
            grb $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gez> {
      public gez a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gfa> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gfa)$$2.deserialize($$5, gfa.class));
            }
         } else {
            $$3.add((gfa)$$2.deserialize($$0, gfa.class));
         }

         return new gez($$3);
      }
   }
}

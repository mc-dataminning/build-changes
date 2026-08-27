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

public class fya implements gkk {
   private final List<fyb> a;

   public fya(List<fyb> $$0) {
      this.a = $$0;
   }

   public List<fyb> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fya $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ajc> f() {
      return this.a().stream().map(fyb::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajc, gkk> $$0) {
      this.a().stream().map(fyb::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gjz a(gkd $$0, Function<gkc, ghz> $$1, gkh $$2, ajc $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gkl.a $$4 = new gkl.a();

         for (fyb $$5 : this.a()) {
            gjz $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fya> {
      public fya a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fyb> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fyb)$$2.deserialize($$5, fyb.class));
            }
         } else {
            $$3.add((fyb)$$2.deserialize($$0, fyb.class));
         }

         return new fya($$3);
      }
   }
}

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

public class fuj implements ggr {
   private final List<fuk> a;

   public fuj(List<fuk> $$0) {
      this.a = $$0;
   }

   public List<fuk> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fuj $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ahd> f() {
      return this.a().stream().map(fuk::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ahd, ggr> $$0) {
      this.a().stream().map(fuk::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public ggg a(ggk $$0, Function<ggj, gef> $$1, ggo $$2, ahd $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         ggs.a $$4 = new ggs.a();

         for (fuk $$5 : this.a()) {
            ggg $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fuj> {
      public fuj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fuk> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fuk)$$2.deserialize($$5, fuk.class));
            }
         } else {
            $$3.add((fuk)$$2.deserialize($$0, fuk.class));
         }

         return new fuj($$3);
      }
   }
}

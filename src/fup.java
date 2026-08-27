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

public class fup implements ggw {
   private final List<fuq> a;

   public fup(List<fuq> $$0) {
      this.a = $$0;
   }

   public List<fuq> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fup $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ahg> f() {
      return this.a().stream().map(fuq::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ahg, ggw> $$0) {
      this.a().stream().map(fuq::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public ggl a(ggp $$0, Function<ggo, gel> $$1, ggt $$2, ahg $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         ggx.a $$4 = new ggx.a();

         for (fuq $$5 : this.a()) {
            ggl $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fup> {
      public fup a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fuq> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fuq)$$2.deserialize($$5, fuq.class));
            }
         } else {
            $$3.add((fuq)$$2.deserialize($$0, fuq.class));
         }

         return new fup($$3);
      }
   }
}

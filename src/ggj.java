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

public class ggj implements gsy {
   private final List<ggk> a;

   public ggj(List<ggk> $$0) {
      this.a = $$0;
   }

   public List<ggk> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof ggj $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<akr> f() {
      return this.a().stream().map(ggk::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akr, gsy> $$0) {
      this.a().stream().map(ggk::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gsm a(gsr $$0, Function<gsq, gql> $$1, gsv $$2) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gsz.a $$3 = new gsz.a();

         for (ggk $$4 : this.a()) {
            gsm $$5 = $$0.a($$4.a(), $$4);
            $$3.a($$5, $$4.d());
         }

         return $$3.a();
      }
   }

   public static class a implements JsonDeserializer<ggj> {
      public ggj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<ggk> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((ggk)$$2.deserialize($$5, ggk.class));
            }
         } else {
            $$3.add((ggk)$$2.deserialize($$0, ggk.class));
         }

         return new ggj($$3);
      }
   }
}

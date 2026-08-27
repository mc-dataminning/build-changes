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

public class fuq implements ggx {
   private final List<fur> a;

   public fuq(List<fur> $$0) {
      this.a = $$0;
   }

   public List<fur> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fuq $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ahg> f() {
      return this.a().stream().map(fur::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ahg, ggx> $$0) {
      this.a().stream().map(fur::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public ggm a(ggq $$0, Function<ggp, gem> $$1, ggu $$2, ahg $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         ggy.a $$4 = new ggy.a();

         for (fur $$5 : this.a()) {
            ggm $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fuq> {
      public fuq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fur> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fur)$$2.deserialize($$5, fur.class));
            }
         } else {
            $$3.add((fur)$$2.deserialize($$0, fur.class));
         }

         return new fuq($$3);
      }
   }
}

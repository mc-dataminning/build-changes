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

public class gbj implements gnu {
   private final List<gbk> a;

   public gbj(List<gbk> $$0) {
      this.a = $$0;
   }

   public List<gbk> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gbj $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ajt> f() {
      return this.a().stream().map(gbk::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajt, gnu> $$0) {
      this.a().stream().map(gbk::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gnj a(gnn $$0, Function<gnm, glj> $$1, gnr $$2, ajt $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gnv.a $$4 = new gnv.a();

         for (gbk $$5 : this.a()) {
            gnj $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gbj> {
      public gbj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gbk> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gbk)$$2.deserialize($$5, gbk.class));
            }
         } else {
            $$3.add((gbk)$$2.deserialize($$0, gbk.class));
         }

         return new gbj($$3);
      }
   }
}

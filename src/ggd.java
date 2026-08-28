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

public class ggd implements gsr {
   private final List<gge> a;

   public ggd(List<gge> $$0) {
      this.a = $$0;
   }

   public List<gge> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof ggd $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<akq> f() {
      return this.a().stream().map(gge::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akq, gsr> $$0) {
      this.a().stream().map(gge::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gsg a(gsk $$0, Function<gsj, gqf> $$1, gso $$2, akq $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gss.a $$4 = new gss.a();

         for (gge $$5 : this.a()) {
            gsg $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<ggd> {
      public ggd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gge> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gge)$$2.deserialize($$5, gge.class));
            }
         } else {
            $$3.add((gge)$$2.deserialize($$0, gge.class));
         }

         return new ggd($$3);
      }
   }
}

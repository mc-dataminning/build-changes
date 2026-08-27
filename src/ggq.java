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

public class ggq implements gtk {
   private final List<ggr> a;

   public ggq(List<ggr> $$0) {
      this.a = $$0;
   }

   public List<ggr> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof ggq $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<akt> f() {
      return this.a().stream().map(ggr::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akt, gtk> $$0) {
      this.a().stream().map(ggr::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gsz a(gtd $$0, Function<gtc, gqy> $$1, gth $$2, akt $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gtl.a $$4 = new gtl.a();

         for (ggr $$5 : this.a()) {
            gsz $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<ggq> {
      public ggq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<ggr> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((ggr)$$2.deserialize($$5, ggr.class));
            }
         } else {
            $$3.add((ggr)$$2.deserialize($$0, ggr.class));
         }

         return new ggq($$3);
      }
   }
}

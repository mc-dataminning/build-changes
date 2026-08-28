import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gfc implements grk {
   private final dsc<dey, dsb> a;
   private final List<gfe> b;

   public gfc(dsc<dey, dsb> $$0, List<gfe> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gfe> a() {
      return this.b;
   }

   public Set<gex> b() {
      Set<gex> $$0 = Sets.newHashSet();

      for (gfe $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gfc $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<ale> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ale, grk> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gqz a(grd $$0, Function<grc, goy> $$1, grh $$2, ale $$3) {
      gri.a $$4 = new gri.a();

      for (gfe $$5 : this.a()) {
         gqz $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gfc> {
      private final geq.a a;

      public a(geq.a $$0) {
         this.a = $$0;
      }

      public gfc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gfc(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gfe> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gfe> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gfe)$$0.deserialize($$3, gfe.class));
         }

         return $$2;
      }
   }
}

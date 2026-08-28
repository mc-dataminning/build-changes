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

public class ggi implements gsr {
   private final dtb<dfw, dta> a;
   private final List<ggk> b;

   public ggi(dtb<dfw, dta> $$0, List<ggk> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<ggk> a() {
      return this.b;
   }

   public Set<ggd> b() {
      Set<ggd> $$0 = Sets.newHashSet();

      for (ggk $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ggi $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<akq> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akq, gsr> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gsg a(gsk $$0, Function<gsj, gqf> $$1, gso $$2, akq $$3) {
      gsp.a $$4 = new gsp.a();

      for (ggk $$5 : this.a()) {
         gsg $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<ggi> {
      private final gfw.a a;

      public a(gfw.a $$0) {
         this.a = $$0;
      }

      public ggi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new ggi(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<ggk> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<ggk> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((ggk)$$0.deserialize($$3, ggk.class));
         }

         return $$2;
      }
   }
}

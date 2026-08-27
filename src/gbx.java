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

public class gbx implements god {
   private final dpj<dch, dpi> a;
   private final List<gbz> b;

   public gbx(dpj<dch, dpi> $$0, List<gbz> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gbz> a() {
      return this.b;
   }

   public Set<gbs> b() {
      Set<gbs> $$0 = Sets.newHashSet();

      for (gbz $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gbx $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<ajv> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajv, god> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gns a(gnw $$0, Function<gnv, gls> $$1, goa $$2, ajv $$3) {
      gob.a $$4 = new gob.a();

      for (gbz $$5 : this.a()) {
         gns $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gbx> {
      private final gbl.a a;

      public a(gbl.a $$0) {
         this.a = $$0;
      }

      public gbx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gbx(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gbz> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gbz> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gbz)$$0.deserialize($$3, gbz.class));
         }

         return $$2;
      }
   }
}

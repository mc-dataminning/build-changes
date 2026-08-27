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

public class gdz implements gqh {
   private final dre<dea, drd> a;
   private final List<geb> b;

   public gdz(dre<dea, drd> $$0, List<geb> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<geb> a() {
      return this.b;
   }

   public Set<gdu> b() {
      Set<gdu> $$0 = Sets.newHashSet();

      for (geb $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gdz $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<akn> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akn, gqh> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gpw a(gqa $$0, Function<gpz, gnv> $$1, gqe $$2, akn $$3) {
      gqf.a $$4 = new gqf.a();

      for (geb $$5 : this.a()) {
         gpw $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gdz> {
      private final gdn.a a;

      public a(gdn.a $$0) {
         this.a = $$0;
      }

      public gdz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gdz(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<geb> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<geb> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((geb)$$0.deserialize($$3, geb.class));
         }

         return $$2;
      }
   }
}

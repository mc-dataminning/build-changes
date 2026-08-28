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

public class gfe implements grm {
   private final dse<dfa, dsd> a;
   private final List<gfg> b;

   public gfe(dse<dfa, dsd> $$0, List<gfg> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gfg> a() {
      return this.b;
   }

   public Set<gez> b() {
      Set<gez> $$0 = Sets.newHashSet();

      for (gfg $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gfe $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<alf> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<alf, grm> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public grb a(grf $$0, Function<gre, gpa> $$1, grj $$2, alf $$3) {
      grk.a $$4 = new grk.a();

      for (gfg $$5 : this.a()) {
         grb $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gfe> {
      private final ges.a a;

      public a(ges.a $$0) {
         this.a = $$0;
      }

      public gfe a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gfe(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gfg> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gfg> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gfg)$$0.deserialize($$3, gfg.class));
         }

         return $$2;
      }
   }
}

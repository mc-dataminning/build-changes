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

public class gff implements grn {
   private final dsf<dfb, dse> a;
   private final List<gfh> b;

   public gff(dsf<dfb, dse> $$0, List<gfh> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gfh> a() {
      return this.b;
   }

   public Set<gfa> b() {
      Set<gfa> $$0 = Sets.newHashSet();

      for (gfh $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gff $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
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
   public void a(Function<alf, grn> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public grc a(grg $$0, Function<grf, gpb> $$1, grk $$2, alf $$3) {
      grl.a $$4 = new grl.a();

      for (gfh $$5 : this.a()) {
         grc $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gff> {
      private final get.a a;

      public a(get.a $$0) {
         this.a = $$0;
      }

      public gff a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gff(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gfh> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gfh> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gfh)$$0.deserialize($$3, gfh.class));
         }

         return $$2;
      }
   }
}

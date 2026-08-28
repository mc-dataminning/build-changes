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

public class gey implements grg {
   private final dry<deu, drx> a;
   private final List<gfa> b;

   public gey(dry<deu, drx> $$0, List<gfa> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gfa> a() {
      return this.b;
   }

   public Set<get> b() {
      Set<get> $$0 = Sets.newHashSet();

      for (gfa $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gey $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<alb> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<alb, grg> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gqv a(gqz $$0, Function<gqy, gou> $$1, grd $$2, alb $$3) {
      gre.a $$4 = new gre.a();

      for (gfa $$5 : this.a()) {
         gqv $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gey> {
      private final gem.a a;

      public a(gem.a $$0) {
         this.a = $$0;
      }

      public gey a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gey(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gfa> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gfa> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gfa)$$0.deserialize($$3, gfa.class));
         }

         return $$2;
      }
   }
}

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

public class fyf implements gkk {
   private final dmf<czf, dme> a;
   private final List<fyh> b;

   public fyf(dmf<czf, dme> $$0, List<fyh> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fyh> a() {
      return this.b;
   }

   public Set<fya> b() {
      Set<fya> $$0 = Sets.newHashSet();

      for (fyh $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fyf $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<ajc> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajc, gkk> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gjz a(gkd $$0, Function<gkc, ghz> $$1, gkh $$2, ajc $$3) {
      gki.a $$4 = new gki.a();

      for (fyh $$5 : this.a()) {
         gjz $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fyf> {
      private final fxt.a a;

      public a(fxt.a $$0) {
         this.a = $$0;
      }

      public fyf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fyf(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fyh> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fyh> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fyh)$$0.deserialize($$3, fyh.class));
         }

         return $$2;
      }
   }
}

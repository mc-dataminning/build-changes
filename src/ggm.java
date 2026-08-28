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

public class ggm implements gsw {
   private final dtd<dfy, dtc> a;
   private final List<ggo> b;

   public ggm(dtd<dfy, dtc> $$0, List<ggo> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<ggo> a() {
      return this.b;
   }

   public Set<ggh> b() {
      Set<ggh> $$0 = Sets.newHashSet();

      for (ggo $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ggm $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<akr> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akr, gsw> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gsk a(gsp $$0, Function<gso, gqj> $$1, gst $$2) {
      gsu.a $$3 = new gsu.a();

      for (ggo $$4 : this.a()) {
         gsk $$5 = $$4.a().a($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$4.a(this.a), $$5);
         }
      }

      return $$3.a();
   }

   public static class a implements JsonDeserializer<ggm> {
      private final gga.a a;

      public a(gga.a $$0) {
         this.a = $$0;
      }

      public ggm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new ggm(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<ggo> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<ggo> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((ggo)$$0.deserialize($$3, ggo.class));
         }

         return $$2;
      }
   }
}

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

public class gbo implements gnu {
   private final dpa<dby, doz> a;
   private final List<gbq> b;

   public gbo(dpa<dby, doz> $$0, List<gbq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gbq> a() {
      return this.b;
   }

   public Set<gbj> b() {
      Set<gbj> $$0 = Sets.newHashSet();

      for (gbq $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gbo $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<ajt> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajt, gnu> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gnj a(gnn $$0, Function<gnm, glj> $$1, gnr $$2, ajt $$3) {
      gns.a $$4 = new gns.a();

      for (gbq $$5 : this.a()) {
         gnj $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gbo> {
      private final gbc.a a;

      public a(gbc.a $$0) {
         this.a = $$0;
      }

      public gbo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gbo(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gbq> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gbq> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gbq)$$0.deserialize($$3, gbq.class));
         }

         return $$2;
      }
   }
}

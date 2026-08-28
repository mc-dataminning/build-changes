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

public class ggo implements gsy {
   private final dtd<dfy, dtc> a;
   private final List<ggq> b;

   public ggo(dtd<dfy, dtc> $$0, List<ggq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<ggq> a() {
      return this.b;
   }

   public Set<ggj> b() {
      Set<ggj> $$0 = Sets.newHashSet();

      for (ggq $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ggo $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
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
   public void a(Function<akr, gsy> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gsm a(gsr $$0, Function<gsq, gql> $$1, gsv $$2) {
      gsw.a $$3 = new gsw.a();

      for (ggq $$4 : this.a()) {
         gsm $$5 = $$4.a().a($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$4.a(this.a), $$5);
         }
      }

      return $$3.a();
   }

   public static class a implements JsonDeserializer<ggo> {
      private final ggc.a a;

      public a(ggc.a $$0) {
         this.a = $$0;
      }

      public ggo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new ggo(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<ggq> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<ggq> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((ggq)$$0.deserialize($$3, ggq.class));
         }

         return $$2;
      }
   }
}

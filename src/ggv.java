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

public class ggv implements gtk {
   private final dtd<dfc, dtc> a;
   private final List<ggx> b;

   public ggv(dtd<dfc, dtc> $$0, List<ggx> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<ggx> a() {
      return this.b;
   }

   public Set<ggq> b() {
      Set<ggq> $$0 = Sets.newHashSet();

      for (ggx $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ggv $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<akt> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akt, gtk> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gsz a(gtd $$0, Function<gtc, gqy> $$1, gth $$2, akt $$3) {
      gti.a $$4 = new gti.a();

      for (ggx $$5 : this.a()) {
         gsz $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<ggv> {
      private final ggj.a a;

      public a(ggj.a $$0) {
         this.a = $$0;
      }

      public ggv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new ggv(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<ggx> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<ggx> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((ggx)$$0.deserialize($$3, ggx.class));
         }

         return $$2;
      }
   }
}

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

public class gfd implements grl {
   private final dsd<dez, dsc> a;
   private final List<gff> b;

   public gfd(dsd<dez, dsc> $$0, List<gff> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gff> a() {
      return this.b;
   }

   public Set<gey> b() {
      Set<gey> $$0 = Sets.newHashSet();

      for (gff $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gfd $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
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
   public void a(Function<alf, grl> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gra a(gre $$0, Function<grd, goz> $$1, gri $$2, alf $$3) {
      grj.a $$4 = new grj.a();

      for (gff $$5 : this.a()) {
         gra $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gfd> {
      private final ger.a a;

      public a(ger.a $$0) {
         this.a = $$0;
      }

      public gfd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gfd(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gff> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gff> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gff)$$0.deserialize($$3, gff.class));
         }

         return $$2;
      }
   }
}

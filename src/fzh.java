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

public class fzh implements gln {
   private final dnc<dac, dnb> a;
   private final List<fzj> b;

   public fzh(dnc<dac, dnb> $$0, List<fzj> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fzj> a() {
      return this.b;
   }

   public Set<fzc> b() {
      Set<fzc> $$0 = Sets.newHashSet();

      for (fzj $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fzh $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<ajh> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajh, gln> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public glc a(glg $$0, Function<glf, gjc> $$1, glk $$2, ajh $$3) {
      gll.a $$4 = new gll.a();

      for (fzj $$5 : this.a()) {
         glc $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fzh> {
      private final fyv.a a;

      public a(fyv.a $$0) {
         this.a = $$0;
      }

      public fzh a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fzh(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fzj> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fzj> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fzj)$$0.deserialize($$3, fzj.class));
         }

         return $$2;
      }
   }
}

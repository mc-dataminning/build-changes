import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fzc implements gln {
   private final List<fzd> a;

   public fzc(List<fzd> $$0) {
      this.a = $$0;
   }

   public List<fzd> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fzc $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ajh> f() {
      return this.a().stream().map(fzd::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajh, gln> $$0) {
      this.a().stream().map(fzd::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public glc a(glg $$0, Function<glf, gjc> $$1, glk $$2, ajh $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         glo.a $$4 = new glo.a();

         for (fzd $$5 : this.a()) {
            glc $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fzc> {
      public fzc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fzd> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fzd)$$2.deserialize($$5, fzd.class));
            }
         } else {
            $$3.add((fzd)$$2.deserialize($$0, fzd.class));
         }

         return new fzc($$3);
      }
   }
}

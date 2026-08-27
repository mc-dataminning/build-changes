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

public class fza implements glk {
   private final List<fzb> a;

   public fza(List<fzb> $$0) {
      this.a = $$0;
   }

   public List<fzb> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fza $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<ajh> f() {
      return this.a().stream().map(fzb::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ajh, glk> $$0) {
      this.a().stream().map(fzb::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gkz a(gld $$0, Function<glc, giz> $$1, glh $$2, ajh $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gll.a $$4 = new gll.a();

         for (fzb $$5 : this.a()) {
            gkz $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fza> {
      public fza a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fzb> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fzb)$$2.deserialize($$5, fzb.class));
            }
         } else {
            $$3.add((fzb)$$2.deserialize($$0, fzb.class));
         }

         return new fza($$3);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fzd {
   private final List<akh> a;

   private fzd(List<akh> $$0) {
      this.a = $$0;
   }

   public List<akh> a() {
      return this.a;
   }

   public static fzd a(JsonObject $$0) {
      JsonArray $$1 = axp.a($$0, "textures", null);
      if ($$1 == null) {
         return new fzd(List.of());
      } else {
         List<akh> $$2 = Streams.stream($$1).map($$0x -> axp.a($$0x, "texture")).map(akh::new).collect(ImmutableList.toImmutableList());
         return new fzd($$2);
      }
   }
}

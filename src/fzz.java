import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fzz {
   private final List<akm> a;

   private fzz(List<akm> $$0) {
      this.a = $$0;
   }

   public List<akm> a() {
      return this.a;
   }

   public static fzz a(JsonObject $$0) {
      JsonArray $$1 = axu.a($$0, "textures", null);
      if ($$1 == null) {
         return new fzz(List.of());
      } else {
         List<akm> $$2 = Streams.stream($$1).map($$0x -> axu.a($$0x, "texture")).map(akm::new).collect(ImmutableList.toImmutableList());
         return new fzz($$2);
      }
   }
}

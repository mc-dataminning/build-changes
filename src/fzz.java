import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fzz {
   private final List<akn> a;

   private fzz(List<akn> $$0) {
      this.a = $$0;
   }

   public List<akn> a() {
      return this.a;
   }

   public static fzz a(JsonObject $$0) {
      JsonArray $$1 = axv.a($$0, "textures", null);
      if ($$1 == null) {
         return new fzz(List.of());
      } else {
         List<akn> $$2 = Streams.stream($$1).map($$0x -> axv.a($$0x, "texture")).map(akn::new).collect(ImmutableList.toImmutableList());
         return new fzz($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fyt {
   private final List<akf> a;

   private fyt(List<akf> $$0) {
      this.a = $$0;
   }

   public List<akf> a() {
      return this.a;
   }

   public static fyt a(JsonObject $$0) {
      JsonArray $$1 = axm.a($$0, "textures", null);
      if ($$1 == null) {
         return new fyt(List.of());
      } else {
         List<akf> $$2 = Streams.stream($$1).map($$0x -> axm.a($$0x, "texture")).map(akf::new).collect(ImmutableList.toImmutableList());
         return new fyt($$2);
      }
   }
}

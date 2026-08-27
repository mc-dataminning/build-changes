import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fxx {
   private final List<ajv> a;

   private fxx(List<ajv> $$0) {
      this.a = $$0;
   }

   public List<ajv> a() {
      return this.a;
   }

   public static fxx a(JsonObject $$0) {
      JsonArray $$1 = axc.a($$0, "textures", null);
      if ($$1 == null) {
         return new fxx(List.of());
      } else {
         List<ajv> $$2 = Streams.stream($$1).map($$0x -> axc.a($$0x, "texture")).map(ajv::new).collect(ImmutableList.toImmutableList());
         return new fxx($$2);
      }
   }
}

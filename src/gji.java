import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gji {
   private final List<akv> a;

   private gji(List<akv> $$0) {
      this.a = $$0;
   }

   public List<akv> a() {
      return this.a;
   }

   public static gji a(JsonObject $$0) {
      JsonArray $$1 = ayp.a($$0, "textures", null);
      if ($$1 == null) {
         return new gji(List.of());
      } else {
         List<akv> $$2 = Streams.stream($$1).map($$0x -> ayp.a($$0x, "texture")).map(akv::a).collect(ImmutableList.toImmutableList());
         return new gji($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class goa {
   private final List<alg> a;

   private goa(List<alg> $$0) {
      this.a = $$0;
   }

   public List<alg> a() {
      return this.a;
   }

   public static goa a(JsonObject $$0) {
      JsonArray $$1 = azc.a($$0, "textures", null);
      if ($$1 == null) {
         return new goa(List.of());
      } else {
         List<alg> $$2 = Streams.stream($$1).map($$0x -> azc.a($$0x, "texture")).map(alg::a).collect(ImmutableList.toImmutableList());
         return new goa($$2);
      }
   }
}

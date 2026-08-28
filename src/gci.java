import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gci {
   private final List<akq> a;

   private gci(List<akq> $$0) {
      this.a = $$0;
   }

   public List<akq> a() {
      return this.a;
   }

   public static gci a(JsonObject $$0) {
      JsonArray $$1 = ayd.a($$0, "textures", null);
      if ($$1 == null) {
         return new gci(List.of());
      } else {
         List<akq> $$2 = Streams.stream($$1).map($$0x -> ayd.a($$0x, "texture")).map(akq::a).collect(ImmutableList.toImmutableList());
         return new gci($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gbe {
   private final List<alf> a;

   private gbe(List<alf> $$0) {
      this.a = $$0;
   }

   public List<alf> a() {
      return this.a;
   }

   public static gbe a(JsonObject $$0) {
      JsonArray $$1 = ayp.a($$0, "textures", null);
      if ($$1 == null) {
         return new gbe(List.of());
      } else {
         List<alf> $$2 = Streams.stream($$1).map($$0x -> ayp.a($$0x, "texture")).map(alf::new).collect(ImmutableList.toImmutableList());
         return new gbe($$2);
      }
   }
}

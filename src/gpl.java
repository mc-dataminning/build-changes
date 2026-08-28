import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gpl {
   private final List<ali> a;

   private gpl(List<ali> $$0) {
      this.a = $$0;
   }

   public List<ali> a() {
      return this.a;
   }

   public static gpl a(JsonObject $$0) {
      JsonArray $$1 = aze.a($$0, "textures", null);
      if ($$1 == null) {
         return new gpl(List.of());
      } else {
         List<ali> $$2 = Streams.stream($$1).map($$0x -> aze.a($$0x, "texture")).map(ali::a).collect(ImmutableList.toImmutableList());
         return new gpl($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gef {
   private final List<alb> a;

   private gef(List<alb> $$0) {
      this.a = $$0;
   }

   public List<alb> a() {
      return this.a;
   }

   public static gef a(JsonObject $$0) {
      JsonArray $$1 = ays.a($$0, "textures", null);
      if ($$1 == null) {
         return new gef(List.of());
      } else {
         List<alb> $$2 = Streams.stream($$1).map($$0x -> ays.a($$0x, "texture")).map(alb::a).collect(ImmutableList.toImmutableList());
         return new gef($$2);
      }
   }
}

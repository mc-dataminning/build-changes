import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class ggg {
   private final List<all> a;

   private ggg(List<all> $$0) {
      this.a = $$0;
   }

   public List<all> a() {
      return this.a;
   }

   public static ggg a(JsonObject $$0) {
      JsonArray $$1 = azd.a($$0, "textures", null);
      if ($$1 == null) {
         return new ggg(List.of());
      } else {
         List<all> $$2 = Streams.stream($$1).map($$0x -> azd.a($$0x, "texture")).map(all::a).collect(ImmutableList.toImmutableList());
         return new ggg($$2);
      }
   }
}

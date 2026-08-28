import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gli {
   private final List<ald> a;

   private gli(List<ald> $$0) {
      this.a = $$0;
   }

   public List<ald> a() {
      return this.a;
   }

   public static gli a(JsonObject $$0) {
      JsonArray $$1 = aza.a($$0, "textures", null);
      if ($$1 == null) {
         return new gli(List.of());
      } else {
         List<ald> $$2 = Streams.stream($$1).map($$0x -> aza.a($$0x, "texture")).map(ald::a).collect(ImmutableList.toImmutableList());
         return new gli($$2);
      }
   }
}

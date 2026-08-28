import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gio {
   private final List<alp> a;

   private gio(List<alp> $$0) {
      this.a = $$0;
   }

   public List<alp> a() {
      return this.a;
   }

   public static gio a(JsonObject $$0) {
      JsonArray $$1 = azk.a($$0, "textures", null);
      if ($$1 == null) {
         return new gio(List.of());
      } else {
         List<alp> $$2 = Streams.stream($$1).map($$0x -> azk.a($$0x, "texture")).map(alp::a).collect(ImmutableList.toImmutableList());
         return new gio($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gpn {
   private final List<alk> a;

   private gpn(List<alk> $$0) {
      this.a = $$0;
   }

   public List<alk> a() {
      return this.a;
   }

   public static gpn a(JsonObject $$0) {
      JsonArray $$1 = azg.a($$0, "textures", null);
      if ($$1 == null) {
         return new gpn(List.of());
      } else {
         List<alk> $$2 = Streams.stream($$1).map($$0x -> azg.a($$0x, "texture")).map(alk::a).collect(ImmutableList.toImmutableList());
         return new gpn($$2);
      }
   }
}

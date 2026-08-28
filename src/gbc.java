import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gbc {
   private final List<ale> a;

   private gbc(List<ale> $$0) {
      this.a = $$0;
   }

   public List<ale> a() {
      return this.a;
   }

   public static gbc a(JsonObject $$0) {
      JsonArray $$1 = ayo.a($$0, "textures", null);
      if ($$1 == null) {
         return new gbc(List.of());
      } else {
         List<ale> $$2 = Streams.stream($$1).map($$0x -> ayo.a($$0x, "texture")).map(ale::new).collect(ImmutableList.toImmutableList());
         return new gbc($$2);
      }
   }
}

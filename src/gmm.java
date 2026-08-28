import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gmm {
   private final List<ale> a;

   private gmm(List<ale> $$0) {
      this.a = $$0;
   }

   public List<ale> a() {
      return this.a;
   }

   public static gmm a(JsonObject $$0) {
      JsonArray $$1 = aza.a($$0, "textures", null);
      if ($$1 == null) {
         return new gmm(List.of());
      } else {
         List<ale> $$2 = Streams.stream($$1).map($$0x -> aza.a($$0x, "texture")).map(ale::a).collect(ImmutableList.toImmutableList());
         return new gmm($$2);
      }
   }
}

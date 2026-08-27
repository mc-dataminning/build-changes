import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fvf {
   private final List<ajh> a;

   private fvf(List<ajh> $$0) {
      this.a = $$0;
   }

   public List<ajh> a() {
      return this.a;
   }

   public static fvf a(JsonObject $$0) {
      JsonArray $$1 = awm.a($$0, "textures", null);
      if ($$1 == null) {
         return new fvf(List.of());
      } else {
         List<ajh> $$2 = Streams.stream($$1).map($$0x -> awm.a($$0x, "texture")).map(ajh::new).collect(ImmutableList.toImmutableList());
         return new fvf($$2);
      }
   }
}

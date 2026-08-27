import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class fxo {
   private final List<ajt> a;

   private fxo(List<ajt> $$0) {
      this.a = $$0;
   }

   public List<ajt> a() {
      return this.a;
   }

   public static fxo a(JsonObject $$0) {
      JsonArray $$1 = axa.a($$0, "textures", null);
      if ($$1 == null) {
         return new fxo(List.of());
      } else {
         List<ajt> $$2 = Streams.stream($$1).map($$0x -> axa.a($$0x, "texture")).map(ajt::new).collect(ImmutableList.toImmutableList());
         return new fxo($$2);
      }
   }
}

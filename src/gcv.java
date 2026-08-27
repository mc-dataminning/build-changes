import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gcv {
   private final List<akt> a;

   private gcv(List<akt> $$0) {
      this.a = $$0;
   }

   public List<akt> a() {
      return this.a;
   }

   public static gcv a(JsonObject $$0) {
      JsonArray $$1 = ayc.a($$0, "textures", null);
      if ($$1 == null) {
         return new gcv(List.of());
      } else {
         List<akt> $$2 = Streams.stream($$1).map($$0x -> ayc.a($$0x, "texture")).map(akt::new).collect(ImmutableList.toImmutableList());
         return new gcv($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gcm {
   private final List<akr> a;

   private gcm(List<akr> $$0) {
      this.a = $$0;
   }

   public List<akr> a() {
      return this.a;
   }

   public static gcm a(JsonObject $$0) {
      JsonArray $$1 = aye.a($$0, "textures", null);
      if ($$1 == null) {
         return new gcm(List.of());
      } else {
         List<akr> $$2 = Streams.stream($$1).map($$0x -> aye.a($$0x, "texture")).map(akr::a).collect(ImmutableList.toImmutableList());
         return new gcm($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class goy {
   private final List<alr> a;

   private goy(List<alr> $$0) {
      this.a = $$0;
   }

   public List<alr> a() {
      return this.a;
   }

   public static goy a(JsonObject $$0) {
      JsonArray $$1 = azo.a($$0, "textures", null);
      if ($$1 == null) {
         return new goy(List.of());
      } else {
         List<alr> $$2 = Streams.stream($$1).map($$0x -> azo.a($$0x, "texture")).map(alr::a).collect(ImmutableList.toImmutableList());
         return new goy($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gff {
   private final List<alh> a;

   private gff(List<alh> $$0) {
      this.a = $$0;
   }

   public List<alh> a() {
      return this.a;
   }

   public static gff a(JsonObject $$0) {
      JsonArray $$1 = ayz.a($$0, "textures", null);
      if ($$1 == null) {
         return new gff(List.of());
      } else {
         List<alh> $$2 = Streams.stream($$1).map($$0x -> ayz.a($$0x, "texture")).map(alh::a).collect(ImmutableList.toImmutableList());
         return new gff($$2);
      }
   }
}

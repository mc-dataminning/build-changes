import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gco {
   private final List<akr> a;

   private gco(List<akr> $$0) {
      this.a = $$0;
   }

   public List<akr> a() {
      return this.a;
   }

   public static gco a(JsonObject $$0) {
      JsonArray $$1 = aye.a($$0, "textures", null);
      if ($$1 == null) {
         return new gco(List.of());
      } else {
         List<akr> $$2 = Streams.stream($$1).map($$0x -> aye.a($$0x, "texture")).map(akr::a).collect(ImmutableList.toImmutableList());
         return new gco($$2);
      }
   }
}

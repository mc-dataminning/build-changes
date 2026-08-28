import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gir {
   private final List<alz> a;

   private gir(List<alz> $$0) {
      this.a = $$0;
   }

   public List<alz> a() {
      return this.a;
   }

   public static gir a(JsonObject $$0) {
      JsonArray $$1 = azu.a($$0, "textures", null);
      if ($$1 == null) {
         return new gir(List.of());
      } else {
         List<alz> $$2 = Streams.stream($$1).map($$0x -> azu.a($$0x, "texture")).map(alz::a).collect(ImmutableList.toImmutableList());
         return new gir($$2);
      }
   }
}

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class ggp {
   private final List<alj> a;

   private ggp(List<alj> $$0) {
      this.a = $$0;
   }

   public List<alj> a() {
      return this.a;
   }

   public static ggp a(JsonObject $$0) {
      JsonArray $$1 = azc.a($$0, "textures", null);
      if ($$1 == null) {
         return new ggp(List.of());
      } else {
         List<alj> $$2 = Streams.stream($$1).map($$0x -> azc.a($$0x, "texture")).map(alj::a).collect(ImmutableList.toImmutableList());
         return new ggp($$2);
      }
   }
}

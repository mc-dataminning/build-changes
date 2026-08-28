import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gnb {
   private final List<alg> a;

   private gnb(List<alg> $$0) {
      this.a = $$0;
   }

   public List<alg> a() {
      return this.a;
   }

   public static gnb a(JsonObject $$0) {
      JsonArray $$1 = azc.a($$0, "textures", null);
      if ($$1 == null) {
         return new gnb(List.of());
      } else {
         List<alg> $$2 = Streams.stream($$1).map($$0x -> azc.a($$0x, "texture")).map(alg::a).collect(ImmutableList.toImmutableList());
         return new gnb($$2);
      }
   }
}

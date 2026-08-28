import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gjh {
   private final List<aku> a;

   private gjh(List<aku> $$0) {
      this.a = $$0;
   }

   public List<aku> a() {
      return this.a;
   }

   public static gjh a(JsonObject $$0) {
      JsonArray $$1 = ayp.a($$0, "textures", null);
      if ($$1 == null) {
         return new gjh(List.of());
      } else {
         List<aku> $$2 = Streams.stream($$1).map($$0x -> ayp.a($$0x, "texture")).map(aku::a).collect(ImmutableList.toImmutableList());
         return new gjh($$2);
      }
   }
}

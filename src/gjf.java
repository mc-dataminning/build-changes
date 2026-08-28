import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gjf {
   private final List<aku> a;

   private gjf(List<aku> $$0) {
      this.a = $$0;
   }

   public List<aku> a() {
      return this.a;
   }

   public static gjf a(JsonObject $$0) {
      JsonArray $$1 = ayo.a($$0, "textures", null);
      if ($$1 == null) {
         return new gjf(List.of());
      } else {
         List<aku> $$2 = Streams.stream($$1).map($$0x -> ayo.a($$0x, "texture")).map(aku::a).collect(ImmutableList.toImmutableList());
         return new gjf($$2);
      }
   }
}

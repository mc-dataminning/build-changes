import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gep {
   private final List<alc> a;

   private gep(List<alc> $$0) {
      this.a = $$0;
   }

   public List<alc> a() {
      return this.a;
   }

   public static gep a(JsonObject $$0) {
      JsonArray $$1 = ayt.a($$0, "textures", null);
      if ($$1 == null) {
         return new gep(List.of());
      } else {
         List<alc> $$2 = Streams.stream($$1).map($$0x -> ayt.a($$0x, "texture")).map(alc::a).collect(ImmutableList.toImmutableList());
         return new gep($$2);
      }
   }
}

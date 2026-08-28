import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gay {
   private final List<alb> a;

   private gay(List<alb> $$0) {
      this.a = $$0;
   }

   public List<alb> a() {
      return this.a;
   }

   public static gay a(JsonObject $$0) {
      JsonArray $$1 = ayk.a($$0, "textures", null);
      if ($$1 == null) {
         return new gay(List.of());
      } else {
         List<alb> $$2 = Streams.stream($$1).map($$0x -> ayk.a($$0x, "texture")).map(alb::new).collect(ImmutableList.toImmutableList());
         return new gay($$2);
      }
   }
}

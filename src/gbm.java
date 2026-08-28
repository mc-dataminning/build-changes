import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class gbm {
   private final List<akk> a;

   private gbm(List<akk> $$0) {
      this.a = $$0;
   }

   public List<akk> a() {
      return this.a;
   }

   public static gbm a(JsonObject $$0) {
      JsonArray $$1 = axu.a($$0, "textures", null);
      if ($$1 == null) {
         return new gbm(List.of());
      } else {
         List<akk> $$2 = Streams.stream($$1).map($$0x -> axu.a($$0x, "texture")).map(akk::new).collect(ImmutableList.toImmutableList());
         return new gbm($$2);
      }
   }
}

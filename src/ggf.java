import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class ggf {
   public static final int a = -1;
   public final iw b;
   public final int c;
   public final String d;
   public final ggh e;

   public ggf(@Nullable iw $$0, int $$1, String $$2, ggh $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<ggf> {
      private static final int a = -1;

      public ggf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         iw $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         ggh $$7 = (ggh)$$2.deserialize($$3, ggh.class);
         return new ggf($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ayc.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ayc.i($$0, "texture");
      }

      @Nullable
      private iw c(JsonObject $$0) {
         String $$1 = ayc.a($$0, "cullface", "");
         return iw.a($$1);
      }
   }
}

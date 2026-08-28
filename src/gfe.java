import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class gfe {
   public static final int a = -1;
   public final jf b;
   public final int c;
   public final String d;
   public final gfg e;

   public gfe(@Nullable jf $$0, int $$1, String $$2, gfg $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<gfe> {
      private static final int a = -1;

      public gfe a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jf $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gfg $$7 = (gfg)$$2.deserialize($$3, gfg.class);
         return new gfe($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return axw.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return axw.i($$0, "texture");
      }

      @Nullable
      private jf c(JsonObject $$0) {
         String $$1 = axw.a($$0, "cullface", "");
         return jf.a($$1);
      }
   }
}

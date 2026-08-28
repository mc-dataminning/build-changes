import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class gfs {
   public static final int a = -1;
   public final ji b;
   public final int c;
   public final String d;
   public final gfu e;

   public gfs(@Nullable ji $$0, int $$1, String $$2, gfu $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<gfs> {
      private static final int a = -1;

      public gfs a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ji $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gfu $$7 = (gfu)$$2.deserialize($$3, gfu.class);
         return new gfs($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ayd.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ayd.i($$0, "texture");
      }

      @Nullable
      private ji c(JsonObject $$0) {
         String $$1 = ayd.a($$0, "cullface", "");
         return ji.a($$1);
      }
   }
}

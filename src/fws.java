import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fws {
   public static final int a = -1;
   public final ie b;
   public final int c;
   public final String d;
   public final fwu e;

   public fws(@Nullable ie $$0, int $$1, String $$2, fwu $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<fws> {
      private static final int a = -1;

      public fws a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ie $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         fwu $$7 = (fwu)$$2.deserialize($$3, fwu.class);
         return new fws($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return avy.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return avy.i($$0, "texture");
      }

      @Nullable
      private ie c(JsonObject $$0) {
         String $$1 = avy.a($$0, "cullface", "");
         return ie.a($$1);
      }
   }
}

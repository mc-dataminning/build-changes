import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gkp(@Nullable jm b, int c, String d, gkr e) {
   public static final int a = -1;

   @Nullable
   public jm a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public gkr d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<gkp> {
      private static final int a = -1;

      public gkp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jm $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gkr $$7 = (gkr)$$2.deserialize($$3, gkr.class);
         return new gkp($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return azc.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return azc.i($$0, "texture");
      }

      @Nullable
      private jm c(JsonObject $$0) {
         String $$1 = azc.a($$0, "cullface", "");
         return jm.a($$1);
      }
   }
}

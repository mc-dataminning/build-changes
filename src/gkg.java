import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gkg(@Nullable jm b, int c, String d, gki e) {
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

   public gki d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<gkg> {
      private static final int a = -1;

      public gkg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jm $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gki $$7 = (gki)$$2.deserialize($$3, gki.class);
         return new gkg($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return azd.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return azd.i($$0, "texture");
      }

      @Nullable
      private jm c(JsonObject $$0) {
         String $$1 = azd.a($$0, "cullface", "");
         return jm.a($$1);
      }
   }
}

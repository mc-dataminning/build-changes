import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gfy(@Nullable ji b, int c, String d, gga e) {
   public static final int a = -1;

   @Nullable
   public ji a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public gga d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<gfy> {
      private static final int a = -1;

      public gfy a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ji $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gga $$7 = (gga)$$2.deserialize($$3, gga.class);
         return new gfy($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return aye.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return aye.i($$0, "texture");
      }

      @Nullable
      private ji c(JsonObject $$0) {
         String $$1 = aye.a($$0, "cullface", "");
         return ji.a($$1);
      }
   }
}

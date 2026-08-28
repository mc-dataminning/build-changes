import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gni(@Nullable jn b, int c, String d, gnk e) {
   public static final int a = -1;

   @Nullable
   public jn a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public gnk d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<gni> {
      private static final int a = -1;

      public gni a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jn $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gnk $$7 = (gnk)$$2.deserialize($$3, gnk.class);
         return new gni($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ayp.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ayp.i($$0, "texture");
      }

      @Nullable
      private jn c(JsonObject $$0) {
         String $$1 = ayp.a($$0, "cullface", "");
         return jn.a($$1);
      }
   }
}

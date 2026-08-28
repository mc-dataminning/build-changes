import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gqm(@Nullable ja b, int c, String d, gqo e) {
   public static final int a = -1;

   @Nullable
   public ja a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public gqo d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<gqm> {
      private static final int a = -1;

      public gqm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ja $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gqo $$7 = (gqo)$$2.deserialize($$3, gqo.class);
         return new gqm($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return aza.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return aza.i($$0, "texture");
      }

      @Nullable
      private ja c(JsonObject $$0) {
         String $$1 = aza.a($$0, "cullface", "");
         return ja.a($$1);
      }
   }
}

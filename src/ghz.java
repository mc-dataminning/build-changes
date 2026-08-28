import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record ghz(@Nullable jj b, int c, String d, gib e) {
   public static final int a = -1;

   @Nullable
   public jj a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public gib d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<ghz> {
      private static final int a = -1;

      public ghz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jj $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gib $$7 = (gib)$$2.deserialize($$3, gib.class);
         return new ghz($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ays.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ays.i($$0, "texture");
      }

      @Nullable
      private jj c(JsonObject $$0) {
         String $$1 = ays.a($$0, "cullface", "");
         return jj.a($$1);
      }
   }
}

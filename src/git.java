import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record git(@Nullable jk b, int c, String d, giv e) {
   public static final int a = -1;

   @Nullable
   public jk a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public giv d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<git> {
      private static final int a = -1;

      public git a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jk $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         giv $$7 = (giv)$$2.deserialize($$3, giv.class);
         return new git($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ayv.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ayv.i($$0, "texture");
      }

      @Nullable
      private jk c(JsonObject $$0) {
         String $$1 = ayv.a($$0, "cullface", "");
         return jk.a($$1);
      }
   }
}

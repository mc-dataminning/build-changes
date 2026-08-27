import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class gay {
   public static final int a = -1;
   public final ih b;
   public final int c;
   public final String d;
   public final gba e;

   public gay(@Nullable ih $$0, int $$1, String $$2, gba $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<gay> {
      private static final int a = -1;

      public gay a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ih $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gba $$7 = (gba)$$2.deserialize($$3, gba.class);
         return new gay($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return axa.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return axa.i($$0, "texture");
      }

      @Nullable
      private ih c(JsonObject $$0) {
         String $$1 = axa.a($$0, "cullface", "");
         return ih.a($$1);
      }
   }
}

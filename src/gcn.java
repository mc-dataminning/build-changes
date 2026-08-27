import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class gcn {
   public static final int a = -1;
   public final is b;
   public final int c;
   public final String d;
   public final gcp e;

   public gcn(@Nullable is $$0, int $$1, String $$2, gcp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<gcn> {
      private static final int a = -1;

      public gcn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         is $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gcp $$7 = (gcp)$$2.deserialize($$3, gcp.class);
         return new gcn($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return axp.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return axp.i($$0, "texture");
      }

      @Nullable
      private is c(JsonObject $$0) {
         String $$1 = axp.a($$0, "cullface", "");
         return is.a($$1);
      }
   }
}

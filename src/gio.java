import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gio(@Nullable jj b, int c, String d, giq e) {
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

   public giq d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<gio> {
      private static final int a = -1;

      public gio a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jj $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         giq $$7 = (giq)$$2.deserialize($$3, giq.class);
         return new gio($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ayt.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ayt.i($$0, "texture");
      }

      @Nullable
      private jj c(JsonObject $$0) {
         String $$1 = ayt.a($$0, "cullface", "");
         return jj.a($$1);
      }
   }
}

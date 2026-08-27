import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class gbh {
   public static final int a = -1;
   public final ij b;
   public final int c;
   public final String d;
   public final gbj e;

   public gbh(@Nullable ij $$0, int $$1, String $$2, gbj $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<gbh> {
      private static final int a = -1;

      public gbh a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ij $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gbj $$7 = (gbj)$$2.deserialize($$3, gbj.class);
         return new gbh($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return axc.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return axc.i($$0, "texture");
      }

      @Nullable
      private ij c(JsonObject $$0) {
         String $$1 = axc.a($$0, "cullface", "");
         return ij.a($$1);
      }
   }
}

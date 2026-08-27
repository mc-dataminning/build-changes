import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class gdj {
   public static final int a = -1;
   public final it b;
   public final int c;
   public final String d;
   public final gdl e;

   public gdj(@Nullable it $$0, int $$1, String $$2, gdl $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<gdj> {
      private static final int a = -1;

      public gdj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         it $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gdl $$7 = (gdl)$$2.deserialize($$3, gdl.class);
         return new gdj($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return axv.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return axv.i($$0, "texture");
      }

      @Nullable
      private it c(JsonObject $$0) {
         String $$1 = axv.a($$0, "cullface", "");
         return it.a($$1);
      }
   }
}

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class gem {
   public static final int a = -1;
   public final je b;
   public final int c;
   public final String d;
   public final geo e;

   public gem(@Nullable je $$0, int $$1, String $$2, geo $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected static class a implements JsonDeserializer<gem> {
      private static final int a = -1;

      public gem a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         je $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         geo $$7 = (geo)$$2.deserialize($$3, geo.class);
         return new gem($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ayo.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ayo.i($$0, "texture");
      }

      @Nullable
      private je c(JsonObject $$0) {
         String $$1 = ayo.a($$0, "cullface", "");
         return je.a($$1);
      }
   }
}

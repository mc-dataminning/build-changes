import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gms(@Nullable jm b, int c, String d, gmu e) {
   public static final int a = -1;

   @Nullable
   public jm a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public gmu d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<gms> {
      private static final int a = -1;

      public gms a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jm $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gmu $$7 = (gmu)$$2.deserialize($$3, gmu.class);
         return new gms($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return azu.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return azu.i($$0, "texture");
      }

      @Nullable
      private jm c(JsonObject $$0) {
         String $$1 = azu.a($$0, "cullface", "");
         return jm.a($$1);
      }
   }
}

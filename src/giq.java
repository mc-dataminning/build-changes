import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class giq {
   public float[] a;
   public final int b;

   public giq(@Nullable float[] $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public float a(int $$0) {
      if (this.a == null) {
         throw new NullPointerException("uvs");
      } else {
         int $$1 = this.d($$0);
         return this.a[$$1 != 0 && $$1 != 1 ? 2 : 0];
      }
   }

   public float b(int $$0) {
      if (this.a == null) {
         throw new NullPointerException("uvs");
      } else {
         int $$1 = this.d($$0);
         return this.a[$$1 != 0 && $$1 != 3 ? 3 : 1];
      }
   }

   private int d(int $$0) {
      return ($$0 + this.b / 90) % 4;
   }

   public int c(int $$0) {
      return ($$0 + 4 - this.b / 90) % 4;
   }

   public void a(float[] $$0) {
      if (this.a == null) {
         this.a = $$0;
      }
   }

   protected static class a implements JsonDeserializer<giq> {
      private static final int a = 0;

      public giq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         float[] $$4 = this.b($$3);
         int $$5 = this.a($$3);
         return new giq($$4, $$5);
      }

      protected int a(JsonObject $$0) {
         int $$1 = ayt.a($$0, "rotation", 0);
         if ($$1 >= 0 && $$1 % 90 == 0 && $$1 / 90 <= 3) {
            return $$1;
         } else {
            throw new JsonParseException("Invalid rotation " + $$1 + " found, only 0/90/180/270 allowed");
         }
      }

      @Nullable
      private float[] b(JsonObject $$0) {
         if (!$$0.has("uv")) {
            return null;
         } else {
            JsonArray $$1 = ayt.v($$0, "uv");
            if ($$1.size() != 4) {
               throw new JsonParseException("Expected 4 uv values, found: " + $$1.size());
            } else {
               float[] $$2 = new float[4];

               for (int $$3 = 0; $$3 < $$2.length; $$3++) {
                  $$2[$$3] = ayt.e($$1.get($$3), "uv[" + $$3 + "]");
               }

               return $$2;
            }
         }
      }
   }
}

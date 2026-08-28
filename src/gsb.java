import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public record gsb(Vector3fc b, Vector3fc c, Vector3fc d) {
   public static final gsb a = new gsb(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));

   public void a(boolean $$0, fjy.a $$1) {
      if (this == a) {
         $$1.a(-0.5F, -0.5F, -0.5F);
      } else {
         float $$2;
         float $$3;
         float $$4;
         if ($$0) {
            $$2 = -this.c.x();
            $$3 = -this.b.y();
            $$4 = -this.b.z();
         } else {
            $$2 = this.c.x();
            $$3 = this.b.y();
            $$4 = this.b.z();
         }

         $$1.a($$2, this.c.y(), this.c.z());
         $$1.a(new Quaternionf().rotationXYZ(this.b.x() * (float) (Math.PI / 180.0), $$3 * (float) (Math.PI / 180.0), $$4 * (float) (Math.PI / 180.0)));
         $$1.b(this.d.x(), this.d.y(), this.d.z());
         $$1.a(-0.5F, -0.5F, -0.5F);
      }
   }

   public Vector3fc a() {
      return this.b;
   }

   public Vector3fc b() {
      return this.c;
   }

   public Vector3fc c() {
      return this.d;
   }

   protected static class a implements JsonDeserializer<gsb> {
      private static final Vector3f c = new Vector3f(0.0F, 0.0F, 0.0F);
      private static final Vector3f d = new Vector3f(0.0F, 0.0F, 0.0F);
      private static final Vector3f e = new Vector3f(1.0F, 1.0F, 1.0F);
      public static final float a = 5.0F;
      public static final float b = 4.0F;

      public gsb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Vector3f $$4 = this.a($$3, "rotation", c);
         Vector3f $$5 = this.a($$3, "translation", d);
         $$5.mul(0.0625F);
         $$5.set(azm.a($$5.x, -5.0F, 5.0F), azm.a($$5.y, -5.0F, 5.0F), azm.a($$5.z, -5.0F, 5.0F));
         Vector3f $$6 = this.a($$3, "scale", e);
         $$6.set(azm.a($$6.x, -4.0F, 4.0F), azm.a($$6.y, -4.0F, 4.0F), azm.a($$6.z, -4.0F, 4.0F));
         return new gsb($$4, $$5, $$6);
      }

      private Vector3f a(JsonObject $$0, String $$1, Vector3f $$2) {
         if (!$$0.has($$1)) {
            return $$2;
         } else {
            JsonArray $$3 = azc.v($$0, $$1);
            if ($$3.size() != 3) {
               throw new JsonParseException("Expected 3 " + $$1 + " values, found: " + $$3.size());
            } else {
               float[] $$4 = new float[3];

               for (int $$5 = 0; $$5 < $$4.length; $$5++) {
                  $$4[$$5] = azc.e($$3.get($$5), $$1 + "[" + $$5 + "]");
               }

               return new Vector3f($$4[0], $$4[1], $$4[2]);
            }
         }
      }
   }
}

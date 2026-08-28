import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public record gth(Vector3fc a, Vector3fc b, Map<jb, gti> c, @Nullable gtj d, boolean e, int f) {
   private static final boolean g = false;
   private static final float h = -16.0F;
   private static final float i = 32.0F;

   public gth(Vector3fc $$0, Vector3fc $$1, Map<jb, gti> $$2) {
      this($$0, $$1, $$2, null, true, 0);
   }

   protected static class a implements JsonDeserializer<gth> {
      private static final boolean a = true;
      private static final int b = 0;

      public gth a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Vector3f $$4 = this.e($$3);
         Vector3f $$5 = this.d($$3);
         gtj $$6 = this.a($$3);
         Map<jb, gti> $$7 = this.a($$2, $$3);
         if ($$3.has("shade") && !aze.c($$3, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
         } else {
            boolean $$8 = aze.a($$3, "shade", true);
            int $$9 = 0;
            if ($$3.has("light_emission")) {
               boolean $$10 = aze.b($$3, "light_emission");
               if ($$10) {
                  $$9 = aze.o($$3, "light_emission");
               }

               if (!$$10 || $$9 < 0 || $$9 > 15) {
                  throw new JsonParseException("Expected light_emission to be an Integer between (inclusive) 0 and 15");
               }
            }

            return new gth($$4, $$5, $$7, $$6, $$8, $$9);
         }
      }

      @Nullable
      private gtj a(JsonObject $$0) {
         gtj $$1 = null;
         if ($$0.has("rotation")) {
            JsonObject $$2 = aze.u($$0, "rotation");
            Vector3f $$3 = this.a($$2, "origin");
            $$3.mul(0.0625F);
            jb.a $$4 = this.c($$2);
            float $$5 = this.b($$2);
            boolean $$6 = aze.a($$2, "rescale", false);
            $$1 = new gtj($$3, $$4, $$5, $$6);
         }

         return $$1;
      }

      private float b(JsonObject $$0) {
         float $$1 = aze.m($$0, "angle");
         if ($$1 != 0.0F && azo.e($$1) != 22.5F && azo.e($$1) != 45.0F) {
            throw new JsonParseException("Invalid rotation " + $$1 + " found, only -45/-22.5/0/22.5/45 allowed");
         } else {
            return $$1;
         }
      }

      private jb.a c(JsonObject $$0) {
         String $$1 = aze.i($$0, "axis");
         jb.a $$2 = jb.a.a($$1.toLowerCase(Locale.ROOT));
         if ($$2 == null) {
            throw new JsonParseException("Invalid rotation axis: " + $$1);
         } else {
            return $$2;
         }
      }

      private Map<jb, gti> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<jb, gti> $$2 = this.b($$0, $$1);
         if ($$2.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
         } else {
            return $$2;
         }
      }

      private Map<jb, gti> b(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<jb, gti> $$2 = Maps.newEnumMap(jb.class);
         JsonObject $$3 = aze.u($$1, "faces");

         for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
            jb $$5 = this.a($$4.getKey());
            $$2.put($$5, (gti)$$0.deserialize($$4.getValue(), gti.class));
         }

         return $$2;
      }

      private jb a(String $$0) {
         jb $$1 = jb.a($$0);
         if ($$1 == null) {
            throw new JsonParseException("Unknown facing: " + $$0);
         } else {
            return $$1;
         }
      }

      private Vector3f d(JsonObject $$0) {
         Vector3f $$1 = this.a($$0, "to");
         if (!($$1.x() < -16.0F) && !($$1.y() < -16.0F) && !($$1.z() < -16.0F) && !($$1.x() > 32.0F) && !($$1.y() > 32.0F) && !($$1.z() > 32.0F)) {
            return $$1;
         } else {
            throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + $$1);
         }
      }

      private Vector3f e(JsonObject $$0) {
         Vector3f $$1 = this.a($$0, "from");
         if (!($$1.x() < -16.0F) && !($$1.y() < -16.0F) && !($$1.z() < -16.0F) && !($$1.x() > 32.0F) && !($$1.y() > 32.0F) && !($$1.z() > 32.0F)) {
            return $$1;
         } else {
            throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + $$1);
         }
      }

      private Vector3f a(JsonObject $$0, String $$1) {
         JsonArray $$2 = aze.v($$0, $$1);
         if ($$2.size() != 3) {
            throw new JsonParseException("Expected 3 " + $$1 + " values, found: " + $$2.size());
         } else {
            float[] $$3 = new float[3];

            for (int $$4 = 0; $$4 < $$3.length; $$4++) {
               $$3[$$4] = aze.e($$2.get($$4), $$1 + "[" + $$4 + "]");
            }

            return new Vector3f($$3[0], $$3[1], $$3[2]);
         }
      }
   }
}

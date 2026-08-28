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

public class gis {
   private static final boolean g = false;
   private static final float h = -16.0F;
   private static final float i = 32.0F;
   public final Vector3f a;
   public final Vector3f b;
   public final Map<jk, git> c;
   public final giu d;
   public final boolean e;
   public final int f;

   public gis(Vector3f $$0, Vector3f $$1, Map<jk, git> $$2) {
      this($$0, $$1, $$2, null, true, 0);
   }

   public gis(Vector3f $$0, Vector3f $$1, Map<jk, git> $$2, @Nullable giu $$3, boolean $$4, int $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.a();
   }

   private void a() {
      for (Entry<jk, git> $$0 : this.c.entrySet()) {
         float[] $$1 = this.a($$0.getKey());
         $$0.getValue().d().a($$1);
      }
   }

   private float[] a(jk $$0) {
      switch ($$0) {
         case a:
            return new float[]{this.a.x(), 16.0F - this.b.z(), this.b.x(), 16.0F - this.a.z()};
         case b:
            return new float[]{this.a.x(), this.a.z(), this.b.x(), this.b.z()};
         case c:
         default:
            return new float[]{16.0F - this.b.x(), 16.0F - this.b.y(), 16.0F - this.a.x(), 16.0F - this.a.y()};
         case d:
            return new float[]{this.a.x(), 16.0F - this.b.y(), this.b.x(), 16.0F - this.a.y()};
         case e:
            return new float[]{this.a.z(), 16.0F - this.b.y(), this.b.z(), 16.0F - this.a.y()};
         case f:
            return new float[]{16.0F - this.b.z(), 16.0F - this.b.y(), 16.0F - this.a.z(), 16.0F - this.a.y()};
      }
   }

   protected static class a implements JsonDeserializer<gis> {
      private static final boolean a = true;
      private static final int b = 0;

      public gis a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         Vector3f $$4 = this.e($$3);
         Vector3f $$5 = this.d($$3);
         giu $$6 = this.a($$3);
         Map<jk, git> $$7 = this.a($$2, $$3);
         if ($$3.has("shade") && !ayv.c($$3, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
         } else {
            boolean $$8 = ayv.a($$3, "shade", true);
            int $$9 = 0;
            if ($$3.has("light_emission")) {
               boolean $$10 = ayv.b($$3, "light_emission");
               if ($$10) {
                  $$9 = ayv.o($$3, "light_emission");
               }

               if (!$$10 || $$9 < 0 || $$9 > 15) {
                  throw new JsonParseException("Expected light_emission to be an Integer between (inclusive) 0 and 15");
               }
            }

            return new gis($$4, $$5, $$7, $$6, $$8, $$9);
         }
      }

      @Nullable
      private giu a(JsonObject $$0) {
         giu $$1 = null;
         if ($$0.has("rotation")) {
            JsonObject $$2 = ayv.u($$0, "rotation");
            Vector3f $$3 = this.a($$2, "origin");
            $$3.mul(0.0625F);
            jk.a $$4 = this.c($$2);
            float $$5 = this.b($$2);
            boolean $$6 = ayv.a($$2, "rescale", false);
            $$1 = new giu($$3, $$4, $$5, $$6);
         }

         return $$1;
      }

      private float b(JsonObject $$0) {
         float $$1 = ayv.m($$0, "angle");
         if ($$1 != 0.0F && azf.e($$1) != 22.5F && azf.e($$1) != 45.0F) {
            throw new JsonParseException("Invalid rotation " + $$1 + " found, only -45/-22.5/0/22.5/45 allowed");
         } else {
            return $$1;
         }
      }

      private jk.a c(JsonObject $$0) {
         String $$1 = ayv.i($$0, "axis");
         jk.a $$2 = jk.a.a($$1.toLowerCase(Locale.ROOT));
         if ($$2 == null) {
            throw new JsonParseException("Invalid rotation axis: " + $$1);
         } else {
            return $$2;
         }
      }

      private Map<jk, git> a(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<jk, git> $$2 = this.b($$0, $$1);
         if ($$2.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
         } else {
            return $$2;
         }
      }

      private Map<jk, git> b(JsonDeserializationContext $$0, JsonObject $$1) {
         Map<jk, git> $$2 = Maps.newEnumMap(jk.class);
         JsonObject $$3 = ayv.u($$1, "faces");

         for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
            jk $$5 = this.a($$4.getKey());
            $$2.put($$5, (git)$$0.deserialize($$4.getValue(), git.class));
         }

         return $$2;
      }

      private jk a(String $$0) {
         jk $$1 = jk.a($$0);
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
         JsonArray $$2 = ayv.v($$0, $$1);
         if ($$2.size() != 3) {
            throw new JsonParseException("Expected 3 " + $$1 + " values, found: " + $$2.size());
         } else {
            float[] $$3 = new float[3];

            for (int $$4 = 0; $$4 < $$3.length; $$4++) {
               $$3[$$4] = ayv.e($$2.get($$4), $$1 + "[" + $$4 + "]");
            }

            return new Vector3f($$3[0], $$3[1], $$3[2]);
         }
      }
   }
}

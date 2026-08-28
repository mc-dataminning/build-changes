import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gos(aku a, j b, boolean c, int d) implements hih {
   @Override
   public j a() {
      return this.b;
   }

   @Override
   public boolean b() {
      return this.c;
   }

   public aku c() {
      return this.a;
   }

   public j d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public static class a implements JsonDeserializer<gos> {
      @VisibleForTesting
      static final boolean a = false;
      @VisibleForTesting
      static final int b = 1;
      @VisibleForTesting
      static final int c = 0;
      @VisibleForTesting
      static final int d = 0;

      public gos a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         aku $$4 = this.b($$3);
         hhs $$5 = this.a($$3);
         boolean $$6 = this.d($$3);
         int $$7 = this.c($$3);
         return new gos($$4, $$5.a(), $$6, $$7);
      }

      private boolean d(JsonObject $$0) {
         return ayp.a($$0, "uvlock", false);
      }

      protected hhs a(JsonObject $$0) {
         int $$1 = ayp.a($$0, "x", 0);
         int $$2 = ayp.a($$0, "y", 0);
         hhs $$3 = hhs.a($$1, $$2);
         if ($$3 == null) {
            throw new JsonParseException("Invalid BlockModelRotation x: " + $$1 + ", y: " + $$2);
         } else {
            return $$3;
         }
      }

      protected aku b(JsonObject $$0) {
         return aku.a(ayp.i($$0, "model"));
      }

      protected int c(JsonObject $$0) {
         int $$1 = ayp.a($$0, "weight", 1);
         if ($$1 < 1) {
            throw new JsonParseException("Invalid weight " + $$1 + " found, expected integer >= 1");
         } else {
            return $$1;
         }
      }
   }
}

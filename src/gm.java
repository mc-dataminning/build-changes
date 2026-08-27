import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class gm implements gg<FloatArgumentType, gm.a> {
   public void a(gm.a $$0, si $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.k(gi.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public gm.a a(si $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = gi.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = gi.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new gm.a($$2, $$3);
   }

   public void a(gm.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public gm.a a(FloatArgumentType $$0) {
      return new gm.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gg.a<FloatArgumentType> {
      final float b;
      final float c;

      a(float $$1, float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(dl $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public gg<FloatArgumentType, ?> a() {
         return gm.this;
      }
   }
}

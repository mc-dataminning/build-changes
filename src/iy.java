import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class iy implements is<FloatArgumentType, iy.a> {
   public void a(iy.a $$0, wg $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.l(iu.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public iy.a a(wg $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = iu.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = iu.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new iy.a($$2, $$3);
   }

   public void a(iy.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public iy.a a(FloatArgumentType $$0) {
      return new iy.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements is.a<FloatArgumentType> {
      final float b;
      final float c;

      a(final float $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(es $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public is<FloatArgumentType, ?> a() {
         return iy.this;
      }
   }
}

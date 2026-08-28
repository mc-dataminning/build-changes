import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class ja implements iu<FloatArgumentType, ja.a> {
   public void a(ja.a $$0, vr $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.l(iw.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public ja.a a(vr $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = iw.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = iw.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new ja.a($$2, $$3);
   }

   public void a(ja.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ja.a a(FloatArgumentType $$0) {
      return new ja.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements iu.a<FloatArgumentType> {
      final float b;
      final float c;

      a(final float $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(et $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public iu<FloatArgumentType, ?> a() {
         return ja.this;
      }
   }
}

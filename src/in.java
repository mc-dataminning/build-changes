import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class in implements ih<FloatArgumentType, in.a> {
   public void a(in.a $$0, vy $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.l(ij.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public in.a a(vy $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = ij.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = ij.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new in.a($$2, $$3);
   }

   public void a(in.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public in.a a(FloatArgumentType $$0) {
      return new in.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ih.a<FloatArgumentType> {
      final float b;
      final float c;

      a(final float $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(eg $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public ih<FloatArgumentType, ?> a() {
         return in.this;
      }
   }
}

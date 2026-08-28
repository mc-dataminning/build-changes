import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class il implements ie<FloatArgumentType, il.a> {
   public void a(il.a $$0, vu $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.l(ih.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public il.a a(vu $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = ih.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = ih.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new il.a($$2, $$3);
   }

   public void a(il.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public il.a a(FloatArgumentType $$0) {
      return new il.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ie.a<FloatArgumentType> {
      final float b;
      final float c;

      a(final float $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(ee $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public ie<FloatArgumentType, ?> a() {
         return il.this;
      }
   }
}

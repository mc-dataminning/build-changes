import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ix implements is<DoubleArgumentType, ix.a> {
   public void a(ix.a $$0, wh $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.l(iu.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public ix.a a(wh $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = iu.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = iu.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new ix.a($$2, $$3);
   }

   public void a(ix.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ix.a a(DoubleArgumentType $$0) {
      return new ix.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements is.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(final double $$1, final double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(es $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public is<DoubleArgumentType, ?> a() {
         return ix.this;
      }
   }
}

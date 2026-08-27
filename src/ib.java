import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ib implements hw<DoubleArgumentType, ib.a> {
   public void a(ib.a $$0, vs $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.k(hy.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public ib.a a(vs $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = hy.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = hy.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new ib.a($$2, $$3);
   }

   public void a(ib.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ib.a a(DoubleArgumentType $$0) {
      return new ib.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hw.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(double $$1, double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(dy $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public hw<DoubleArgumentType, ?> a() {
         return ib.this;
      }
   }
}

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class gl implements gg<DoubleArgumentType, gl.a> {
   public void a(gl.a $$0, si $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.k(gi.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public gl.a a(si $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = gi.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = gi.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new gl.a($$2, $$3);
   }

   public void a(gl.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public gl.a a(DoubleArgumentType $$0) {
      return new gl.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gg.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(double $$1, double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(dl $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public gg<DoubleArgumentType, ?> a() {
         return gl.this;
      }
   }
}

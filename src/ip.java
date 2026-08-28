import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ip implements ik<DoubleArgumentType, ip.a> {
   public void a(ip.a $$0, wm $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.k(im.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public ip.a a(wm $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = im.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = im.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new ip.a($$2, $$3);
   }

   public void a(ip.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ip.a a(DoubleArgumentType $$0) {
      return new ip.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ik.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(final double $$1, final double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(el $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public ik<DoubleArgumentType, ?> a() {
         return ip.this;
      }
   }
}

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class iz implements iu<DoubleArgumentType, iz.a> {
   public void a(iz.a $$0, vr $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.l(iw.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public iz.a a(vr $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = iw.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = iw.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new iz.a($$2, $$3);
   }

   public void a(iz.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public iz.a a(DoubleArgumentType $$0) {
      return new iz.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements iu.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(final double $$1, final double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(et $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public iu<DoubleArgumentType, ?> a() {
         return iz.this;
      }
   }
}

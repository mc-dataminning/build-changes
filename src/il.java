import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class il implements ig<DoubleArgumentType, il.a> {
   public void a(il.a $$0, vu $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.l(ii.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public il.a a(vu $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = ii.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = ii.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new il.a($$2, $$3);
   }

   public void a(il.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public il.a a(DoubleArgumentType $$0) {
      return new il.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ig.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(final double $$1, final double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(ef $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public ig<DoubleArgumentType, ?> a() {
         return il.this;
      }
   }
}

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class gn implements gg<IntegerArgumentType, gn.a> {
   public void a(gn.a $$0, si $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(gi.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public gn.a a(si $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = gi.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = gi.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new gn.a($$2, $$3);
   }

   public void a(gn.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public gn.a a(IntegerArgumentType $$0) {
      return new gn.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gg.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(dl $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public gg<IntegerArgumentType, ?> a() {
         return gn.this;
      }
   }
}

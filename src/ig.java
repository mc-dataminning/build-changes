import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class ig implements hy<IntegerArgumentType, ig.a> {
   public void a(ig.a $$0, vx $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(ia.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public ig.a a(vx $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = ia.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = ia.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new ig.a($$2, $$3);
   }

   public void a(ig.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ig.a a(IntegerArgumentType $$0) {
      return new ig.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hy.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(ea $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public hy<IntegerArgumentType, ?> a() {
         return ig.this;
      }
   }
}

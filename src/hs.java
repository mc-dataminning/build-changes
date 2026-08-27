import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class hs implements hl<IntegerArgumentType, hs.a> {
   public void a(hs.a $$0, uq $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(hn.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public hs.a a(uq $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = hn.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = hn.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new hs.a($$2, $$3);
   }

   public void a(hs.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public hs.a a(IntegerArgumentType $$0) {
      return new hs.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hl.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(dq $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public hl<IntegerArgumentType, ?> a() {
         return hs.this;
      }
   }
}

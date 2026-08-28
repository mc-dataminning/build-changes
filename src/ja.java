import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class ja implements it<IntegerArgumentType, ja.a> {
   public void a(ja.a $$0, vl $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.l(iv.a($$2, $$3));
      if ($$2) {
         $$1.q($$0.b);
      }

      if ($$3) {
         $$1.q($$0.c);
      }
   }

   public ja.a a(vl $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = iv.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = iv.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new ja.a($$2, $$3);
   }

   public void a(ja.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ja.a a(IntegerArgumentType $$0) {
      return new ja.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements it.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(final int $$1, final int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(et $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public it<IntegerArgumentType, ?> a() {
         return ja.this;
      }
   }
}

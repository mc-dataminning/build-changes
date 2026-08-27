import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class ho implements hh<IntegerArgumentType, ho.a> {
   public void a(ho.a $$0, ue $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(hj.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public ho.a a(ue $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = hj.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = hj.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new ho.a($$2, $$3);
   }

   public void a(ho.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ho.a a(IntegerArgumentType $$0) {
      return new ho.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hh.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(dn $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public hh<IntegerArgumentType, ?> a() {
         return ho.this;
      }
   }
}

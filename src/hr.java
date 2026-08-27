import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class hr implements hj<LongArgumentType, hr.a> {
   public void a(hr.a $$0, ug $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.k(hl.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public hr.a a(ug $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = hl.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = hl.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new hr.a($$2, $$3);
   }

   public void a(hr.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public hr.a a(LongArgumentType $$0) {
      return new hr.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hj.a<LongArgumentType> {
      final long b;
      final long c;

      a(long $$1, long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(dn $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public hj<LongArgumentType, ?> a() {
         return hr.this;
      }
   }
}

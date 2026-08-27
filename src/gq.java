import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class gq implements gi<LongArgumentType, gq.a> {
   public void a(gq.a $$0, sp $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.k(gk.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public gq.a a(sp $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = gk.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = gk.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new gq.a($$2, $$3);
   }

   public void a(gq.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public gq.a a(LongArgumentType $$0) {
      return new gq.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gi.a<LongArgumentType> {
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
      public gi<LongArgumentType, ?> a() {
         return gq.this;
      }
   }
}

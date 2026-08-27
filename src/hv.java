import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class hv implements hn<LongArgumentType, hv.a> {
   public void a(hv.a $$0, uu $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.k(hp.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public hv.a a(uu $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = hp.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = hp.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new hv.a($$2, $$3);
   }

   public void a(hv.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public hv.a a(LongArgumentType $$0) {
      return new hv.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hn.a<LongArgumentType> {
      final long b;
      final long c;

      a(long $$1, long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(dq $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public hn<LongArgumentType, ?> a() {
         return hv.this;
      }
   }
}

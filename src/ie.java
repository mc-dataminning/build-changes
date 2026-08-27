import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class ie implements hw<LongArgumentType, ie.a> {
   public void a(ie.a $$0, vs $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.k(hy.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public ie.a a(vs $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = hy.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = hy.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new ie.a($$2, $$3);
   }

   public void a(ie.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ie.a a(LongArgumentType $$0) {
      return new ie.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hw.a<LongArgumentType> {
      final long b;
      final long c;

      a(long $$1, long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(dy $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public hw<LongArgumentType, ?> a() {
         return ie.this;
      }
   }
}

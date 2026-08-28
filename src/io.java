import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class io implements ig<LongArgumentType, io.a> {
   public void a(io.a $$0, vu $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.l(ii.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public io.a a(vu $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = ii.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = ii.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new io.a($$2, $$3);
   }

   public void a(io.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public io.a a(LongArgumentType $$0) {
      return new io.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ig.a<LongArgumentType> {
      final long b;
      final long c;

      a(final long $$1, final long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(ef $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public ig<LongArgumentType, ?> a() {
         return io.this;
      }
   }
}

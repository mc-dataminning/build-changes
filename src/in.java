import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class in implements ie<LongArgumentType, in.a> {
   public void a(in.a $$0, vu $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.l(ih.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public in.a a(vu $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = ih.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = ih.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new in.a($$2, $$3);
   }

   public void a(in.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public in.a a(LongArgumentType $$0) {
      return new in.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ie.a<LongArgumentType> {
      final long b;
      final long c;

      a(final long $$1, final long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(ee $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public ie<LongArgumentType, ?> a() {
         return in.this;
      }
   }
}
